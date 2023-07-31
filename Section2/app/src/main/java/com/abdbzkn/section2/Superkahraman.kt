package com.abdbzkn.section2

class Superkahraman(var isim:String, var yas:Int, var meslek:String) {

    private var sacininRengi = "Sarı"
    fun testFonksiyonu(){
        println("test")
    }
    //Getter
    fun sacininRengiFunAl() : String{
        return this.sacininRengi
    }

    //Setter
    /*
    fun sacRenginiDegistir() {
        this.sacininRengi = "Yeşil"
    }

     */

    // Access Levels - Erişebilirlik Seviyeleri
    // private - protected - internal - public
    //sadece sınıfta - belgede - modülde(kendi uygulamamda ancak farklı dış kütüphane eklersem ulaşamam) - heryerde
/*1
    //Property
    var isim = ""
    var yas = 0
    var meslek = ""

    //Constructor
    constructor(isimGirdisi: String , yasGirdisi: Int , meslekGirdisi: String){
        isim = isimGirdisi
        yas = yasGirdisi
        meslek = meslekGirdisi
        println("conctructor çağırıldı")
        }
*/
/*2
    //Property

    var isim = ""
    var yas = 0
    var meslek = ""

    //Constructor

    constructor(isim: String, yas: Int, meslek: String){
        this.isim = isim
        this.yas = yas
        this.meslek = meslek
        println("constructor çağırıldı")
    }
*/
/*3
    class Superkahraman(var isim:String, var yas:Int, var meslek:String) {
      //en kullanışlı olan sınıf yapısı for kotlin Primary Constructor
 */
/*4
    class Superkahraman {
 */


}
