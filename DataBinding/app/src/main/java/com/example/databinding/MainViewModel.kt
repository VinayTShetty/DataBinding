package com.example.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val quoteLiveData=MutableLiveData("Vinay Data Not Avaliable")

    fun upateQuoteData(){
        quoteLiveData.value="Mandira Lakshmi Vinay \n Happy Family"
    }
}