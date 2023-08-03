package com.abdbzkn.section12

import com.abdbzkn.section12.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun ilkFragment(view: View){
        val fragmentManager = supportFragmentManager
        val fragmanTransaction = fragmentManager.beginTransaction()
        val ilkFragment = BlankFragment()
        fragmanTransaction.replace(R.id.frameLayout,ilkFragment).commit()

    }
    fun ikinciFragment(view: View){
        val fragmentManager = supportFragmentManager
        val fragmanTransaction = fragmentManager.beginTransaction()
        val ikinciFragment = BlankFragment2()
        fragmanTransaction.replace(R.id.frameLayout,ikinciFragment).commit() //durmadan ustune ekler oncesine bakmaz replace yazarsam oncekini kaldırıp sonra ekler

    }
}