package com.huda.infosportfragment.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.huda.infosportfragment.R
import com.huda.infosportfragment.data.model.SportsItem
import kotlinx.android.synthetic.main.list_daftar_olahraga.view.*

class DaftarOlahragaAdapter : RecyclerView.Adapter<DaftarOlahragaAdapter.ViewHolder> {

    private lateinit var context: Context
    private var items: ArrayList<SportsItem>? = null
    private var orig: ArrayList<SportsItem>? = null

    constructor(context: Context?, items: ArrayList<SportsItem>) : this() {
        this.context = context!!
        this.items = items
        this.orig = items
    }

    constructor()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) =
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_daftar_olahraga, p0, false))

    override fun getItemCount(): Int = items?.size as Int
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = items?.get(position)?.strSport
        Glide.with(context)
            .load(items?.get(position)?.strSportThumb).override(512, 512).into(holder.image)
//               holder.itemView.setOnClickListener({
//        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nama = view.tv_name_olahraga
        val image = view.img_olahraga
    }

}