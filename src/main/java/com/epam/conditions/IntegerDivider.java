package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try{
            int checkToZero = dividend / divider;
            while (dividend >= divider){
                dividend -= divider;
            }

            if (dividend == 0){
                System.out.println("can be divided completely");
            }else {
                System.out.println("cannot be divided completely");
            }
        }catch (Exception e){
            System.out.println("division by zero");
        }

    }

}
