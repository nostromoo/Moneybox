package com.example.minimoneybox.userAccounts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.minimoneybox.databinding.ItemUserAccountBinding

class UserAccountsAdapter() : ListAdapter<UserAccountViewModel, UserAccountsAdapter.UserAccountViewHolder>(ItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAccountViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return UserAccountViewHolder(ItemUserAccountBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: UserAccountViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class UserAccountViewHolder(private val binding : ItemUserAccountBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: UserAccountViewModel) {
            binding.viewModel = item
        }
    }

    internal class ItemCallback : DiffUtil.ItemCallback<UserAccountViewModel>() {
        override fun areItemsTheSame(oldItem: UserAccountViewModel, newItem: UserAccountViewModel): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: UserAccountViewModel, newItem: UserAccountViewModel): Boolean {
            return oldItem == newItem
        }
    }

}


