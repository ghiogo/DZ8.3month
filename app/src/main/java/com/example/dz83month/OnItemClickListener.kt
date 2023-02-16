package com.example.dz83month

interface OnItemClickListener{
    fun onClick(model: CatModel)

    fun onLongClick(textModel: CatModel) : Boolean
}