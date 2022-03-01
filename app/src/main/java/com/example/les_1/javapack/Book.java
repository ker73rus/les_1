package com.example.les_1.javapack;

import androidx.annotation.Nullable;

public class Book implements Publication {
    int price;
    int wordCount;

    public Book(int price, int wordCount){
        this.price = price;
        this.wordCount = wordCount;
    }

    public String getType() {
        if (wordCount < 1000)
            return "Flash Fiction";
        else if (wordCount < 7500)
            return "Short Story";
        else
            return "Novel";
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Book) && (((Book) obj).wordCount ==  wordCount) && price == ((Book)obj).price; // хотя мне кажется что такая конструкция обращения к obj как экземплляру класса Book не совсем правильная. (Book) это получается мы насильно преобразуем obj к Book
    }
}
