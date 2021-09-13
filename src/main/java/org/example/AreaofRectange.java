package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class AreaofRectange
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in); //define scanner

        //Get length of the room
        System.out.print("What is the length of the room in feet?" );
        String length = input.nextLine();
        int intLength = Integer.parseInt(length);

        //Get width of the room
        System.out.print("What is the width of the room in feet?");
        String width = input.nextLine();
        int intWidth = Integer.parseInt(width);

        System.out.println("You entered dimensions of "+intLength+" feet by "+intWidth+" feet.");

        //Calculations
        int sqft = intLength * intWidth;
        double room = sqft * 0.09290304;
        String num = String.format("%.3f", room);

        //Print result
        System.out.print("The area is"+"\n"+sqft+" square feet"+"\n"+num+" square meters");

    }
}
