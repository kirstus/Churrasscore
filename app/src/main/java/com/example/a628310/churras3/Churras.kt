package com.example.a628310.churras3

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_churras.*

class Churras : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_churras)
        //val actionBar = actionBar
        //actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true)

    }


    override fun onResume() {
        super.onResume()
        truco.setOnClickListener(){
            //Toast.makeText(this,"tecto",Toast.LENGTH_LONG).show()
            val truco = Intent(this, Truco::class.java)
            startActivity(truco)
        }
        futebol.setOnClickListener(){
            //Toast.makeText(this,"tecto",Toast.LENGTH_LONG).show()
            val fut = Intent(this, Chutegol::class.java)
            startActivity(fut)
        }
        pingpong.setOnClickListener(){
            //Toast.makeText(this,"tecto",Toast.LENGTH_LONG).show()
            val toto = Intent(this, Toto::class.java)
            startActivity(toto)
        }
    }
}
