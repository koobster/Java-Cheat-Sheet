package com.dankubrak;

public class Main {

    public static void main(String[] args) {

        int myMinValue = -2147483647;

        byte Variable1 = 20;

        short Variable2 = 200;

        int Variable3 = 2000;

        long Variable4 = 50000L + 10L * (Variable1 + Variable2 + Variable3);
        short variable2Total = (short) (1000 + 10 * (Variable1 + Variable2 + Variable3));
        System.out.println("Variable2Total = " + Variable4);

    }
}

