/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labs;

/**
 Adam Scott
 9/9/2024
 The purpose of this program is to calculate gas mileage.
 */
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double miles, //number of miles traveled
                gallons, // number of gallons used
                mpg; //miles per gallon
        System.out.println("This program will calculate mileage");
        System.out.println("How many miles were driven?");// ask the user for number of miles driven
        miles = keyboard.nextDouble(); //read number of miles and store it in miles variable
        System.out.println("How many gallons where used?"); // ask the user for amount of gallons used
        gallons = keyboard.nextDouble();// read number of gallons ans store it in gallons variable
        mpg = miles / gallons; // calculate miles per gallon
        System.out.println("Your gas mileage is " + mpg + " miles per gallon"); // show gas mileage
    }
}
