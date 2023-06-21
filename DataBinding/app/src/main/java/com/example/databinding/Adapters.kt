package com.example.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadImageFmURL")
fun ImageView.loadFromUrl(url:String){
    Glide.with(this.context).load(url).into(this)
}