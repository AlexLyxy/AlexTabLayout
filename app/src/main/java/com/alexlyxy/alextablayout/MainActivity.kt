package com.alexlyxy.alextablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alexlyxy.alextablayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private val fragList = listOf(
        FragmentMonday.newInstance(),
        FragmentTuesday.newInstance(),
        FragmentWednesday.newInstance()
    )
    private val fragListTitles = listOf(
        "Fragment Monday",
        "Fragment Tuesday",
        "Fragment Wednesday"
    )
    private lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState :Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = VpAdapter(this, fragList)
        binding.vp2.adapter = adapter
        TabLayoutMediator(binding.tb, binding.vp2) {
            tab, pos -> tab.text = fragListTitles[pos]}.attach()
    }
}


/*binding.tb.addOnTabSelectedListener(object : OnTabSelectedListener {
      override fun onTabSelected(tab :TabLayout.Tab?) {
          //Toast.makeText(this@MainActivity,"Tab selected: ${tab?.text}",
          //Toast.LENGTH_SHORT).show()
          //Toast.makeText(this@MainActivity,"Tab selected: ${tab?.position}",
          //Toast.LENGTH_SHORT).show()
          supportFragmentManager
              .beginTransaction()
              .replace(R.id.vp2, fragList[tab?.position!!])
              .commit()

      }
      override fun onTabUnselected(tab :TabLayout.Tab?) {
      }
      override fun onTabReselected(tab :TabLayout.Tab?) {
      }
  })  */
