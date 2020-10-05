package com.example.minimoneybox.retrofit

import com.example.minimoneybox.data.SessionResponse
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface MoneyBoxService {

    @POST("/users/login")
    suspend fun getSession(@Body user: User): Response<SessionResponse>

    @GET("/investorproducts")
    suspend fun getUserAccounts(): Response<SessionResponse>

    companion object {
        const val BASE_URL = "https://api-test01.moneyboxapp.com"

        fun createService(): MoneyBoxService {

            val httpClient = OkHttpClient.Builder()
            httpClient.addInterceptor {
                    chain: Interceptor.Chain ->
                val request = chain.request().newBuilder()
                    .addHeader("AppId", "3a97b932a9d449c981b595")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("appVersion", "7.15.0")
                    .addHeader("apiVersion", "3.0.0")
                    .build()
                chain.proceed(request)
            }
            httpClient

            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build()
                .create(MoneyBoxService::class.java)
        }

    }
}