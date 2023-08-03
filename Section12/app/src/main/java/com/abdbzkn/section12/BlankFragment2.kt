package com.abdbzkn.section12

import com.abdbzkn.section12.databinding.FragmentBlank2Binding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abdbzkn.section12.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {

    private var _binding:FragmentBlank2Binding? = null;
    private val binding get() = _binding!!;


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBlank2Binding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}