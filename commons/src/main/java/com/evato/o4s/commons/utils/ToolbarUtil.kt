package com.evato.o4s.commons.utils

import android.content.Context
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.evato.o4s.commons.R
import kotlinx.android.synthetic.main.toolbar.view.*

fun setToolbarTitleWithBackButton(context: Context, toolbar: Toolbar, title: String) {

    toolbar.iv_connection_mode.setImageResource(R.drawable.ic_cloud)
    toolbar.title = title
    (context as AppCompatActivity).setSupportActionBar(toolbar)
    val actionBar: ActionBar? = (context).supportActionBar
    toolbar.setNavigationOnClickListener { view: View? -> (context as AppCompatActivity).onBackPressed() }
    if (actionBar != null) {
        actionBar.setDisplayShowHomeEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayUseLogoEnabled(false)
    }
}

fun setToolbarTitleWithNavIcon(
    context: Context,
    toolbar: Toolbar,
    title: String,
    drawerLayout: DrawerLayout
) {
    (context as AppCompatActivity).setSupportActionBar(toolbar)
    val actionBar: ActionBar? = (context).supportActionBar
    toolbar.setNavigationOnClickListener { view: View? -> drawerLayout.openDrawer(GravityCompat.START) }
    if (actionBar != null) {
        actionBar.setHomeAsUpIndicator(R.drawable.ic_nav_icon)
        actionBar.setDisplayShowHomeEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayUseLogoEnabled(false)
    }
    actionBar!!.title = title
}




