package com.vishesh.sampleapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.uiLibrary.bobbleLibrary.BobbleImage

class RecyclerAdapter(private val context: Context,private val list : List<Model>):RecyclerView.Adapter<RecyclerAdapter.Beholder>() {

    private lateinit var itemClickListener: ItemClickListener

    interface ItemClickListener{
        fun onItemClicked(position: Int)
    }

    fun setOnItemClickListener(listener: ItemClickListener){
        itemClickListener = listener
    }

    inner class Beholder(itemView: View,listener: ItemClickListener):RecyclerView.ViewHolder(itemView){
        val imageView: BobbleImage = itemView.findViewById(R.id.img)
        val textView: TextView = itemView.findViewById(R.id.text)

        init {
            itemView.setOnClickListener {
                listener.onItemClicked(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.Beholder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_card, parent, false)
        return Beholder(view,itemClickListener)
    }

    override fun onBindViewHolder(holder: Beholder, position: Int) {
        val itemsViewModel = list[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImage1Drawable(ContextCompat.getDrawable(context, itemsViewModel.image))
        // sets the text to the textview from our itemHolder class
        holder.textView.text = itemsViewModel.text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}