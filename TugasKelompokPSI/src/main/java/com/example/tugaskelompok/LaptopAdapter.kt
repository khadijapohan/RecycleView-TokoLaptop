package com.example.tugaskelompok

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LaptopAdapter(private var list_laptop: Array<String>, private var spesifikasi: Array<String>, private var images: IntArray) :
    RecyclerView.Adapter<LaptopAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView : ImageView = itemView.findViewById(R.id.imageView)
        var nametext: TextView = itemView.findViewById(R.id.name_text)
        var spectext: TextView = itemView.findViewById(R.id.spec_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemsView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_laptop_main, parent, false)
        return MyViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
        holder.nametext.text = list_laptop[position]
        holder.spectext.text = spesifikasi[position]

    }

    override fun getItemCount(): Int {
        return images.size
    }

}