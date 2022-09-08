package com.example.recyclerfruitsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerview :RecyclerView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview=findViewById(R.id.main_recycler_view)

        val listOfFruits = getListOfFruits()

        val fruitsAdapter = FruitsAdapter(listOfFruits)

        recyclerview.adapter= fruitsAdapter


    }

    private fun getListOfFruits (): List<Fruit>{
        val fruits = mutableListOf<Fruit>()

        fruits.add(Fruit("apple",R.drawable.apple_image,"keeps doctor away :)"))
        fruits.add(Fruit("banana",R.drawable.bannana_image,"potassium"))
        fruits.add(Fruit("blue berry ",R.drawable.blueberry_image,"taste bad but healthy:("))
        fruits.add(Fruit("golden berry ",R.drawable.goldenberry_image,"immune against cancer"))
        fruits.add(Fruit("grape",R.drawable.grape_image,"don't know"))
        fruits.add(Fruit("mandarin",R.drawable.mandrin_image,"vitamin c"))
        fruits.add(Fruit("peach",R.drawable.peach_image,"vitamin some thing"))
        fruits.add(Fruit("raspberries",R.drawable.respaaries_image,"don't care"))
        fruits.add(Fruit("strawberry",R.drawable.strawberry_image,"ran out of words"))
        fruits.add(Fruit("watermelon",R.drawable.watermelon_image,"best fruit ever in summer "))
        fruits.add(Fruit("wild berry",R.drawable.wildberry_image,"very expansive don't buy"))
        fruits.add(Fruit("pineapple",R.drawable.pinapple_image,"expensive too but buy"))


        return fruits
    }
}