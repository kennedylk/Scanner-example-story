package com.company;

import java.util.Scanner;
import java.io.*;

/*
 * StoryWrite.java
 *
 * A class for writing to a file
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 *
 */

public class StoryWrite {

    /*
    The method article returns the appropriate article for word ("a" or "an").
     */

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

    /*
     * The method main reads the user's input from the keyboard
     * and writes a story to a file.
     */

    /*
    When something unexpected happens in a Java program,
    an exception is thrown.

    The method that is executing when the exception is thrown
    must either handle the exception or "pass it up the line."
    To pass the exception up the line, the method needs a
    throws clause in the method header.

    Altenatively, the message can be handled with a try-catch
    statement.
    */

    public static void main(String[] args)
            throws IOException {

        String name, city, college, profession, animal, pet;
        // Use integer type if you want to manipulate age as a number.
        int age;

        // Create Scanner object to read user input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Provide a first name: ");
        name = keyboard.nextLine();
        // Note that nextLine reads the whole line the user enters, including the newline character.

        System.out.println("Provide an age: ");
        age = keyboard.nextInt();
        // Note that nextInt reads only the next integer.  It does not read the newline character.
        // The newline character from when the user hit enter is waiting to be read.

        // Consume the newline character explicitly.
        keyboard.nextLine();

        System.out.println("Provide the name of a city: ");
        city = keyboard.nextLine();

        System.out.println("Provide the name of a college: ");
        college = keyboard.nextLine();

        System.out.println("Provide the name of a profession: ");
        profession = keyboard.nextLine();

        System.out.println("State a type of animal: ");
        animal = keyboard.nextLine();

        System.out.println("State a pet's name: ");
        pet = keyboard.nextLine();

        System.out.println(); // Leave a blank line.

        // Create an object fw from the FileWriter class for writing output.
        // Caution: With the argument false, if the file Story.txt
        // already exists, it will be overwritten.
        // Use the argument true to append what is written into
        // a file that already has content.


        /*
        Print the story to the output file storyOut.txt.
        This requires outputFile.print instead of System.out.print.
        The output file will be located in the project folder.

        Do you want to append new text to the existing output file with each
        successive run of the code?  If yes, use true.

        If not (if you want to overwrite the output file with each
        successive run of the code), use false.
         */

        FileWriter fw = new FileWriter("storyOut.txt", false);

        PrintWriter outputFile = new PrintWriter(fw);

        outputFile.print("There once was a person named " + name);
        outputFile.println(" who lived in " + city + ".  ");
        outputFile.print("At the age of " + age + ", ");
        outputFile.println(name + " went to college at " + college + ".");
        outputFile.println(name + " graduated and went to work as " + article(profession)
                + " " + profession + ".");
        outputFile.print("Then, " + name + " adopted " + article(animal) + " ");
        outputFile.println(animal + " named " + pet + ".");
        outputFile.println("They both lived happily ever after!");

        outputFile.close();
    }

}
