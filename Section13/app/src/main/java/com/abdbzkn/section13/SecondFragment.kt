package com.abdbzkn.section13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.abdbzkn.section13.databinding.FragmentFirstBinding
import com.abdbzkn.section13.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding : FragmentSecondBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val kullaniciAdi = SecondFragmentArgs.fromBundle(it).username
            binding.textView2.text = kullaniciAdi
            
        }


        binding.button2.setOnClickListener{
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)

        }
    }


}