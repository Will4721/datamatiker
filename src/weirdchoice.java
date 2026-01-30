import java.util.Scanner;

public class weirdchoice {
    public static String Message04 () {
        String text = "\n What do you do?\nA: Shoot yourself\nB: Run out\nC: Suck it up and stay till the end\nType the letter too answer";

        return text;
    }
    public void main(String[] args) {
        int p = 0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("You are in class\nYou dont want to be there anymore\nWhat do you do?\nA: Shoot yourself\nB: Run out\nC: Suck it up and stay till the end\nType the letter too answer");
        String start = myObj.nextLine();
        if (start.equals("C")|| start.equals("c")){
            System.out.println("A fire starts in the class you die :(\nGame over");
        }
            if (start.equals("A") || start.equals("a")) {
                System.out.println("Why do you have a gun in class?");
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Teacher karate kicks you and you die instantly");
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Game over");
            }
        if (start.equals("B") || start.equals("b")) {
            System.out.println("Teacher calls the police");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("They track you down and deliver you back to class");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Message04());
            Scanner newObj = new Scanner(System.in);

            String startagain = newObj.nextLine();
            if (startagain.equals("A") || startagain.equals("a")) {
                System.out.println("Why do you have a gun in class?");
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Teacher karate kicks you and you die instantly");
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Game over");
            }
            if (startagain.equals("C") || startagain.equals("c")) {
                System.out.println("A fire starts in the class you die :(\nGame over");
            }

            if (startagain.equals("B") || startagain.equals("b")) {
                System.out.println("it didnt work the first time it wont work the second time LOL");
                Scanner newnewObj = new Scanner(System.in);
                System.out.println("What do you do?\nA: Shoot yourself\nC: Suck it up and stay till the end\nType the letter too answer");
                String startagainagain = newnewObj.nextLine();
                if (startagainagain.equals("C") || startagainagain.equals("c")){
                    System.out.println("A fire starts in the class you die :(\nGame over");
                }
                if (startagainagain.equals("A")|| startagainagain.equals("a")){
                    System.out.println("Why do you have a gun in class?");
                    try {
                        Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Teacher karate kicks you and you die instantly");
                    try {
                        Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Game over");
                }

            }


            }


        }

        }




