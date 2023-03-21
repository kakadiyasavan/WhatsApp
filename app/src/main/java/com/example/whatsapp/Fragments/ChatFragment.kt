package com.example.whatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.whatsapp.R
import com.example.whatsapp.databinding.FragmentChatBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARgesAM2 = "param2"

class ChatFragment : Fragment() {


    lateinit var binding : FragmentChatBinding

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    var text = arrayOf("Hii"," Hello","How Are You?","Good Morning","Call You Back","Good Night","Hii"," Hello","How Are You?","Good Morning","Call You Back")
    var person = arrayOf("Rahul","Mit","Smeet","krunal","Myank","Nilu","Umang","Dhruv","eqbal","Utsav","Harsh")
    var time = arrayOf("1:12","2:58","6:52","3:01","8:25","7:36","12:59","10:31","7:02","9:25","11:00")
    var img = arrayOf(pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,pro9,pro10,pro11)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentChatBinding.inflate(inflater,container,false)

        var adapter = RecyclerAdapter(context,person,text,time,img)
        binding.recycler.adapter = adapter

        var layoutManager : LinearLayoutManager = LinearLayoutManager(context)
        binding.recycler.layoutManager = layoutManager

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}