package com.insan.uts_insanmaulana

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Android(
    val imgAndroid: Int,
    val nameAndroid: String,
    val descAndroid: String
) :Parcelable