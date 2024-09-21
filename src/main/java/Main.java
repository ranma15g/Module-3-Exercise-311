/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
3.11 (Find the number of days in a month) Write a program that prompts the user to enter the month and year and displays the number of days in the month. and displays the result. 
Due: Sep 22 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

import java.util.Scanner; // We are importing the Scanner class from java.util 

public class Main { // open the class block

  public static void main(String[] args) { // open the main method block

    // Create the Scanner Object scanner for grabbing the user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user to enter the month
    System.out.print("Enter the month (1-12): ");

    // We store the user year input into an int named month
    int month = scanner.nextInt();

    // Ask the user to enter the year
    System.out.print("Enter the year: ");

    // We store the user year input into an int named year
    int year = scanner.nextInt();

    // Determine the number of days in February based on leap year logic
    int daysInMonth;

    // We are creating a boolean to determine if the year is a leap year
    boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // First we check to see if we are dealing with a leap year
    // Leap years only affect the day of February
    if (month == 2) {

      // If the leapYear boolean is true, then we set the daysInMonth to 29
      if (leapYear) { daysInMonth = 29; } 

      // else the boolen is false, so we set the daysInMonth to 28
      else { daysInMonth = 28; }
    } 

    // Now we account for the months that have 30 days
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
      daysInMonth = 30;
    } 

    // Now we account for the months that have 31 days
    else {
      daysInMonth = 31;
    }

    // If the year the user entered is a leap year and they selected February
    if (leapYear && month == 2) {
      System.out.println("The year " + year + " is a leap year. Because of this the Number of days in " + month + "/" + year + ": " + daysInMonth);
    // We inform the user that they have used a leap year for the year entered
    }
      
    // Otherwise we inform the user of the number of days in the month they entered
    else {
    System.out.println("Number of days in " + month + "/" + year + ": " + daysInMonth);
      }

  } // Close the main method block

} // Close the class block