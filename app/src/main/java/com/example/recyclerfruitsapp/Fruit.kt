package com.example.recyclerfruitsapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fruit
    (val fruitName:String,
     val fruitImage:Int,
     val fruitNutritionalValue:String?
     ):Parcelable