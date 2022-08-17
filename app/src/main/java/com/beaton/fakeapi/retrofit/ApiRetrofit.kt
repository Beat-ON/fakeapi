package com.beaton.fakeapi.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRetrofit {

    companion object{
        lateinit var gson : Gson
        lateinit var retfrofit : Retrofit

        fun init():Retrofit{
            if (!this::gson.isInitialized){
                gson = GsonBuilder()
                    .setLenient()
                    .create()
            }
            if (!this::retfrofit.isInitialized){
                retfrofit = Retrofit.Builder()
                    .baseUrl("https://jsonplaceholder.typicode.com/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retfrofit
        }
    }

}