package com.beaton.fakeapi.controller

import com.beaton.fakeapi.entity.User

interface UserInterface {

    fun onResponseUser(users:MutableList<User>?)
    fun onFailureUser(message:String?)


}