package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double total,salary,opv;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a salary: ");
        salary = scanner.nextInt();
        opv = salary*0.1;
        total = salary-opv-(salary-opv-42500)*0.1;
        System.out.println("Your final salary is " + total);
    }
}
