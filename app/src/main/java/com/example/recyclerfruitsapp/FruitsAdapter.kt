package com.example.recyclerfruitsapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitsAdapter(private val fruitsList:List<Fruit> ): RecyclerView.Adapter<FruitsAdapter.FruitViewHolder>() {
    override fun getItemCount(): Int {
        return fruitsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val fruitView = LayoutInflater.from(parent.context).inflate(R.layout.fruit_layout,parent,false)
        return FruitViewHolder(fruitView)

    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
      val  currentFruit = fruitsList[position]
        holder.bind(currentFruit)
    }

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitName: TextView
        private val fruitImage: ImageView

        init {
            fruitName= itemView.findViewById(R.id.fruit_name_label)
            fruitImage= itemView.findViewById(R.id.fruit_image)

            itemView.setOnClickListener {
                val currentFruit =fruitsList[layoutPosition]
                val intent =Intent(itemView.context,FruitDetailsActivity::class.java)
                intent.putExtra("fruit",currentFruit)
                itemView.context.startActivity(intent)
            }

        }

        fun bind(fruit:Fruit){
            fruitName.text = fruit.fruitName
            fruitImage.setImageResource(fruit.fruitImage)
        }
    }
}