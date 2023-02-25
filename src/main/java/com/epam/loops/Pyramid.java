package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 0; j < (2*cathetusLength) ; j++) {
                if (j < cathetusLength){
                    if (cathetusLength - i > j){
                        System.out.print(" ");
                    }else {
                        System.out.print(Math.abs(cathetusLength-j));
                    }
                }else {
                    if (cathetusLength + i > j+1){
                        for (int k = 2; k < ((cathetusLength + i)-(j + 1) + 2); k++) {
                            System.out.print(k);
                        }
                        j += (cathetusLength + i)-(j + 1);
                    }else {
                        continue;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
