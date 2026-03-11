package Tamogachi;

import java.util.Scanner;


public abstract class tamogachitest {

    public static void main (String[]args){


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
    public static int dogaction(Scanner sc, tamogachi[]bla) {
        int waitforaction = Integer.parseInt(sc.nextLine());
        if (waitforaction == 1) {
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
            System.out.println("Energy level is now: " + bla[0].Energyreduce());
        }else if(waitforaction == 2){
            System.out.println("              _\n" +
                    "            ,/A\\,\n" +
                    "          .//`_`\\\\,\n" +
                    "        ,//`____-`\\\\,\n" +
                    "      ,//`[_ROVER_]`\\\\,\n" +
                    "    ,//`=  ==  __-  _`\\\\,\n" +
                    "   //|__=  __- == _  __|\\\\\n" +
                    "   ` |  __ .-----.  _  | `\n" +
                    "     | - _/       \\-   |\n" +
                    "     |__  | .-\"-. | __=|\n" +
                    "     |  _=|/)   (\\|    |\n" +
                    "     |-__ (/ a a \\) -__|\n" +
                    "     |___ /`\\_Y_/`\\____|\n" +
                    "          \\)8===8(/\n");
            System.out.println("Your dog is Sleeping");
            System.out.println("Energy level is now: " + bla[0].Energyadd());
        }else if (waitforaction == 3){
            System.out.print("    ,    /-.\n" +
                    "   ((___/ __>\n" +
                    "   /      }\n" +
                    "   \\ .--.(    ___\n" +
                    "    \\\\   \\\\  /___\\\n");
            System.out.println("What should your dog eat");
            System.out.println("pick between: Fish/Bone/Milk/Meat");
            String waitforfood = sc.nextLine();
            if(waitforfood.equalsIgnoreCase("Fish")){
                System.out.println("Dog didnt mind fish but likes other things more");
                System.out.println("Energy level is now: " + bla[0].Energyadd());
            }

        }
        return waitforaction;
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
            System.out.println("3. Give pet food +?/+? for dog/cat");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
    }
}
