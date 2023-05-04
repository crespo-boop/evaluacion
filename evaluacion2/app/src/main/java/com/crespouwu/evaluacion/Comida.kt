package com.crespouwu.evaluacion

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Comida(
    val intId:Int,
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId: Int

)
