package com.alexlyxy.alextablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentWednesday : Fragment() {

    override fun onCreateView(
        inflater :LayoutInflater,container :ViewGroup?,
        savedInstanceState :Bundle?,
    ) :View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wednesday,container,false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentWednesday()
    }
}