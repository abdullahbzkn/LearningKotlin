package com.abdbzkn.section14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdbzkn.section14.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //try chat
        try {
        //öncelikle veri tabanımızı oluşturalım
            val veritabani = this.openOrCreateDatabase("Urunler", MODE_PRIVATE,null)
            //yani varsa aç yoksa oluştur database mi aynı shared daki syntax var
            veritabani.execSQL("CREATE TABLE IF NOT EXISTS urunler(id INTEGER PRIMARY KEY,isim VARCHAR,fiyat INT)")
            //execute sqlite
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Ayakkabi',100)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Elbise',70)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Mont',80)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Pantolon',150)")
            //veritabani.execSQL("INSERT INTO urunler (isim, fiyat) VALUES ('Ceket',90)")
            //oluşturup bir kez çalıştırdım ve comment line yaptım ki tekrar tekrar eklemesin diye ve şimdi cursor ile okuycam QUERY



            //veritabani.execSQL("DELETE FROM urunler WHERE id = 5")
            //silme işlemi

            //veritabani.execSQL("UPDATE urunler SET isim='Ayakkab' WHERE id = 1")
            //veritabani.execSQL("UPDATE urunler SET fiyat=250 WHERE isim ='Elbise'")
            //guncelleme






            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE isim LIKE '%t'" , null)
            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE isim LIKE 'A%'" , null)
            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE iD = 2" , null)
            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE isim = 'Ceket'" , null)
            val cursor = veritabani.rawQuery("SELECT * FROM urunler" , null)




            //filtreleme yapmak icin null degistirebiliriz
            //şuan hangi veri hangi konumda onu bilmiyoruz
            //onu bulup imleç cursor dedigimiz yontemle verileri alabilir hale gelicez
            val idColumnIndex = cursor.getColumnIndex("id")
            val isimColumnIndex = cursor.getColumnIndex("isim")
            val fiyatColumnIndex = cursor.getColumnIndex("fiyat")
            //artık hangisinin kaçıncı kolonda oldugunu biliyorum ve şimdi imleci kullanma zamanı
            while (cursor.moveToNext()) {
                //yani imlece bitirene (secmek istedigim veri bitene kadar) kadar hareket et demiş oluyoruz
                println("ID: ${cursor.getInt(idColumnIndex)}")
                //İD SİNİ verdik ve git oku dedik
                println("ISIM: ${cursor.getString(isimColumnIndex)}")
                println("FIYAT: ${cursor.getInt(fiyatColumnIndex)}")


            }
            cursor.close()

        } catch (e : Exception){
            //yakalanacak hata veri türü exception istersen loglara yazdır istersen kullanıcıya göster
            e.printStackTrace()
        }

    }
}