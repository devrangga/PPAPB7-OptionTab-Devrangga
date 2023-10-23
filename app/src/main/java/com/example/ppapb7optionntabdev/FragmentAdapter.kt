package com.example.ppapb7optionntabdev

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(act:AppCompatActivity) : FragmentStateAdapter(act) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> RegisterFragment()
            1 -> LoginFragment()
            else -> throw IllegalArgumentException("Position out of array")
        }
    }
}