package uz.gita.magazineapp.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import uz.gita.magazineapp.data.local.MyShared

/**
 *   Created by Jamik on 6/16/2023 ot 3:34 PM
 **/

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MyShared.init(this)
    }

}