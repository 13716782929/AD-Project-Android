package iss.nus.edu.sg.mygo.api.service

import iss.nus.edu.sg.mygo.api.models.AttractionBookingRequest
import iss.nus.edu.sg.mygo.api.models.LoginRequest
import iss.nus.edu.sg.mygo.api.models.LoginResponse
import iss.nus.edu.sg.mygo.api.models.RegisterRequest
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface UserApiService {

    @POST("api/auth/register")
    suspend fun register(@Body request: RegisterRequest): Response<String>

    @POST("api/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("/api/attractions/booking")
    suspend fun createAttractionBooking(@Body request: AttractionBookingRequest): Response<AttractionBookingRequest>

    companion object {
        private const val BASE_URL = "http://10.0.2.2:8080/"

        fun create(): UserApiService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(UserApiService::class.java)
        }


    }
}