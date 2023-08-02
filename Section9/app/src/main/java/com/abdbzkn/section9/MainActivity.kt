package com.abdbzkn.section9

import com.abdbzkn.section9.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        lateinit var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Abstract Class
        object : CountDownTimer(15000,1000){
            //bilinmeyen bir sınıf ile uygulayabiliyoruz ilk parametre kaç mili saniye saysın onu sorar sn/1000 = mili saniye ikinci parametre kaç milisaniyede bir göstersin
            override fun onFinish(){
                binding.textView.text="Kalan: 0"
            }
            override fun onTick(p0: Long){
                binding.textView.text="Kalan: ${p0/1000}"
            }
        }.start()
    }
}