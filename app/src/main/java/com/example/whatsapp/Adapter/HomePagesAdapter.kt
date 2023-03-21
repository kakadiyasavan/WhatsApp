package com.example.whatsapp.Adapter

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class HomePagesAdapter(fm: FragmentManager,fragment: Array<Fragment>,title: Array<String>) : FragmentPagerAdapter(fm) {

    var fragment = fragment
    var title = title

    override fun getCount(): Int {

        return fragments.size
    }

    override fun getItem(position: Int): Fragment {

        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {

        return title.get(position)
    }

}