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
import com.huda.infosportfragment.data.model.SportsItem
import com.huda.infosportfragment.presenter.DaftarOlahragaPresenter

/**
 * A simple [Fragment] subclass.
 *
 */
class DaftarOlahragaFragment : Fragment() {
    private lateinit var DaftarOlahragaAdapter: DaftarOlahragaAdapter
    private lateinit var DaftarOlahragaPresenter: DaftarOlahragaPresenter
    private var items: ArrayList<SportsItem> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        // Inflate the layout for this fragment
        val view:View =inflater.inflate(R.layout.fragment_daftar_olahraga, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        val progressBar: ProgressBar = view.findViewById(R.id.progress)
        val tvProgress: TextView = view.findViewById(R.id.tvProgressBar)
        DaftarOlahragaAdapter = DaftarOlahragaAdapter(activity,items)
        DaftarOlahragaPresenter = DaftarOlahragaPresenter(items,activity,recyclerView,DaftarOlahragaAdapter, progressBar, tvProgress)
        DaftarOlahragaPresenter.getDaftarOlahraga()

        return view
    }


}
