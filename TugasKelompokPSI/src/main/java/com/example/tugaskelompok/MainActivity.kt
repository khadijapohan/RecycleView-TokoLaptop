package com.example.tugaskelompok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var laptopAdapter: LaptopAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_laptop: Array<String> = resources.getStringArray(R.array.list_laptop)
        val spesifikasi: Array<String> = resources.getStringArray(R.array.spesifikasi)
        val images: IntArray = intArrayOf(R.drawable.asusvivobook14, R.drawable.asuse210, R.drawable.asuszenbook, R.drawable.aceraspire, R.drawable.lenovoidea3, R.drawable.msimodern, R.drawable.lenovoideaslip, R.drawable.asusrog, R.drawable.asuszenbook, R.drawable.dellinspiron)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        laptopAdapter = LaptopAdapter(list_laptop, spesifikasi, images)

        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = laptopAdapter
    }
}