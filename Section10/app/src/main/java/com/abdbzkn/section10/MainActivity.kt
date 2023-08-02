package com.abdbzkn.section10

import com.abdbzkn.section10.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity : AppCompatActivity() {
    var numara = 0
    var runnable : Runnable = Runnable {   }
    var handler = Handler(Looper.myLooper()!!)
    //HANDLER sınıftır arayüz ya da abstract class degil obje oluşturabiliyoruz runnable kullanka icin işe yarar bu obje esas olay runnable ancak bu da gerekli
    //RUNNABLE arayüz yani interface dir
    //Daha once gördügümüz CountDownTimer ise abstact classtı
    //ikisinin de kullanım şekli syntax benzer object : ...


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
    fun baslat(view: View){
        numara = 0
        runnable= object : Runnable{
            override fun run() {
                numara = numara+1
                binding.textView.text="Sayaç: ${numara}"
                handler.postDelayed(runnable,1000) //bu satır da handler çalıştırdıgı için devamlı çalıştırılıyor
            }

        }

        handler.post(runnable) //runnable ı çalıştırır //yani görevi runnable ı kullanmayı mümkün hale getirmek

    }
    fun durdur(view: View){
        handler.removeCallbacks(runnable)
    }






}
