package com.example.minimoneybox.data

import com.example.minimoneybox.retrofit.MoneyBoxService
import com.example.minimoneybox.retrofit.User
import retrofit2.Response


interface LoginRepository {
    suspend fun postSession(user: User): Response<SessionResponse>
}

class LoginRepositoryImpl(private val service: MoneyBoxService): LoginRepository {


    override suspend fun postSession(user: User) = service.getSession(user)
}