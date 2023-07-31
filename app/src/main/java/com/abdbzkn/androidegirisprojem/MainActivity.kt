package com.abdbzkn.androidegirisprojem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Logcatte System.out kendi yazdığım kodları verir.
        //println("merhaba kotlin")
        println(5*10)
        //Değişkenler variables
        var a = 5
        var e = 10
        println(a*e)
        //Sabitler values
        val x = 10 //değer değiştirilemez
        val yas = 50
        println(x+yas)
        println(a*yas)
        val yasSonucu = yas * x
        println(yasSonucu)
        println("--------------İNTEGER--------------")
        //variable defining tanımlama
        val benimInteger : Int
        //Başlatma , değerini atama (Initializing, Initialization)
        benimInteger = 5

        var yeniInteger : Int = 20
        println(benimInteger/2)
        //long
        println("--------------LONG--------------")
        var benimLong : Long = 100
        benimLong = 3000000000000
        println(benimLong)
        //Double&Float
        println("--------------Double&Float--------------")
        val pi = 3.14
        println(pi*2)

        val floatPi : Float = 3.14f
        println(floatPi*2)
        val yeniDouble = 5.0
        println(yeniDouble/2)
        //String Metin
        println("--------------String Metin--------------")
        val benimString = ".Benim. Yeni Metnim."
        println(benimString.length)
        val isim = "Abdullah"
        val soyIsim = "Buzkan"
        val tamIsim = isim + " " + soyIsim
        println(tamIsim)

        val yeniBirString : String = "20"
        val baskaBirString : String = "23"
        println(yeniBirString+baskaBirString)
        //Boolean
        println("--------------Boolean--------------")
        var benimBooelean : Boolean
        benimBooelean = true
        benimBooelean = false

        println(3<7)
        println(3>7)
        //Type casting
        println("--------------Type casting--------------")
        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)
        val kullaniciGirdisi= "50"
        val sonucKullaniciGirdisi = kullaniciGirdisi.toInt()
        println(sonucKullaniciGirdisi/2)
        //Koleksiyonlar
        println("--------------Koleksiyonlar--------------")
        //Array Dizi
        println("--------------Array Dizi--------------") //get set
        val benimDizim = arrayOf("Abdullah","Atıl","Kerem","Osman","Ahmet")
        //index mantıgı ile çalışır
        println(benimDizim[0]) // aynı işlemi
        println(benimDizim.get(1)) //yaparlar
        benimDizim.set(2,"Mehmet")
        println(benimDizim[2])
        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))
        val karisikDizi = arrayOf("Abdullah",24,16.5,true,false)
        println(karisikDizi.get(3))
        //ArrayList Listeler
        println("--------------ArrayList--------------") //add get
        //val isimListesi = arrayListOf() hata ya deger ve ya tür belirt
        //val isimListesi = arrayListOf<String>() tür belirttim hata vermez
        //val isimListesi = arrayListOf<String>("Atıl","Osman","Ali")
        val isimListesi = arrayListOf<String>("Atıl","Osman","Ali")
        println(isimListesi[0])
        println(isimListesi.get(1))
        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")

        println(isimListesi.get(4))

        //çok türde kullanıcıdan almak için :
        val karisikArrayList = arrayListOf<Any>() //hem her degeri alabilir hem atama yapmadım hem tür belirtmedim
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)
        //tek türde kullancıdan almak için :
        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))
        //Set  HashSet//liste gibi ancak veri tekrarıdan kurtulmak için kullanılabilir
        println("--------------SET---------------") //add foreach it
        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2 : ")
        println("index 2 : ${ornekDizi[2]}") //kod olarak çalıştır metin degil demektir.
        println("index 3 : ${ornekDizi[3]}")
        println(ornekDizi.size)
        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)
        //döngü ile yazdırılır
        //For Each
        benimSet.forEach{//ilkdöngümüz
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Samancıoglu")
        digerSet.forEach{
            println(it)
        }
        //Map HashMap
        println("--------------MAP--------------") //put
        //Anahtar Kelim - Değer Eşleşmesi(Key-Value Pairing)
        //1
        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)

        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}")

        //2
        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)
        println("Elm'anın kalorisi : ${yemekKaloriMap.get("Elma")}")
        //2.2
        val benimMapim = HashMap<String,String>()
        benimMapim.put("ÖRNEK","DEĞER")

        //3
        val yeniMap = hashMapOf<String,Int>("Atıl" to 50,"Örnek" to 50)
        println(yeniMap.get("Örnek"))

        //Matematikse İşlemler
        println("--------------Matematikse İşlemler--------------")
        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)
        var digerSayi = 10
        println(digerSayi>sayi) //bool döndür

        println(digerSayi>sayi && 2>3) //kontrol ve veya
        println(digerSayi>sayi || 2>3)

        println(8+7) //matematiksel işlmler

        //Remainder - Kalanı bulmak
        println(11%3)

        //İf Kontrelleri
        println("--------------İf Statements Eğer Kontrolleri--------------")
        val skor = 50
        if(skor<10){
            println("Oyunu Kaybettiniz")

        } else if (skor>=10 && skor<20){
            println("Skorun 10 ve 20 arasında çok iyi skor aldın")
        } else if (skor>=20 && skor<30){
            println("Skorun 20 ve 30 arasında rekor kırdın")
        } else{
            println("Skorun 30 un üzerinde efsane oynadın")
        }

        //When Kontrelleri (switch ile aynı else ifler çok ise kullanılabilir)
        println("--------------When--------------")

        var notRakami = 5
        var notStringi = ""

        when(notRakami){
            0 -> notStringi = "Geçersiz not"
            1 -> notStringi = "Zayıf not"
            2 -> notStringi = "Kötü not"
            3 -> notStringi = "Orta not"
            4 -> notStringi = "İyi not"
            else -> notStringi = "Pek iyi not"

        }
        println(notStringi)
        /*
        if(notRakami==0){
            notStringi = "Geçersiz not"
        } else if(notRakami==1){
            notStringi = "Zayıf not"
        } else if(notRakami==2){
            notStringi = "Kötü not"
        } else if(notRakami==3){
            notStringi = "Orta not"
        } else if(notRakami==4){
            notStringi = "İyi not"
        } else{
            notStringi = "Pek iyi not"
        }

        println(notStringi)
        */

        //Döngüler
        println("--------------For Döngüsü--------------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)
        println("Döngü başladı")
        for (num in baskaBirDizi){ //num yeni oluşturuldu in .. daki elemanlar bitene kadar
            println(num/5+3)
        }
        println("Döngü bitti")

        for (indeks in baskaBirDizi.indices){ //indeks yeni in ... .indices daki indexleri verir gereksiz
            println(baskaBirDizi[indeks]/5+3)
        }
        for (b in 0..9){ //aralık verir
            println(b)
        }
        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Atıl")
        benimDigerStringDizim.add("Abdullah")
        for(str in benimDigerStringDizim){
            println(str)
        }
        benimDigerStringDizim.forEach{
            println(it)
        }

        println("--------------While Döngüsü--------------")
        var b = 0
        while (b<=10){
            println(b)
            b+=1
        }
        var j = 0
        if( j== 0) {
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

    //onCreate içi
    }

    fun ilkFonksiyon(){
        println("İlk Fonksiyon Çalıştırıldı")
    }
    fun ikinciFonksiyon(){
        println("İkinci Fonksiyon Çalıştırıldı")
    }

    /*fun degistir(view : View){
        textView.text = "Merhaba Android"
    } */

//MainActivity içi
}
