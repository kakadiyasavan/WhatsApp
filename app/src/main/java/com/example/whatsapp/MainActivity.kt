package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsapp.Adapter.HomePagesAdapter
import com.example.whatsapp.Fragments.CallFragment
import com.example.whatsapp.Fragments.ChatFragment
import com.example.whatsapp.Fragments.StatausFragment
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var fragment = arrayOf(ChatFragment(),StatausFragment(),CallFragment())
    var title = arrayOf("Chats","Status","Calls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pager.adapter = HomePagesAdapter(supportFragmentManager,fragment,title)
        binding.tabs.setupWithPager(binding.pager)

        binding.viewPager.adapter = HomePagesAdapter(supportFragmentManager, fragments, title)
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.dot.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, binding.dot)
            popupMenu.menuInflater.inflate(R.menu.about, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.newGroup ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.newBroadcast ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.linkedDevice ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.startedMessages ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.payments ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.settings ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                }
                true
            })

            popupMenu.show()

        }
    }
}