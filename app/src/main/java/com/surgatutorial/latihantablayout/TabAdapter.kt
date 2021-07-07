package com.surgatutorial.latihantablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.surgatutorial.latihantablayout.fragment.CallFragment
import com.surgatutorial.latihantablayout.fragment.ChatFragment
import com.surgatutorial.latihantablayout.fragment.StatusFragment

private const val TABS = 3
class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ChatFragment()
            1 -> return StatusFragment()
        }
        return CallFragment()
    }
}