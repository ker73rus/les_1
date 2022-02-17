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
        print("Сравнение по ссылке: ${this === other} \n" )
        print("Сравнение методом: " + super.equals(other) + "\n" )
        return super.equals(other)
    }
}