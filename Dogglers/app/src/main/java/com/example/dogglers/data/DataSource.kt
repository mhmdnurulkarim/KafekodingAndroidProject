package com.example.dogglers.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * An object to generate a static list of dogs
 */
@Parcelize
data class DataSource(
    val Photo: Int,
    val Name: String,
    val Age: Int,
    val Hobbies: String
): Parcelable
