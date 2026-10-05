package com.aguilar.saborapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aguilar.saborapp.databinding.ActivityMesasBinding

class MesasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMesasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMesasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}