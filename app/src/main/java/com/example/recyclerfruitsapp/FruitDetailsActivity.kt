package com.example.recyclerfruitsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val fruitViewed = intent.getParcelableExtra<Fruit>("fruit")
        println("image is ${fruitViewed!!.fruitImage} and name ${fruitViewed.fruitName} and the nutrtion ${fruitViewed.fruitNutritionalValue}" )
        val fruitImg = findViewById<ImageView>(R.id.fruit_image_detail)
        val fruitName = findViewById<TextView>(R.id.fruit_name)
        val fruitNutrtion = findViewById<TextView>(R.id.nutrtion_label)




            fruitImg.setImageResource(fruitViewed.fruitImage)
            fruitName.text=fruitViewed.fruitName
            fruitNutrtion.text=fruitViewed.fruitNutritionalValue

    }
}