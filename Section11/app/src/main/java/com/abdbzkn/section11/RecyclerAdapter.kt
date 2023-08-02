package com.abdbzkn.section11

import com.abdbzkn.section11.databinding.RecyclerRowBinding
import android.content.Intent
import android.graphics.Bitmap
import android.telephony.SignalStrengthUpdateRequest
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerAdapter (val kahramanListesi : ArrayList<String> , val kahramanGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(val binding: RecyclerRowBinding) :RecyclerView.ViewHolder(binding.root) {
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        //Inflater , LayoutInflater , MenuInflater //XML VE KT BAĞLARKEN
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuperKahramanVH(binding)
    }
    override fun getItemCount(): Int {
        return kahramanListesi.size
    }
    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
        holder.binding.recyclerViewTextView.text = kahramanListesi.get(position)
        holder.itemView.setOnClickListener(){
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi",kahramanListesi.get(position))
            //singelton tekillik
            //normalde bitmap i aktivitiden aktiviteye göndermeyiz ama olduda gondermek zorunda kaldım bilelim
           // intent.putExtra("superKahramanIsmi",kahramanListesi.get(position)) bu şekilde gönderilmez!! uyg çöker singelton tekillik kullanıcaz
            //bir sınıf oluşturucam ve sadece bir nesne alıcak ve uyg heryerinden cagırıp kullanabilicem
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel=kahramanGorselleri.get(position)

            holder.itemView.context.startActivity(intent)

        }
    }
}