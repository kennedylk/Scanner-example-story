package com.company;

import java.util.Scanner;

/*
 * Story.java
 *
 * A class for further practice with user input
 *
 * Starter code by Laura K. Gross, COMP 152, Bridgewater State University
 *
 * Completed by: [student name], [student email]
 *         date: [date of completion]
 *
 */

public class Story {
    public static void main(String[] args) {

        String name, city, college, profession, animal, pet;
        // Use integer type if you want to manipulate age as a number.
        int age;

        // Create Scanner object to read user input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Provide a first name: ");
        name = keyboard.nextLine();

        System.out.println("Provide an age: ");
        age = keyboard.nextInt();

        // Consume the newline character.
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
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a " + animal + " named " + pet + ".");
        System.out.print("They lived happily ever after!");

    }
}

