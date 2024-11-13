package com.example.mobile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class IntroActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_intro)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Main2Activity::class.java))
        }, 1000)
    }
}