package com.example.a619710.churrasscoree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlideApp.with(this)
                .load("https://p2.trrsf.com/image/fget/cf/940/0/images.terra.com/2014/07/28/05mussumespecialprints.jpg" )
                .placeholder(R.mipmap.ic_launcher)
                .into(imgLogoApp)

        Handler().postDelayed({
            val Churras = Intent(this, Churras::class.java)
            startActivity(Churras)
            finish()
        }, 200)
    }
}
