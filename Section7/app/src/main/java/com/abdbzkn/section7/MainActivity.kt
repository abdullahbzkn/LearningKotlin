package com.abdbzkn.section7
import android.app.AlertDialog
import android.content.DialogInterface
import com.abdbzkn.section7.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Toast mesajı , Alert
        //applicationContext -> app context uygulamanın contexti
        //this , this@MainActivity -> aktivitenin contexti
        Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()
        //dogru yol dokumantasyondan kontrol edip uygun contexti vermek mantıklı olan da aktivite konteksti ile başla ve sonra appcontexte geç hata alırsan

    }
    fun mesajGoster(view: View) {
    val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("Şifre Hatası")
        uyariMesaji.setMessage("Şifreyi giremediniz, baştan denemek ister misiniz?")
        //lambda gösterimi
        uyariMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener{dialogInterface, i ->
            //evete tıklanınca burası olucak
            Toast.makeText(this,"Baştan Deniyorsunuz",Toast.LENGTH_LONG).show()

        })
        uyariMesaji.setNegativeButton("Hayır"){ dialogInterface, i ->
            //hayıra tıklanırsa burası olucak
            Toast.makeText(this,"Hayırı Seçtiniz, Denyemiyorsunuz",Toast.LENGTH_LONG).show()
        }
        uyariMesaji.show()


    }
}