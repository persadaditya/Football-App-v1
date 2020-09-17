package app.pdg.footballapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Teams (
    val name:String,
    val image:String,
): Parcelable