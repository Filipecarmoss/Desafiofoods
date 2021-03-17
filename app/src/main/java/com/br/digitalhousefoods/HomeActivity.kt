package com.br.digitalhousefoods


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       setSupportActionBar(toolbar)

        val restaurant = getRestaurants()

        recycler.layoutManager = LinearLayoutManager(this)


        val adapter = RestaurantAdapter(restaurant)
        recycler.adapter = adapter

    }

    private fun getRestaurants(): MutableList<Restaurant> {
        val restaurantList = mutableListOf<Restaurant>()

        restaurantList.add(
            Restaurant(
                "Pankes",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:0",
                R.drawable.pankes,
                getMenu()
            )
        )
        restaurantList.add(
            Restaurant(
                "Paris6 - São Paulo",
                "Rua Augusta, 1000 - São Paulos",
                "Fecha às 00:00",
                R.drawable.peris6,
                getMenu()
            )
        )
        restaurantList.add(
            Restaurant(
                "Madeiro - Pinheiro",
                "Av. Vital Brasil, 187, 187 - Pinheiros, São Paulo",
                "Fecha às 23:00",
                R.drawable.madeiro,
                getMenu()
            )
        )
        restaurantList.add(
            Restaurant(
                "MexicanoSS",
                "Barueri, 620 - São Paulo",
                "Fecha às 01:30",
                R.drawable.mexicano,
                getMenu()
            )
        )

        return restaurantList
    }

    private fun getMenu():  MutableList<Menu>{
        val menuList = mutableListOf<Menu>()

        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )
        menuList.add(
            Menu(
                "Salada com molho Gengibre",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.menu_item
            )
        )

        return menuList
    }
}