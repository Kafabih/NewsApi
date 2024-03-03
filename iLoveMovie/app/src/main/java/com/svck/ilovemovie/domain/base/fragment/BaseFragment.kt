package com.svck.ilovemovie.domain.base.fragment

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.svck.ilovemovie.domain.router.RouterNavigation
import com.svck.ilovemovie.domain.session.AppSession
import com.svck.ilovemovie.external.utility.OSUtility
import org.koin.android.ext.android.inject


abstract class BaseFragment(resLayout: Int) : Fragment(resLayout) {

    val appSession: AppSession by inject()
    val osUtility: OSUtility by inject()
    val router: RouterNavigation by inject()


    fun showMessage(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongMessage(message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}