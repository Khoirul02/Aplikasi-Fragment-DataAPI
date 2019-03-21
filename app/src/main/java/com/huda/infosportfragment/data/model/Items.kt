package com.huda.infosportfragment.data.model

import com.google.gson.annotations.SerializedName

data class Items(

//    @field:SerializedName("sports")
    val sports: List<SportsItem?>,
    val events: List<SportsItem?>,
    val leagues: List<SportsItem>,
    val tvevent: List<SportsItem>
)