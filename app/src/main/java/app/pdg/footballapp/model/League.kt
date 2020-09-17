package app.pdg.footballapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class League  (
    val name: String,
    val icon: String,
    val image: String,
    val zone: Int,
    val description: String,
    val teams: List<Teams>
) : Parcelable