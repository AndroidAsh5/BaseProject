package com.evato.o4s.commons.utils

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import com.evato.o4s.commons.R
import kotlinx.android.synthetic.main.layout_toast.view.*

fun showCustomToast(message: String, context: Context) {
    val inflater = LayoutInflater.from(context)
    val layout = inflater.inflate(
        context.resources.getLayout(R.layout.layout_toast),
        (context as Activity).findViewById(R.id.main_layout)
    )
    layout.tvMessage.text = message
    val toast = Toast(context)
    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
    toast.duration = Toast.LENGTH_SHORT
    toast.view = layout
    toast.show()
}






