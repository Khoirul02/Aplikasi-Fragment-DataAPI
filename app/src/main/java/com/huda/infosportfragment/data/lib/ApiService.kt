package com.huda.infosportfragment.data.lib

import com.huda.infosportfragment.data.model.Items
import retrofit.http.GET
import retrofit.http.Query
import rx.Observable


interface ApiService {
    @GET("all_sports.php")
    fun getAllSport(): Observable<Items>

    @GET("all_leagues.php")
    fun getAllLeagues(): Observable<Items>

    @GET("lookuptv.php")
    fun getLookUpTv(@Query("id") id: String): Observable<Items>
//
    @GET("eventspastleague.php")
    fun getPast(@Query("id") id: String): Observable<Items>

    //4328
}