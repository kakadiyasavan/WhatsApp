package com.example.whatsapp.Adapter

import android.app.Person
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.whatsapp.R

class CallAdapter(context: Context,person: Array<String>,time: Array<String>,img : IntArray) : RecyclerView.Adapter<CallAdapter.DataHolder>() {

    var context = context
    var person = person
    var time = time
    var img = img

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallAdapter.DataHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.call_recycler,parent,false)
        return DataHolder(view)
    }

    override fun onBindViewHolder(holder: CallAdapter.DataHolder, position: Int) {
        holder.txtcall.setText(person.get(position))
        holder.calltime.setText(time.get(position))
        context.let{
            Glide.with(it).load(img.get(position)).into(holder.callimg)
        }

        class DataHolder(itemView : View) : ViewHolder(itemView){
            var callimg =  itemView.findViewById<ImageView>(R.id.callimg)
            var txtcall = itemView.findViewById<TextView>(R.id.txtcall)
            var calltime = itemView.findViewById<TextView>(R.id.calltime)
        }
    }

    override fun getItemCount(): Int {
        return person.size
    }
}