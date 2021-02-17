package com.ddona.profileuser

import java.io.Serializable

data class User(
    val name: String,
    val number: String,
    val date: String
) : Serializable