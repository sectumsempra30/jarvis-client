package com.bugmakers.jarvistime.presentation.pages.login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bugmakers.jarvistime.R
import com.bugmakers.jarvistime.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {

    private val viewModel = LogInActivityViewModel()

    private lateinit var binding: ActivityLogInBinding

    companion object {
        fun getIntent(context : Context) = Intent(context, this::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_log_in)
    }


}
