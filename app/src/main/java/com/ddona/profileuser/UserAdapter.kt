package com.ddona.profileuser

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ddona.profileuser.databinding.ItemUserBinding

class UserAdapter(val inter: IFolder) : RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        return UserHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.binding.data = inter.getData(position)
        holder.itemView.setOnClickListener {
            inter.onClickItem(holder.adapterPosition)
        }
    }

    override fun getItemCount(): Int {
        return inter.getCount()
    }

    interface IFolder {
        fun getCount(): Int
        fun getData(position: Int): User
        fun onClickItem(position: Int)
    }

    class UserHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)
}