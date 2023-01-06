package com.example.databinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        /**
         * Comment this part as we are handling lifecycleOwner directly.
         * i.e binding.lifecycleOwner=this
         */
//        viewModel.quoteLiveData.observe(this, Observer {
//            binding.dataShowTextView.text=it
//        })


        /**
         * Comment this part as we are handling on click directily from the XML
         */
//        binding.submitDataButton.setOnClickListener(){
//            viewModel.upateQuoteData()
//        }
        /**
         * Assigining it directly from XML the onclick
         */
        binding.mainViewModelXml=viewModel
        /***
         * need to assign lifeCycle Ownwer
         */
        binding.lifecycleOwner=this
    }
}