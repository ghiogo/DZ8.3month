package com.example.dz83month.repository

import com.example.dz83month.CatModel

class CinemaRepository {
    private var cinemaModelList = mutableListOf<CatModel>()

    fun getListOfCinemaHTTP(): List<CatModel> {
        cinemaModelList.add(
            CatModel(
                "https://m.media-amazon.com/images/M/MV5BMzFkM2YwOTQtYzk2" +
                        "Mi00N2VlLWE3NTItN2YwNDg1YmY0ZDNmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg",
                "Home Alone"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://lumiere-a.akamaihd.net/v1/images/au_poster_movies_" +
                        "20cs_avatar2_wayofwater_teaser_cc6f7f91.jpeg?region=0,0,540,800&width=480",
                "Avatar"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://lumiere-a.akamaihd.net/v1/images/p_cruella_21672_" +
                        "ba40c762.jpeg?region=0%2C0%2C540%2C810", "Cruella"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://api.time.com/wp-content/uploads/2014/07/301386_full1.jpg",
                "Harry Potter"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl" +
                        "5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_FMjpg_UX1000_.jpg", "Avengers"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://lumiere-a.akamaihd.net/v1/images/p_blackpanther_" +
                        "19754_4ac13f07.jpeg?region=0%2C0%2C540%2C810", "black panther"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://www.ixbt.com/img/n1/news/2022/5/5/0c3c20a8d851" +
                        "4501524a0859461f391572ea6e61_large.jpg", "Spider Man"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://media.timeout.com/images/105899643/750/422/image.jpg",
                "Merlin Monro"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://imageio.forbes.com/specials-images/imageserve/5d8e81f66de3150009a55ea8/" +
                        "Official-poster-for-Warner-s--Joker-/960x0.jpg?format=jpg&width=960",
                "Joker"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://ichef.bbci.co.uk/images/ic/320x180/p07ydttv.jpg",
                "Panda"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://lumiere-a.akamaihd.net/v1/images/ng_theterritory_keyart_" +
                        "vertical_4b14a73f.jpeg?region=0%2C0%2C1944%2C2880", "Territory"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://www.007.com/wp-content/uploads/2020/08/skyfall.jpg",
                "Sky fall"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://m.media-amazon.com/images/M/MV5BMjMwNjcxODY5OV5BMl5B" +
                        "anBnXkFtZTcwMDA1OTg4Ng@@._V1_FMjpg_UX1000_.jpg", "The Divide"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://static.hdrezka.ac/i/2022/1/8/bba23ebd0fd7ayk42q64n.jpg",
                "Adel"
            )
        )
        cinemaModelList.add(
            CatModel(
                "https://images.immediate.co.uk/remote/m.media-amazon.com/images/M/MV5BMTY0MDUwNzg5OV5BM" +
                        "l5BanBnXkFtZTgwNTY4NjU3MzI@._V1_.jpg?quality=90&fit=1382,922",
                "The babysitter"
            )
        )
        cinemaModelList.add(CatModel("https://m.media-amazon.com/images/M/MV5BM2ZmMjEyZmYtOGM4YS00YTNhLWE3ZDMtNzQxM2RhNjBlODIyXk" +
                        "EyXkFqcGdeQXVyMTUzMTg2ODkz._V1_FMjpg_UX1000_.jpg", "Wednesday"
            )
        )
        return cinemaModelList
    }
}