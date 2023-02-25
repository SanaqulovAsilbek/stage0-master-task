package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = 0;
        while (number > 0){
            res = (res * 10) + (number % 10);
            number /= 10;
        }
        System.out.println(res);
    }

}
