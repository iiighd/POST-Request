package com.example.updatedeletapp
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {
    @GET("test/")
    fun getAll(): Call<Users>

    @POST("test/")
    fun addUser(@Body userData: UserItem): Call<UserItem>
    @PUT("/test/{id}")
    fun updateUser(@Path("id") id: Int, @Body userData: UserItem): Call<UserItem>

    @DELETE("/test/{id}")
    fun deleteUser(@Path("id") id: Int): Call<Void>
}