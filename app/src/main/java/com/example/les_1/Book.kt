package com.example.les_1

open class Book(override var price: Int, override var wordCount: Int) : Publication {
    override fun getType(): String {
        if (wordCount < 1000)
            return "Flash Fiction"
        else if (wordCount < 7500)
            return "Short Story"
        else
            return "Novel"
    }

    override fun equals(other: Any?): Boolean {
        return (other is Book && (other.price == price && other.wordCount == wordCount))
    }
}