package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
import java.io.*;
 public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        int temporaryValue = 0;
        for (int m = 0; m < numbers.size(); m++) {
            temporaryValue = numbers.get(m);
            //checking if an element is even or odd
            if (temporaryValue % 2 == 0) {
                evenList.add(temporaryValue);

            }
        }
        return evenList;
    }
}