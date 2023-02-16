package com.example.dz83month.cat_adapter

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnLongClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz83month.CatModel
import com.example.dz83month.OnItemClickListener
import com.example.dz83month.databinding.ItemCatBinding

class LanguageAdapter (
    private val listCat : MutableList<CatModel>,
    private val onItemClickListener: OnItemClickListener
): RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>(),OnLongClickListener {
   inner class LanguageViewHolder(var binding: ItemCatBinding): RecyclerView.ViewHolder(binding.root) {
        fun onBind(catModel: CatModel) {
            binding.txtName.text = catModel.name
            Glide.with(binding.imageCat.context).load(catModel.image).into(binding.imageCat)
            itemView.setOnClickListener {
                onItemClickListener.onClick(catModel)
                binding.txtName.text = catModel.toString()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        return LanguageViewHolder(ItemCatBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.onBind(listCat[position])
        holder.itemView.setOnLongClickListener(this)
        holder.itemView.setOnLongClickListener {
            listCat.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
            true
        }
    }

    override fun getItemCount(): Int= listCat.size
    override fun onLongClick(v: View?): Boolean {
       onItemClickListener.onLongClick(v?.tag as CatModel)
        return true
    }


}
