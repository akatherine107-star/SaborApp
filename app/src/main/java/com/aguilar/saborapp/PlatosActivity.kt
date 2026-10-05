package com.aguilar.saborapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aguilar.saborapp.databinding.ActivityPlatosBinding

class PlatosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}