package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();


        int resultCalc = calculator.addAToB(5,6);
        int resultCalc2 = calculator.subtractAFromB(resultCalc, 6);

        if (resultCalc == 11) {
            System.out.println("Calc add test OK");
        } else {
            System.out.println("Calc add test Error!");
        }

        if (resultCalc2 == 5) {
            System.out.println("Calc sub test OK");
        } else {
            System.out.println("Calc sub test Error!");
        }
    }



}
