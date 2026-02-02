import java.util.Scanner;

public class Tivoli {
    public static void main(String[] args) {
        System.out.println("Please enter name");
        Scanner newObj = new Scanner(System.in);
        String resuname = newObj.nextLine();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter height");
        int resu = myObj.nextInt();
        if (resu > 170){
            System.out.println("Your tall enough too try all the rides. You can choose between\nA: carousel\nB: bumber carts\nC: The rollercoaster\nType 'A' or 'B' or 'C'");
            String resu4 = newObj.nextLine();
            if (resu4.equals("A")||resu4.equals("a")){
                System.out.println("Your now on the carousel have fun :)");
            }
            if (resu4.equals("B")||resu4.equals("b")){
                System.out.println("Your now on the bumber carts have fun :)");
            }
            if (resu4.equals("C")||resu4.equals("c")){
                System.out.println("Your now on the rollercoaster have fun :)");
            }
        }
        if (resu < 170){
            System.out.println("sorry " + resuname + " your not allowed to try the ultimate rollercoaster that is super fun and everybody loves, too bad");
            System.out.println("May i suggest the carousel or perhaps the bumber carts instead\nA: carousel\nB: bumber carts\nType 'A' or 'B'");
            String resu4 = newObj.nextLine();
            if (resu4.equals("A")||resu4.equals("a")){
                System.out.println("Your now on the carousel have fun :)");
            }
            if (resu4.equals("B")||resu4.equals("b")){
                System.out.println("Your now on the bumber carts have fun :)");
            }

        }
    }
}
