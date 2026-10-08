package com.example.campusequipmentrentalapp.model

data class User (

    val id: Int,

    val loginId: String,

    val name: String,

    val department: String,

    val role: UserRole
)

enum class UserRole(val label:String){

    STUDENT("학생"),
    PROFESSOR("교수"),
    ASSISTANT("조교")
}