package com.beaton.fakeapi.controller

import com.beaton.fakeapi.entity.Post

interface PostInerface {

    fun onResponse(posts:MutableList<Post>?)
    fun onFailure(message:String?)

}