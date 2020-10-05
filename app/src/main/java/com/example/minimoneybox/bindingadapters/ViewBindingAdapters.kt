package com.example.minimoneybox.bindingadapters

import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("actionOnClick")
fun actionOnClick(view: View, action: () -> Unit) {
    view.setOnClickListener {
        action.invoke()
    }
}
