package com.evato.o4s.base

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import com.evato.o4s.base.databinding.DialogNoInternetBinding

class NoInternetDialog : DialogFragment() {

    private lateinit var binding: DialogNoInternetBinding
    private lateinit var mContext: Context
    private lateinit var alertDialog: AlertDialog


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DataBindingUtil.inflate(layoutInflater,
                R.layout.dialog_no_internet, null, false)
        binding.lifecycleOwner = this
        alertDialog = AlertDialog.Builder(mContext)
                .setView(binding.root)
                .create()
        binding.btnNoInternetRetry.setOnClickListener {
            dismiss()
        }
        return alertDialog
    }

    companion object {
        fun newInstance(): NoInternetDialog {
            return NoInternetDialog()
        }
    }
}