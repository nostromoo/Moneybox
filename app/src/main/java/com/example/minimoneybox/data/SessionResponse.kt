package com.example.minimoneybox.data

import com.google.gson.annotations.SerializedName

data class SessionResponse(@SerializedName("Session") val session: Session) {
    class Session(
        @SerializedName("BearerToken")  val bearerToken: String
    )
}


