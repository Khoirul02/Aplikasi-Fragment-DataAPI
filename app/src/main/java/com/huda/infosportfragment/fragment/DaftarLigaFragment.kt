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
import com.huda.infosportfragment.adapter.DaftarLigaAdapter
import com.huda.infosportfragment.adapter.DaftarOlahragaAdapter
import com.huda.infosportfragment.data.model.SportsItem
import com.huda.infosportfragment.presenter.DaftarLigaPresenter

/**
 * A simple [Fragment] subclass.
 *
 */
class DaftarLigaFragment : Fragment() {
    private lateinit var DaftarLigaAdapter: DaftarLigaAdapter
    private lateinit var DaftarLigaPresenter: DaftarLigaPresenter
    private var items: ArrayList<SportsItem> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_daftar_liga, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        val progressBar: ProgressBar = view.findViewById(R.id.progress)
        val tvProgress: TextView = view.findViewById(R.id.tvProgressBar)
        DaftarLigaAdapter = DaftarLigaAdapter(activity, items)
        DaftarLigaPresenter = DaftarLigaPresenter(items, activity, recyclerView, DaftarLigaAdapter, progressBar, tvProgress)
        DaftarLigaPresenter.getDaftarLiga()

        return view
    }

}
