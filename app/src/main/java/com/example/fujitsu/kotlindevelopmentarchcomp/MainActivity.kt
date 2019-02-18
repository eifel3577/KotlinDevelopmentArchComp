package com.example.fujitsu.kotlindevelopmentarchcomp

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.fujitsu.kotlindevelopmentarchcomp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /**я не указал ? в конце типа ActivityMainBinding, и я не инициализировал его. Как это возможно?
     *  Модификатор lateinit позволяет нам иметь ненулевые переменные, ожидающие инициализации.  */
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var repository = Repository("MyRepo",
            "Fleka", 1000, true)
        binding.repository = repository
        binding.executePendingBindings()

    }
}
