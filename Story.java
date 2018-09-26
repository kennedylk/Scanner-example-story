

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {

        String name, city, college, profession, animal, pet;
        int age;

        //Scanner object to read user input
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Provide a first name: ");
        name = keyboard.nextLine();

        System.out.print("Provide an age: ");
        age = keyboard.nextInt();

        // To remove the newline remaining
        keyboard.nextLine();

        System.out.print("Provide the name of a city: ");
        city = keyboard.nextLine();

        System.out.print("Provide the name of a college: ");
        college = keyboard.nextLine();

        System.out.print("Provide the name of a profession: ");
        profession = keyboard.nextLine();

        System.out.print("State a type of animal: ");
        animal = keyboard.nextLine();

        System.out.print("State a pet's name: ");
        pet = keyboard.nextLine();

        System.out.println();

        System.out.print("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println();
        System.out.print("At the age of " + age + ", " + name + " went to college at " + college
                + ".");
        System.out.println();
        System.out.print(name + " graduated and went to work as a " + profession + ".");
        System.out.println();
        System.out.print("Then, " + name + " adopted a " + animal + " named " + pet + ".");
        System.out.println();
        System.out.print("They lived happily ever after!");

    }
}

