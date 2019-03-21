package com.huda.infosportfragment.presenter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.huda.infosportfragment.adapter.DaftarLigaAdapter
import com.huda.infosportfragment.data.lib.ApiService
import com.huda.infosportfragment.data.lib.RetroConfig
import com.huda.infosportfragment.data.model.SportsItem
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class DaftarLigaPresenter(
    private var items: ArrayList<SportsItem> = arrayListOf(),
    private val context: FragmentActivity?,
    private var rv: RecyclerView,
    private var mAdapter: DaftarLigaAdapter,
    private var progressBar : ProgressBar,
    private var tvprogres : TextView
) {
    fun getDaftarLiga() {
        progressBar.visibility = View.VISIBLE
        tvprogres.visibility = View.VISIBLE
        val service: ApiService = RetroConfig.provideApi()
        service.getAllLeagues().subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                items.clear()
                items = it.leagues as ArrayList<SportsItem>
                rv.layoutManager = LinearLayoutManager(context)
                mAdapter = DaftarLigaAdapter(context, items)
                rv.adapter = mAdapter
                progressBar.visibility = View.INVISIBLE
                tvprogres.visibility = View.INVISIBLE
            }, {
                progressBar.visibility = View.INVISIBLE
                tvprogres.visibility = View.INVISIBLE
            })
    }
}