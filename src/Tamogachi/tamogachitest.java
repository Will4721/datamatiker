package Tamogachi;

import java.util.Scanner;

import static java.lang.Math.random;

public class tamogachitest {

    public static void main (String[]args){
        int rando;

        Scanner sc = new Scanner(System.in);
        printWelcome();
        tamogachi[] bla = pet(sc);
        printPets(bla);

    }

    public static void printWelcome () {
        System.out.println("Welcome to the Tamogachi game ");
        System.out.println("Let's pick a pet");
        System.out.println("You can pick either Dog or Cat");
    }

    public static tamogachi[] pet (Scanner sc){
        tamogachi[] bla = new tamogachi[1];
        String type = sc.nextLine();
        if (type.equalsIgnoreCase("Dog")) {
            System.out.println("Pick the Name");
            String name = sc.nextLine();
            bla[0] = new Dog(name, bla[0].getEnergy());

        }

        return bla;
    }
    public static void printPets (tamogachi[]bla){
        for (int i = 0; i < bla.length; i++) {
            System.out.println(bla[i]);// toString() is called automatically
            System.out.println("energy level: " + bla[i].getEnergy());
            System.out.println("");

        }
    }
}
