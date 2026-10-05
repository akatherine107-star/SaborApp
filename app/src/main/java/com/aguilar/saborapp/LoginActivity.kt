package com.aguilar.saborapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.aguilar.saborapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        // Limpiar errores al digitar
        binding.etUsername.doOnTextChanged { _, _, _, _ ->
            binding.tilUsername.error = null
        }
        binding.etPassword.doOnTextChanged { _, _, _, _ ->
            binding.tilPassword.error = null
        }

        binding.btnLogin.setOnClickListener {
            validateAndLogin()
        }
    }

    private fun validateAndLogin() {
        val username = binding.etUsername.text.toString().trim()
        val password = binding.etPassword.text.toString().trim()

        var isValid = true

        if (username.isEmpty()) {
            binding.tilUsername.error = getString(R.string.err_empty_user)
            isValid = false
        }

        if (password.isEmpty()) {
            binding.tilPassword.error = getString(R.string.err_empty_pass)
            isValid = false
        }

        if (!isValid) return

        // Validación de credenciales
        if ((username == "admin") && (password == "1234")) {
            val intent = Intent(this, MenuActivity::class.java).apply {
                putExtra("EXTRA_USERNAME", username)
            }
            startActivity(intent)
            finish() // Cierra el Login para evitar volver atrás
        } else {
            Toast.makeText(this, R.string.err_credentials, Toast.LENGTH_SHORT).show()
        }
    }
}