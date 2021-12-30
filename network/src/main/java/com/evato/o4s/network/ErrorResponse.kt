package com.evato.o4s.network

data class ErrorResponse(
    val code : String,
    val reasons : String,
    val errorCode : String
)