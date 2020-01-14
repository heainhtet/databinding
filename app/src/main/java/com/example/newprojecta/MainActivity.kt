package com.example.newprojecta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.newprojecta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var person : Assignment = Assignment("John","ddd")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var btnsubmit = binding.btnsub
        btnsubmit.setOnClickListener {
            var editName : String = binding.ET1.text.toString()
            var editAddress : String = binding.ET2.text.toString()

            var p: Assignment = Assignment(editName,editAddress)
            binding.assignment = p
        }


    }
}
