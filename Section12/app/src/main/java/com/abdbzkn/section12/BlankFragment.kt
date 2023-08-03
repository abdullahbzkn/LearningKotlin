package com.abdbzkn.section12

import com.abdbzkn.section12.databinding.FragmentBlankBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null;
    private val binding get() = _binding!!



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBlankBinding.inflate(inflater,container,false)

        // binding.apply {
        //boyle yaparakta xml deki objeleri kullanabilirim binding.objeid yazarakte kullanabilirim

        // }

        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}