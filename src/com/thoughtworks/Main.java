package com.thoughtworks;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}