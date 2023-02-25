package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (month > 0 && month <= 12){
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            System.out.println(daysInMonth);
        }else {
            System.out.println("invalid date");
        }
    }

}
