package com.example.les_1

open class Magazine(override var price: Int,override var wordCount:Int) :Publication{
    override fun getType(): String {
        return "Magazine"
    }
}