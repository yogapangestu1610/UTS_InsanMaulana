package com.insan.uts_insanmaulana

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidAdapter(private val context: Context, private val android: List<Android>,
                     val lister: (Android) -> Unit)
    : RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder>(){
    class AndroidViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgAndroid = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameAndroid = view.findViewById<TextView>(R.id.tv_item_name)
        val descAndroid = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(android: Android, listener: (Android) -> Unit){
            imgAndroid.setImageResource(android.imgAndroid)
            nameAndroid.text = android.nameAndroid
            descAndroid.text = android.descAndroid
            itemView.setOnClickListener{
                listener(android)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder {
        return AndroidViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_pertama, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        holder.bindView(android[position], lister)
    }

    override fun getItemCount():Int = android.size



}