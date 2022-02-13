package com.example.databindingdemo

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val s:Student = Student("W123456","Ali")
        binding.student = s

        //binding.tvStudentName.text = s.name
        //binding.tvStudentID.text= s.id

        //val s2:Student = Student("W654321","Abu")
        //val tvName:TextView = findViewById(R.id.tvStudentName)

        //tvName.text = "Ali"

        binding.btnUpdate.setOnClickListener(){
            s.name = "Alex"
            //binding.tvStudentName.text = s.name
            binding.apply {
                invalidateAll()
            }

        }


    }
}