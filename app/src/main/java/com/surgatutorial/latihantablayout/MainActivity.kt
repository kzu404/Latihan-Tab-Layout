package com.surgatutorial.latihantablayout

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.surgatutorial.latihantablayout.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.title_chat,
            R.string.title_status,
            R.string.title_call
        )
        private  val TAB_ICONS = intArrayOf(
            R.drawable.ic_chat,
            R.drawable.ic_android,
            R.drawable.ic_call
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager: ViewPager2 = binding.viewPager

        val adapter = TabAdapter(this)
        viewPager.adapter = adapter
        val tabLayout: TabLayout = binding.tabs


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
            tab.icon = ContextCompat.getDrawable(this,TAB_ICONS[position])
        }.attach()


    }
}