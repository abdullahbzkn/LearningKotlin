package com.abdbzkn.section2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_main.view.textView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 50
        var y = 10

        cikarma(500,20) //unit değer döndürmediğini belirtir yani void gibi
        cikarma(500,20)

        /* var z = cikarma(500,20)
        println(z) */ //logcatte hiç bir şey yapmaz çünkü unit

        var z = toplama(10,20)
        textView.text = "Sonuç : ${z}"

        button.setOnClickListener {
            val toplamaSonucu = toplama(10,50)
            textView.text = "Sonuç: ${toplamaSonucu}"
        }

        sinifCalismasi()
        nullGuvenligi()


        /*{
            var batman = Superkahraman("Batman",51,"Gazeteci")
            println(batman.yas)

        }*/



        //onCreate içi
    }

    //Girdi Alma
    fun cikarma(x: Int , y: Int){
        textView.text = "Sonuç ${x-y}"
    }
    //Çıktı Vermek -> Döndürmek (Return)
    fun toplama(a: Int , b: Int) : Int {
        return a + b
    }

    /*fun degistir(view : View){
        val toplamaSonucu = toplama(10,50)
        textView.text="Sonuç: ${toplamaSonucu}"
    }*/

    fun sinifCalismasi() {

        var superman = Superkahraman("Superman", 50, "Gazeteci")
        textView.text = "Yaş: ${superman.yas}"
        superman.testFonksiyonu()
        //  superman.sacininRengi="Yeşil" PRİVATE OLD. KULLANILAMAZ ERİŞİM YOK
        println(superman.sacininRengiFunAl()) //GETTER YARDIMI İLE DEĞİŞTİREMEDEN ALDIK
    }
        fun nullGuvenligi(){
        //NULL NULLABİLİTY NULLSAFETY

        //Tanımlama, Definening
        var benimString : String? //string nullabil yani kesin içinde null var durum karmaşıklığına yol açamaz güvenli

        //Initialization
        benimString = "Atıl"
        var benimYasim : Int? = null //Int nullabil
        println(benimYasim)
        //benimYasim=2 bu satır ile netten veri gelse de gelmese de aşağıdaki durumlardan birine gidilcek program çökmeyecek.


        //1
        if(benimYasim!=null){
            println(benimYasim*2)
        } else{
            println("null geldi vesaire açıklama")
        }

        //2
            // !! null olmayacak demek ? null olabilir demek
            //aşağıdaki satırı yazdıgımda ya soru işareti ya iki ünlem koymamı ister
            // benimYasim=3 //bunu yazınca istemiyor artık işaret ancak yazmadan önce istiyordu
            //println(benimYasim.minus(2))
            //println(benimYasim!!.minus(2)) //hem null yapıp hem eminim nul degil dersek uyg çöker
        println(benimYasim?.minus(2)) //null da gelebilir diyoruz
        // 3
            //elvis operatörü

            //benimYasim = 10
            val sonuc = benimYasim?.minus(2) ?: 10 //bilmiyorum eger nullsa 10 degerini al demek
            println(sonuc)

        //4
            //let  nullsa döngüyü çalıştırma degilse değeri it e ata ve isteneni yazdır/yaptır
            //benimYasim = 5
            benimYasim?.let {
                println(it * 5)
            }


    }



        /* var superman = Superkahraman()
        superman.isim="Superman"
        superman.meslek="Gazeteci"
        superman.yas=50
        textView.text = "Yaş: ${superman.yas}"

        var batman = Superkahraman()
        batman.isim="Batman"
        batman.meslek="İş adamı"
        batman.yas=51
        textView.text = "Yaş: ${batman.yas}"
        println(batman.yas) */


       /* var isim = "Superman"
        var meslek = "Gazeteci"
        var yas = 50

        var spiderManIsim = "Spiderman"
        var spiderManMeslek = "Gazeteci"
        var spiderManYas = 20 */

//MainActivity içi
}



