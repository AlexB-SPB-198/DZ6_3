package com.example.dz6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz6_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_first,MainFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_second,SecondFragment()).commit()
    }
}