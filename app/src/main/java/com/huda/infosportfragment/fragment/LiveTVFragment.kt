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
import com.huda.infosportfragment.adapter.LiveTvAdapter
import com.huda.infosportfragment.data.model.SportsItem
import com.huda.infosportfragment.presenter.LiveTvPresenter

/**
 * A simple [Fragment] subclass.
 *
 */
class LiveTVFragment : Fragment() {
    private lateinit var LiveTvAdapter: LiveTvAdapter
    private lateinit var LiveTvPresenter: LiveTvPresenter
    private var items: ArrayList<SportsItem> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_live_tv, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv)
        val progressBar: ProgressBar = view.findViewById(R.id.progress)
        val tvProgress: TextView = view.findViewById(R.id.tvProgressBar)
        LiveTvAdapter = LiveTvAdapter(activity, items)
        LiveTvPresenter = LiveTvPresenter(items, activity, recyclerView, LiveTvAdapter, progressBar, tvProgress)
        LiveTvPresenter.getLiveTv()

        return view
    }


}
