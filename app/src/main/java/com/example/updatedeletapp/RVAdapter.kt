package com.example.updatedeletapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.updatedeletapp.

class RVAdapter(private var users: User): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val user = users[position]

        holder.binding.apply {
            tvName.text = user.name
            tvLocation.text = user.location
            tvPk.text = "Pk: ${user.pk}"
        }
    }

    override fun getItemCount() = users.size

    fun update(users: Users){
        this.users = users
        notifyDataSetChanged()
    }
}