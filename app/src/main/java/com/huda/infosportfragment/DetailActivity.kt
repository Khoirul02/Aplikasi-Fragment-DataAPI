package com.huda.infosportfragment

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var strsport:String
    lateinit var strsportthumb:String
    lateinit var strsportdescription:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
       strsport = intent.getStringExtra("STRSPORT")
       strsportthumb = intent.getStringExtra("STRSPORTTHUMB")
       strsportdescription = intent.getStringExtra("STRSPORTDESCRIPTION")

        tv_detail_name_olahraga.text = strsport
        Glide.with(this)
            .load(strsportthumb).override(512, 512).into(img_detail_olahraga)
        tv_deskripsi.text = strsportdescription

        favorite.setOnClickListener {
//            val sharingIntent = Intent(Intent.ACTION_SEND)
//            val imageUri = Uri.parse(strsportthumb)
//            sharingIntent.type = "image/png"
//            sharingIntent.putExtra(Intent.EXTRA_STREAM, imageUri)
//            startActivity(sharingIntent)
            val sharingIntent = Intent(Intent.ACTION_SEND)
            sharingIntent.type = "text/plain"
            val shareBody =
                "Shared link from Soccer " + strsportthumb
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Dari")
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(sharingIntent, "Share Melalui"))

        }
    }
}
