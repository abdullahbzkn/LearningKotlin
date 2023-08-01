package com.abdbzkn.section6
//import android.content.Intent //aktivite degistirebiliriz ve veri yollayabiliriz
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.view.View
import android.widget.EditText
import com.abdbzkn.section6.databinding.ActivityMainBinding
import javax.net.ssl.SSLSessionBindingEvent


//import kotlinx.android.synthetic.main.activity_main.* //eklendi githbudan

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        //setContentView(view)
        setContentView(binding.root)
        println("onCreate çağırıldı")
        //onCreate içi
    }
    override fun onStart() {
        super.onStart()
        println("onStart çağırıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çağırıldı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çağırıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çağırıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağırıldı")
    }

    fun aktiviteDegistir( view: View){
        val kullaniciVerisi = binding.editText.text.toString()

        val intent = Intent(applicationContext,IkinciActivity::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish() //cok onemli arka arkaya cagirilirsa program cokebilir hafiza yonetimi
    }


//AndroidManifest.xml içinde *--***---*****---***--*
    /*
     <intent-filter>       Bu neredeyse orası main aktivitedir şuan main activity içinde
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
     */

    //MainActivity içi
}
