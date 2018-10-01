package com.company;

import java.util.Scanner;
import java.io.*;

/*
 * StoryRead.java
 *
 * A class for reading from a file
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 *
 */

public class storyRead {

    public static String article(String word) {
        char firstChar = word.charAt(0);
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o'
                || firstChar == 'u' || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O'
                || firstChar == 'U') {
            return "an";
        } else {
            return "a";
        }
    }

    // The method main reads the user's input from a file

    /* When something unexpected happens in a Java program,
    an exception is thrown.

    The method that is executing when the exception is thrown
    must either handle the exception or "pass it up the line."
    To pass the exception up the line, the method needs a
    throws clause in the method header.

    Altenatively, the message can be handled with a try-catch
    statement.
    */

    public static void main(String[] args) {

        try {
            // Create an object myFile from the File class for reading input.
            File myFile = new File("storyIn.txt");

            // Create an object inputFile from the Scanner class.
            Scanner inputFile = new Scanner(myFile);

            // Read from the inputFile line by line.

            String name = inputFile.nextLine();

            String age = inputFile.nextLine();

            String city = inputFile.nextLine();

            String college = inputFile.nextLine();

            String profession = inputFile.nextLine();

            String animal = inputFile.nextLine();

            String animalName = inputFile.nextLine();

        /*
        Note all the above information must be provided in the
        file storyIn.txt, which can be placed in the project folder.
         */

            System.out.println("There once was a person named " + name + " who lived in " + city + ".");
            System.out.println("At the age of " + age + ", " + name + " went to college at " + college
                    + ".");
            System.out.println(name + " graduated and went to work as " + article(profession) + " " +
                    profession + ".");
            System.out.println("Then, " + name + " adopted " + article(animal) + " " + animal
                    + " named " + animalName + ".");
            System.out.print("They lived happily ever after!");
        }
        // catches a FileNotFound object named e
        catch (FileNotFoundException e) {
            // System.out.println("File not found"); // Write an error message
            System.out.println(e.getMessage()); // or use a default message.
        }
    }
}

