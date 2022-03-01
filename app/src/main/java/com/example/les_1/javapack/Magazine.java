package com.example.les_1.javapack;

public class Magazine implements Publication {
    int price;
    int wordCount;

    public Magazine(int price, int wordCount){
        this.price = price;
        this.wordCount = wordCount;
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}
