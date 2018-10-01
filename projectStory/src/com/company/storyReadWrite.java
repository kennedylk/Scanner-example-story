package com.company;

import java.util.Scanner;
import java.io.*;

/*
 * StoryReadWrite.java
 *
 * A class for reading from a file and writing to a file
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 *
 */

public class storyReadWrite {

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

    public static void main(String[] args)
            throws IOException {

        try {
            // Create an object myFile from the File class for reading input.
            File myFile = new File("storyIn.txt");

            /*
             If you don't use the default file location in the project folder, you can also put in a path.
             On a Windows computer, paths contain backslash (\) characters;
             if the backslash is used in a String, it is the escape character, so you must use two backslashes in the path:
             File myFile = new File("A:\\PriceList.txt");
             */

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
            outputFile.println(animal + " named " + animalName + ".");
            outputFile.println("They both lived happily ever after!");

            outputFile.close();

        }

        // catches a FileNotFound object named e
        catch (FileNotFoundException e) {
            // System.out.println("File not found"); // Write an error message
            System.out.println(e.getMessage()); // or use a default message.
        }
    }
}

