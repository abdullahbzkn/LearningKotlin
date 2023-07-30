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
        var b = 10
        println(a*b)
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
        println("--------------ArrayList--------------")
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
        println("--------------SET---------------")
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
        println("--------------MAP--------------")
















































    }
    //fun degistir(view : View){
    //    textView.text = "Merhaba Android"
    //
    //}
}
