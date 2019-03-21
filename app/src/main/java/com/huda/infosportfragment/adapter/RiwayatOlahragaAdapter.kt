package com.huda.infosportfragment.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.huda.infosportfragment.R
import com.huda.infosportfragment.data.model.SportsItem
import kotlinx.android.synthetic.main.list_riwayat_liga.view.*

class RiwayatOlahragaAdapter : RecyclerView.Adapter<RiwayatOlahragaAdapter.ViewHolder> {

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
        ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_riwayat_liga, p0, false))

    override fun getItemCount(): Int = items?.size as Int
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nama.text = items?.get(position)?.strSport
        Glide.with(context)
            .load(items?.get(position)?.strThumb).override(512, 512).into(holder.image)
        holder.event.text = items?.get(position)?.strEvent
        holder.sHome.text = items?.get(position)?.intHomeScore
        holder.sAway.text = items?.get(position)?.intAwayScore
        holder.dsHome.text = items?.get(position)?.strHomeGoalDetails
        holder.dsAway.text = items?.get(position)?.strAwayGoalDetails
        holder.date.text = items?.get(position)?.strDate
//               holder.itemView.setOnClickListener({
//        })
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nama = view.tv_name_riwayat_liga
        val image = view.img_riwayat_laga
        val event = view.tv_name_riwayat_event
        val sHome = view.tv_name_score_home
        val sAway = view.tv_name_score_away
        val dsHome = view.tv_name_score_detail_home
        val dsAway = view.tv_name_score_detail_away
        val date = view.tv_name_riwayat_date
    }

}