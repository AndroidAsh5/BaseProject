package com.evato.o4s.actions

import android.content.Context
import android.content.Intent

object Actions {


    @JvmStatic
    fun openHome(context: Context) =
            internalIntent(context, "com.evato.o4s.home.open")

    private fun internalIntent(context: Context, action: String) =
            Intent(action).setPackage(context.packageName)


}