package com.abdbzkn.section11

import com.abdbzkn.section11.databinding.ActivityTanitimBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TanitimActivity : AppCompatActivity() {
    lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_tanitim)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val secilenKahramanIsmi= intent.getStringExtra("superKahramanIsmi")
        binding.textView.text = secilenKahramanIsmi
        val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        binding.imageView2.setImageBitmap(secilenGorsel)

    }
}