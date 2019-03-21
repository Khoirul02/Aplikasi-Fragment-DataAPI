package com.huda.infosportfragment.data.model

import com.google.gson.annotations.SerializedName

data class SportsItem(

    @field:SerializedName("idSport")
    val idSport: String? = null,

    @field:SerializedName("strSport")
    val strSport: String? = null,

    @field:SerializedName("strSportThumb")
    val strSportThumb: String? = null,

    @field:SerializedName("strSportDescription")
    val strSportDescription: String? = null,

    @field:SerializedName("strLeague")
    val strLeague: String? = null,

    @field:SerializedName("strLeagueAlternate")
    val strLeagueAlternate: String? = null,

    @field:SerializedName("strEvent")
    val strEvent: String? = null,

    @field:SerializedName("strLogo")
    val strLogo: String? = null,

    @field:SerializedName("strChannel")
    val strChannel: String? = null,

    @field:SerializedName("strTime")
    val strTime: String? = null,

    @field:SerializedName("dateEvent")
    val dateEvent: String? = null

)