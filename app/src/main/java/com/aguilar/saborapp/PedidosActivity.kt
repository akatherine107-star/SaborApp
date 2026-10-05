package com.aguilar.saborapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aguilar.saborapp.databinding.ActivityPedidosBinding

class PedidosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}