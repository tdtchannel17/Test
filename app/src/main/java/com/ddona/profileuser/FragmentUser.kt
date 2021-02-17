package com.ddona.profileuser

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ddona.profileuser.databinding.FragmentUserBinding

class FragmentUser : Fragment(), UserAdapter.IFolder {
    private lateinit var binding: FragmentUserBinding
    private var dataUser = mutableListOf<User>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(
            inflater,
            container,
            false
        )
        initsData()
        binding.rc.layoutManager = LinearLayoutManager(context)
        binding.rc.adapter = UserAdapter(this)

        return binding.root
    }

    fun initsData() {
        dataUser.add(
            User(
                "Tung123",
                "8389203893848",
                "09/11"
            )
        )
        dataUser.add(
            User(
                "TungDD",
                "8478673563765467",
                "23/12"
            )
        )
        dataUser.add(
            User(
                "TungPO",
                "22222222222222",
                "11/11"
            )
        )
        dataUser.add(
            User(
                "TungLOL",
                "331313131231313",
                "25/12"
            )
        )
        dataUser.add(
            User(
                "TungABCXYZ",
                "0909097832983333",
                "14/02"
            )
        )
    }

    override fun getCount() = dataUser.size

    override fun getData(position: Int): User {
        return dataUser[position]
    }

    override fun onClickItem(position: Int) {
        var dataDetail = dataUser[position]
        (activity as MainActivity).addFragmentUserDetail(dataDetail)
    }
}