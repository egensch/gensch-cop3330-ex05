/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("What is the first number? ");
        int num1 = numbers.nextInt();

        System.out.print("What is the second number? ");
        int num2 = numbers.nextInt();

        int addnum = num1 + num2;
        System.out.println(""+ num1 + " + " + num2 + " = " + addnum );

        int minusnum = num1 - num2;
        System.out.println(""+ num1 + " - " + num2 + " = " + minusnum);

        int multnum = num1 * num2;
        System.out.println(""+ num1 + " * " + num2 + " = " + multnum );

        int divnum = num1 / num2;
        System.out.println(""+ num1 + " / " + num2 + " = " + divnum );

    }
}
