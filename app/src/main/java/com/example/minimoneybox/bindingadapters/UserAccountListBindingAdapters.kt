package com.example.minimoneybox.bindingadapters

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.minimoneybox.userAccounts.UserAccountViewModel
import com.example.minimoneybox.userAccounts.UserAccountsAdapter

@BindingAdapter("userAccounts")
fun bindUserAccounts(recyclerView: RecyclerView, userAccounts: List<UserAccountViewModel>) {
    recyclerView.adapter = UserAccountsAdapter().apply {
        submitList(userAccounts)
    }
}