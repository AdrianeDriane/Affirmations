package com.adrianedilao.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//Our data class that receives the resource id of our strings
data class Affirmation (@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
