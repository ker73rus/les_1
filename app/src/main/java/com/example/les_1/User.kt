package com.example.les_1

import java.util.*
import kotlin.reflect.KProperty

data class User(
    val id:Int,
    val name:String,
    val age: Int,
    val type: Type
) {
    val startTime:Date by lazy{
        Calendar.getInstance().time
    }

}

