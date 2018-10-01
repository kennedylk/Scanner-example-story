package com.company;

import java.util.Scanner;

/*
 * Story.java
 *
 * A class for further practice with user input and static methods
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 *
 */

public class Story {

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

    public static void main(String[] args) {

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

        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college
                + ".");
        System.out.println(name + " graduated and went to work as " + article(profession) + " " +
                profession + ".");
        System.out.println("Then, " + name + " adopted " + article(animal) + " " + animal
                + " named " + pet + ".");
        System.out.print("They lived happily ever after!");

    }
}
