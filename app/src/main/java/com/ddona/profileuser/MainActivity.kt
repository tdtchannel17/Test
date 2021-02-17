package com.ddona.profileuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ddona.profileuser.databinding.ActivityMainBinding
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        addListUser()
    }

    private fun addListUser() {
        val manager = supportFragmentManager
        val tran = manager.beginTransaction()
        val fr = FragmentUser()

        tran
            .replace(R.id.content, fr)
            .addToBackStack(null)
            .commit()
    }

    fun addFragmentUserDetail(data: Serializable) {
        val manager = supportFragmentManager
        val tran = manager.beginTransaction()
        val fr = FragmentDetail()
        val bundle = Bundle()
        bundle.putSerializable("data", data)
        fr.arguments = bundle

        tran
            .replace(R.id.content, fr)
            .addToBackStack(null)
            .commit()
    }

    fun addFragmentUserUpdate(data: Serializable) {
        val manager = supportFragmentManager
        val tran = manager.beginTransaction()
        val fr = FragmentUpdate()
        val bundle = Bundle()
        bundle.putSerializable("data", data)
        fr.arguments = bundle

        tran
            .replace(R.id.content, fr)
            .addToBackStack(null)
            .commit()
    }
}