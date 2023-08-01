package com.abdbzkn.section6
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.abdbzkn.section6.databinding.ActivityIkinciBinding

class IkinciActivity : AppCompatActivity() {
    lateinit var binding: ActivityIkinciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_ikinci)
        binding = ActivityIkinciBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val intent = intent
        val alinanVeri = intent.getStringExtra("yollananVeri")
        binding.textView.text = alinanVeri




    }
    fun geriDon(view: View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }


}