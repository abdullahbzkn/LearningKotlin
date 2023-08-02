package com.abdbzkn.section8

import android.content.Context
import android.content.SharedPreferences
import com.abdbzkn.section8.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    var alinanKullanciAdi : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //SharedPreferences
        //veri klasöründe xml dosyası oluşturulur ve küçük veriler saklnaır xml sadece arayüz için degil veri saklamak için de kullanılır
        //bir kaç tane basit yapı/şekil kaydedebilirz
        sharedPreferences = this.getSharedPreferences("com.abdbzkn.section8", Context.MODE_PRIVATE)
        //şimdi sharedPreferencesi devreye sokucaz yani veri alındı ama sharedPreferencesdan alıp kullanmamız lazım
        alinanKullanciAdi=sharedPreferences.getString("kullanici:","") //burda string nullabil istiyor ya üstte şuan yaptıgım gibi tanımlarım ya da kesin oldugunu belirtirim unlemle
        if(alinanKullanciAdi != null){
            binding.textView.text = "Kaydedilen Kullanici Adi: ${alinanKullanciAdi}" //neden tekrar verdik cunku geri cıkıp geldiginde shareddan çekmş olduk
        }
    }
    fun kaydet(view: View){
        val kullaniciAdi = binding.editText.text.toString()
        //sharedPreferences a ulaşmam lazım o sebeple main başında sonra tanımlıycam olarak lateinit olarak oluşturdum ve sonraonccreatte oluşturmadı deger verdim artık burdan da ulaşabilirim
        if(kullaniciAdi==""){
            Toast.makeText(this,"Lütfen Bir Değer Giriniz",Toast.LENGTH_LONG).show()
        } else{
            sharedPreferences.edit().putString("kullanici:",kullaniciAdi).apply()
            binding.textView.text="Kaydedilen Kullanici Adi: ${kullaniciAdi}"
        }
    }
    fun sil(view: View  ){
        alinanKullanciAdi = sharedPreferences.getString("kullanici","")
        if(alinanKullanciAdi != null){
            binding.textView.text = "Kaydedilen Kullanici Adi: " //arayüzde silinmiş gözükücek ama veriyi gercekten sharedPreferancsdan silmem de lazım
            sharedPreferences.edit().remove("kullanici:").apply()
        }
    }
}