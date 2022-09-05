package com.example.dz6_3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.dz6_3.databinding.ActivitySacondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySacondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySacondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDataMusicName()
    }

    private fun getDataMusicName() {
        val nameMusic = intent.getStringExtra("nameMusic")
        binding.tvText.text = nameMusic
    }
}