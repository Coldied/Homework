package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();

        double opv = salary*0.1;
        double ipn = (salary-opv-42500)*0.1;
        double total = salary-opv-ipn;
        System.out.println("Your salary is " + total);
    }
}
