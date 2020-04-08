package com.company;


import java.util.Scanner;

class Date{
    int month;
    int day;
    int year;

    public boolean isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public Date(int month, int day, int year){
        if(month>=1 && month<=12){
            this.month = month;
        }
        if ( day>=1 && day<= 31){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                this.day = day;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                if (day <= 31){
                    this.day = day;
                }else{
                    this.day = -1;
                }
            }
            else if (month == 2){
                if (isLeapYear(year)){
                    if (day >= 29){
                        this.day = day;
                    }else{
                        this.day = -1;
                    }
                }else {
                    if (day>= 28){
                        this.day = day;
                    }else{
                        this.day = -1;
                    }
                }
            } else {
                this.day = -1;
            }
        }else {
            this.day = -1;
        }
        this.year = year;
    }

    public void setDay(int day) {
        if ( day>=1 && day<= 31){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                this.day = day;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                if (day <= 31){
                    this.day = day;
                }else{
                    this.day = -1;
                }
            }
            else if (month == 2){
                if (isLeapYear(year)){
                    if (day >= 29){
                        this.day = day;
                    }else{
                        this.day = -1;
                    }
                }else {
                    if (day>= 28){
                        this.day = day;
                    }else{
                        this.day = -1;
                    }
                }
            } else {
                this.day = -1;
            }
        }else {
            this.day = -1;
        }
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12){
            this.month = month;
        }else {
            this.month = -1;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate(){
        System.out.println(month+ "/" + day +"/"+year);
    }
}

class Main {

    public static void main(String[] args) {
        Date DateTest = new Date(12,30,1995);
        DateTest.displayDate();
        DateTest.setDay(32);
        DateTest.setMonth(13);
        DateTest.displayDate();
    }
}
