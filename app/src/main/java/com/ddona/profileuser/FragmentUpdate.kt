package com.ddona.profileuser

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ddona.profileuser.databinding.FragmentUpdateBinding

class FragmentUpdate : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentUpdateBinding
    private var dataDetail: User? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUpdateBinding.inflate(
            inflater,
            container,
            false
        )
        dataDetail = arguments?.getSerializable("data") as User
        binding.name.setText(dataDetail!!.name)
        binding.number.setText(dataDetail!!.number)
        binding.date.setText(dataDetail!!.date)
        binding.save.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(p0: View?) {
        fragmentManager?.popBackStack()
    }
}