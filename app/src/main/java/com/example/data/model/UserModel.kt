package com.example.data.model

enum class UserRole {
    REGULAR,
    ADMIN
}

data class UserProfile(
    val phoneNumber: String,
    val fullName: String,
    val role: UserRole,
    val adminDesignation: String? = null,
    val mosqueAffiliation: String? = null,
    val isLoggedIn: Boolean = true
)
