package com.example.newproject0922

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Photo(
    val title: String,
    val thumbnailUrl: String
) : Parcelable
