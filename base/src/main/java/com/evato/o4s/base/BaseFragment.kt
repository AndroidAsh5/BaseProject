package com.evato.o4s.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.evato.o4s.commons.utils.showCustomToast

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment() {

    private lateinit var mViewDataBinding: T
    private lateinit var mViewModel: V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = getViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mViewDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        return mViewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewDataBinding.setVariable(getBindingVariable(), mViewModel)
        mViewDataBinding.lifecycleOwner = this
        mViewDataBinding.executePendingBindings()
        observerData()
    }

    private fun observerData() {
        mViewModel.showToast.observe(viewLifecycleOwner, Observer {
            showCustomToast(it, requireContext())
        })
        mViewModel.showInternetError.observe(viewLifecycleOwner, Observer {
            if (it)
                showNoInternetDialog()
        })
    }

    private fun showNoInternetDialog() {
        NoInternetDialog.newInstance().show(requireActivity().supportFragmentManager, "noInternet")
    }

    fun getViewDataBinding(): T {
        return mViewDataBinding
    }

    abstract fun getBindingVariable(): Int

    abstract fun getLayoutId(): Int

    abstract fun getViewModel(): V

}