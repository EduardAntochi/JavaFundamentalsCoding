package ro.sda.fundamentals._2_conditional_statements;

import java.sql.SQLOutput;

public class NumberInWord {
    public static void main(String[] args){

        printNumbersInWord(0);
        printNumbersInWord(5);
        printNumbersInWord(-100);
        printNumbersInWord(9);

        System.out.println("-------------------");

        String result1 = convertNumberToString(5);
        System.out.println(result1);

        System.out.println(convertNumberToString(2));
        System.out.println(convertNumberToString(200));
    }
    public static void printNumbersInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
    public static String convertNumberToString(int number) {
        if (number == 0) {
            return "ZERO";
        } else if (number == 1) {
            return "ONE";
        } else if (number == 2) {
            return "TWO";
        } else if (number == 3) {
            return "THREE";
        } else if (number == 4) {
            return "FOUR";
        } else if (number == 5) {
            return "FIVE";
        } else if (number == 6) {
            return "SIX";
        } else if (number == 7) {
            return "SEVEN";
        } else if (number == 8) {
            return "EIGHT";
        } else if (number == 9) {
            return "NINE";
        } else {
            return "OTHER";
        }
    }
}
