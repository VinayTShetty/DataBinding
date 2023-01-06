package com.example.databinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
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
        binding.mainViewModelXml=viewModel
        /**
         * Live Data will send data only to the activity who are in active state.
         * We need to tell the binding agent/Set the binding agent that Live data for that we need to set the lifecycleOwner
         */
        binding.lifecycleOwner=this
    }
}

/**
 * Two way Binding.
 *   android:text="@={mainViewModel_xml.quoteLiveData}"
 *   Need to use = in the XML.
 */