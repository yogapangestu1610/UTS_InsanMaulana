package com.insan.uts_insanmaulana


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidList = listOf<Android>(
            Android(
                R.drawable.drama,
                nameAndroid = "Drama Teater",
                descAndroid = "Drama Teater Merupakan Drama yang diperankan oleh 2 orang atau lebih" +
                        "Terdapat makna surealis dan realis"

            ),
            Android(
                R.drawable.monolog,
                nameAndroid = "MONOLOG DALAM TEATER",
                descAndroid = "Monolog Merupakan Drama secara Individual atau dilakuka oleh satu orang "
            ),

            Android(
                R.drawable.gestur,
                nameAndroid = "GESTUR DALAM TEATER",
                descAndroid = "Gestur Merupakan Olah Tubuh Dalam Gerak Teater"

            ),
            Android(
                R.drawable.makeup,
                nameAndroid = "MAKEUP DALAM TEATER",
                descAndroid = "MAKEUP merupakan perubahan untuk bentuk wajah supaya lebih mendalami pengenalan tokoh karakter"
            ),
            Android(
                R.drawable.puisi,
                nameAndroid = "PUISI DALAM TEATER",
                descAndroid = "PUISI Merupakan pembacaan suatu Naskah dalam berirama"

            ),
            Android(
                R.drawable.vokal,
                nameAndroid = "VOKAL DALAM TEATER",
                descAndroid = "Olah Vokal Merupakan latihan sebelum memaikan peran dengan bertujuan melatih suara kita"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_android)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AndroidAdapter(this, androidList) {
            val intent = Intent(this, DetailAndroidActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}



