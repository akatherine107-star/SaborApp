package com.aguilar.saborapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aguilar.saborapp.databinding.ActivityReportesBinding

class ReportesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReportesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}