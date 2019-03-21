package com.huda.infosportfragment.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView

import com.huda.infosportfragment.R
import com.huda.infosportfragment.adapter.DaftarOlahragaAdapter
import com.huda.infosportfragment.adapter.RiwayatOlahragaAdapter
import com.huda.infosportfragment.data.model.SportsItem
import com.huda.infosportfragment.presenter.DaftarOlahragaPresenter
import com.huda.infosportfragment.presenter.RiwayatOlahragaPresenter

/**
 * A simple [Fragment] subclass.
 *
 */
class RiwayatOlahragaFragment : Fragment() {
    private lateinit var RiwayatOlahragaAdapter: RiwayatOlahragaAdapter
    private lateinit var RiwayatOlahragaPresenter: RiwayatOlahragaPresenter
    private var items: ArrayList<SportsItem> = arrayListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater.inflate(R.layout.fragment_riwayat_olahraga, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        val progressBar: ProgressBar = view.findViewById(R.id.progress)
        val tvProgress: TextView = view.findViewById(R.id.tvProgressBar)
        RiwayatOlahragaAdapter = RiwayatOlahragaAdapter(activity,items)
        RiwayatOlahragaPresenter = RiwayatOlahragaPresenter(items,activity,recyclerView,RiwayatOlahragaAdapter, progressBar, tvProgress)
        RiwayatOlahragaPresenter.getDaftarOlahraga()


        return  view
    }


}
