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
import com.google.android.gms.common.data.DataHolder

class StatusAdapter(context: Context, person: Array<String>,item: Array<String>,img:IntArray) : RecyclerView.Adapter<StatusAdapter.DataHolder>() {

    var context = context
    var person = person
    var time = time
    var img = img

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusAdapter.DataHolder {
       var view = LayoutInflater.from(context).inflate(R.layout.status_recycler,parent,false)
        return DataHolder(view)
    }

    override fun onBindViewHolder(holder: StatusAdapter.DataHolder, position: Int) {
        holder.status_recycler.setText(person.get(position))
        holder.status_recycler.setText(time.get(position))
        context.let { Glide.with(it).load(img[position]).into(holder.imgstatus) }

        class DataHolder(itemView: View) : ViewHolder(itemView){
            var imgstatus = itemView.findViewById<ImageView>(R.id.imgstatus)
            var txtstatus = itemView.findViewById<TextView>(R.id.txtstatus)
            var statustime = itemView.findViewById<TextView>(R.id.statustime)
        }
    }

    override fun getItemCount(): Int {
        return person.size
    }
}