package com.epam.OOP;

public class Dog extends Animal{


    static String color1 = "brown";
    static int numberOfPaws1 = 4;
    static boolean hasFur1 = true;

//    String color = "brown";
//    int numberOfPaws = 4;
//    boolean hasFur = true;

    public Dog() {
        this(color1, numberOfPaws1, hasFur1);
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }
}
