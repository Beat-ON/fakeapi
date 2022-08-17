package com.beaton.fakeapi.controller

import com.beaton.fakeapi.entity.Post
import com.beaton.fakeapi.entity.User
import com.beaton.fakeapi.retrofit.ApiRetrofit
import com.beaton.fakeapi.retrofit.QueryInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Controller {

    fun PostStart(listener:PostInerface){
        var call = ApiRetrofit.init()
            .create(QueryInterface::class.java)
            .getAllPosts()
            .enqueue(object : Callback<MutableList<Post>>{
                override fun onResponse(
                    call: Call<MutableList<Post>>?,
                    response: Response<MutableList<Post>>?
                ) {
                    listener.onResponse(response?.body())
                }

                override fun onFailure(call: Call<MutableList<Post>>?, t: Throwable?) {
                    listener.onFailure(t?.localizedMessage)
                }

            })
    }

    fun userStart(listener: UserInterface){
        var call = ApiRetrofit.init()
            .create(QueryInterface::class.java)
            .getAllUser()
            .enqueue(object :Callback<MutableList<User>>{
                override fun onResponse(
                    call: Call<MutableList<User>>?,
                    response: Response<MutableList<User>>?
                ) {
                    listener.onResponseUser(response?.body())
                }

                override fun onFailure(call: Call<MutableList<User>>?, t: Throwable?) {
                    listener.onFailureUser(t?.localizedMessage)
                }

            })
    }

}