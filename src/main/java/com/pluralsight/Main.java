package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.addItem(10);
        numbers.addItem(3);
        numbers.addItem(92);
        numbers.addItem(43); // this line should fail
        System.out.println(numbers.getItems());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.addItem(LocalDate.now());
        dates.addItem(LocalDate.now());
        //dates.addItem(15); // this line should fail (This Part will not run because it's a int and it is not supposed to be there
        System.out.println(dates.getItems());
    }
}
