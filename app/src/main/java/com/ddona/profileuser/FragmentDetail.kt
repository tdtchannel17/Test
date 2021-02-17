package com.ddona.profileuser

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ddona.profileuser.databinding.FragmentDetailBinding
import java.io.Serializable

class FragmentDetail : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentDetailBinding
    private var dataDetail: User? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(
            inflater,
            container,
            false
        )
        dataDetail = arguments?.getSerializable("data") as User
        binding.name.setText(dataDetail!!.name)
        binding.number.setText(dataDetail!!.number)
        binding.date.setText(dataDetail!!.date)

        binding.update.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.update -> {
                (activity as MainActivity).addFragmentUserUpdate(dataDetail as Serializable)
            }
        }
    }
}