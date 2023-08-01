package com.abdbzkn.section5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//layout width  height wrap contant ise fotoğraf kendi boyutuyla görüüntülenir
//layout width ve height 0 verip constrait lerinin verirsem el verdiği kadar görünür ->MATCH CONSTRAİT
//layout width ve height match parent ekranı kapla
//constraint layout ****
//linear lyout ***
//relative layout *
//frame layout genelde tek video foto vs gösteren ekranlar için kullanırız farklı amaçları da var**
//grid layout ızgara görünümü *
