package com.liompei.zx

import android.app.Application
import com.liompei.zxlog.Zxlog

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Zxlog.init(debug = BuildConfig.DEBUG, releaseTree = ReleaseTree())
    }

}