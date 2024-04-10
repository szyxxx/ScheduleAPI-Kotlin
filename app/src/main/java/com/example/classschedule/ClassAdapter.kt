package com.example.classschedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClassAdapter(val dataClass: List<DataItem?>?) : RecyclerView.Adapter<ClassAdapter.MyViewHolder>() {
    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val matakuliah = view.findViewById<TextView>(R.id.item_matakuliah_class)
        val kodedosen = view.findViewById<TextView>(R.id.item_kodedosen_class)
        val statuskehadiran = view.findViewById<TextView>(R.id.item_statuskehadiran_class)
        val tempat = view.findViewById<TextView>(R.id.item_tempat_class)
        val waktu = view.findViewById<TextView>(R.id.item_waktu_class)
        val statuskelas = view.findViewById<TextView>(R.id.item_statuskelas_class)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_class,parent,false )
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if (dataClass != null){
            return dataClass.size
        }
            return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.matakuliah.text = dataClass?.get(position)?.attributes?.mataKuliah
        holder.kodedosen.text = dataClass?.get(position)?.attributes?.kodedosen
        holder.statuskehadiran.text = dataClass?.get(position)?.attributes?.statuskehadiran
        holder.tempat.text = dataClass?.get(position)?.attributes?.tempat
        holder.statuskelas.text = dataClass?.get(position)?.attributes?.statuskelas
        holder.waktu.text = dataClass?.get(position)?.attributes?.waktu
    }
}