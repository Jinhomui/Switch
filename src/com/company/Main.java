package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 3:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 1:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        //More code here

        char value = 'F';

        switch (value) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value was " + value);
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "January";
        switch (month.toUpperCase()) {
            case "JANUARY":
            case "JUNE":
                System.out.println(month);
                break;
            default:
                System.out.println("Not sure");
        }


    }
}
