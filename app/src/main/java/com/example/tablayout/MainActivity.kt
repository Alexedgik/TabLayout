package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.holder, MainFragment.newInstance()).commit()
    }
}