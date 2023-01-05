package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**
     * this name is derived from XML after taking _ from the layout file.
     */
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        /**
         * Initial setting of the Username and Password
         */
        var quotes=Quotes("Vinay","Mandira")
        binding.quotesDatBnd=quotes
        /**
         * after on click assigining new value
         */
        binding.btnSetDataId.setOnClickListener(){
            quotes.userName=binding.editTextId.text.toString()
            binding.textViewId.text=quotes.userName
        }
    }
}