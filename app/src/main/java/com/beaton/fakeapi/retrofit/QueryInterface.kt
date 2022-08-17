package com.beaton.fakeapi.retrofit

import com.beaton.fakeapi.entity.Post
import com.beaton.fakeapi.entity.User
import retrofit2.Call
import retrofit2.http.GET

interface QueryInterface {

    @GET("/posts")
    fun getAllPosts(): Call<MutableList<Post>>

    @GET("/users")
    fun getAllUser():Call<MutableList<User>>

}