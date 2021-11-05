package com.insan.uts_insanmaulana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailAndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_android)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val android = intent.getParcelableExtra<Android>(MainActivity.INTENT_PARCELABLE)

        val imgAndroid = findViewById<ImageView>(R.id.img_item_photo)
        val nameAndroid = findViewById<TextView>(R.id.tv_item_name)
        val descAndroid = findViewById<TextView>(R.id.tv_item_description)

        imgAndroid.setImageResource(android?.imgAndroid!!)
        nameAndroid.text = android.nameAndroid
        descAndroid.text = android.descAndroid

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}