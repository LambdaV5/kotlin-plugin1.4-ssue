package com.example.kotlintojava14issue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvContent = findViewById<RecyclerView>(R.id.rv_content)
        val adapter = TestAdapter()
        rvContent.adapter=adapter

        val data = MutableList(10) { "" }
        adapter.setList(data)
    }
}