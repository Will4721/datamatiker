package Tamogachi;

import java.util.Scanner;


public class tamogachitest {

    public static void main (String[]args){
        int rando;

        Scanner sc = new Scanner(System.in);
        printWelcome();
        tamogachi[] bla = pet(sc);
        printPets(bla);
        printmenu();
        while(true) {
            dogaction(sc, bla);
            printmenu();
        }
    }
    public static void dogaction(Scanner sc, tamogachi[]bla){
        int waitforaction = Integer.parseInt(sc.nextLine());
       if (waitforaction == 1){
           System.out.println("                _,)\n" +
                   "        _..._.-;-'\n" +
                   "     .-'     `(\n" +
                   "    /      ;   \\\n" +
                   "   ;.' ;`  ,;  ;\n" +
                   "  .'' ``. (  \\ ;\n" +
                   " / f_ _L \\ ;  )\\\n" +
                   " \\/|` '|\\/;; <;/\n" +
                   "((; \\_/  (()       Felix Lee\n" +
                   "     \"\n");
           System.out.println("Your dog is playing");
           for (int i = 0; i < bla.length; i++) {
               int i1 = bla[i].getEnergy() - 2;
               System.out.println("Energy level: "+bla[i].getEnergy());
           }
       }
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
            bla[0] = new Dog(name, 0);

        }

        return bla;
    }
    public static void printPets (tamogachi[]bla){
        for (int i = 0; i < bla.length; i++) {
            System.out.println(bla[i]);// toString() is called automatically
            System.out.println("energy level: " + bla[i].getEnergy());
            System.out.println("here is your pet " + bla[i].getName());
            System.out.println("/^-----^\\\n" +
                    "V  o o  V\n" +
                    " |  Y  |\n" +
                    "  \\ Q /\n" +
                    "  / - \\\n" +
                    "  |    \\\n" +
                    "  |     \\     )\n" +
                    "  || (___\\====\n");

        }
    }
    public static void printmenu(){

            System.out.println("\nMenu:");
            System.out.println("1. Play with pet. cost: -2/-1 for dog/cat");
            System.out.println("2. Let pet sleep. cost: +4/+2 for dog/cat ");
            System.out.println("3. Give pet food +5/+6 for dog/cat");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
    }
}
