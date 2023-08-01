package com.abdbzkn.section3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.isimText
import kotlinx.android.synthetic.main.activity_main.meslekText
import kotlinx.android.synthetic.main.activity_main.sonucText
import kotlinx.android.synthetic.main.activity_main.yasText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun superKahramanYap(view: View){
        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()//int olursa int olmazsa null
        val meslek = meslekText.text.toString()
        if(yas==null){
            sonucText.text = "Doğru yaşı giriniz!"
        } else {
            val superkahraman = SuperKahraman(isim,yas,meslek)
            sonucText.text = "İsim: ${superkahraman.isim} Yaş: ${superkahraman.yas} Meslek: ${superkahraman.meslek}"
        }
    }
}
/*
class MainActivity : AppCompatActivity() {
    var numara = 0
    private var isim = ""
    private var yas : Int? = null
    private var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Scope - Kapsam
        numara = 5
    }
    fun superKahramanYap(view : View){
        numara = 10

        isim = isimText.text.toString()
        yas = yasText.text.toString().toIntOrNull()
        meslek = meslekText.text.toString()

        if (yas == null) {
            sonucText.text = "Doğru Yaşı Giriniz"
        } else {
            val superkahraman = SuperKahraman(isim,yas!!,meslek)

            sonucText.text = "İsim: ${superkahraman.isim} Yaş: ${superkahraman.yas} Meslek: ${superkahraman.meslek}"
        }
    }
}
 */