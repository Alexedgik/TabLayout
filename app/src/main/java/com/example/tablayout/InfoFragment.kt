package com.example.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.tablayout.databinding.InfoFragmentBinding


class InfoFragment : Fragment() {
    private val model: MainViewModel by activityViewModels()
    private lateinit var binding: InfoFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = InfoFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.tvInfo.text = it.info
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = InfoFragment()
    }
}