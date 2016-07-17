package com.dankubrak;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        double variable1 = 20d;
        double variable2 = 80d;
        double variabletotal = (variable1 + variable2) * 25;
        double variableremainder = variabletotal % 2300;
        if (variableremainder <= 200)
                System.out.println("Total was over the limit");

    }
}

