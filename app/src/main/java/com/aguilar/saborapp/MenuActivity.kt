package com.aguilar.saborapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aguilar.saborapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("EXTRA_USERNAME") ?: "admin"
        setupUI(username)
        setupListeners()
    }

    private fun setupUI(username: String) {
        binding.tvWelcomeUser.text = getString(R.string.welcome_user, username)
        if (username.isNotEmpty()) {
            binding.tvAvatarLetter.text = username.first().uppercase()
        }
    }

    private fun setupListeners() {
        binding.cardPlatos.setOnClickListener {
            startActivity(Intent(this, PlatosActivity::class.java))
        }

        binding.cardMesas.setOnClickListener {
            startActivity(Intent(this, MesasActivity::class.java))
        }

        binding.cardPedidos.setOnClickListener {
            startActivity(Intent(this, PedidosActivity::class.java))
        }

        binding.cardReportes.setOnClickListener {
            startActivity(Intent(this, ReportesActivity::class.java))
        }

        binding.btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}