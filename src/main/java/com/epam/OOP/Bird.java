package com.epam.OOP;

public class Bird extends Animal{

    static String color1 = "blue";
    static int numberOfPaws1 = 2;
    static boolean hasFur1 = false;

    String color = "blue";
    int numberOfPaws = 2;
    boolean hasFur = false;

    public Bird() {
        this(color1, numberOfPaws1, hasFur1);
    }

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly " + color + ". It has "+numberOfPaws+" "+(numberOfPaws>1 ? "paws" : "paw")+" and "+(hasFur ? "a" : "no")+" fur. Moreover, it has 2 wings and can fly.";
    }
}
