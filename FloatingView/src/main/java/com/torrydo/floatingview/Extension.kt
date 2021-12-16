package com.torrydo.floatingview

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory

object Extension {

    fun Int.toBitmap(): Bitmap{
        return BitmapFactory.decodeResource(Resources.getSystem(), this)
    }

}