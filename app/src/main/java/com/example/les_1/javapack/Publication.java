package com.example.les_1.javapack;

public interface Publication {
    int price = 0;
    int wordCount = 0;

    default String getType(){return "";}
}
