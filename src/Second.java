//import java.util.Arrays;
import java.util.Scanner;

void main() {
    int x = 0;
    String[] list = {"Inception", "Løvernes konge", "Star Wars", "Harry potter", "Percy Jackson", "Hunger games", "Twilligt", "Game of thrones", "Jurassic park novel", "harry potter 2"};
    String[] video = {"Inception", "Løvernes konge", "Star Wars", "Harry potter", "Percy Jackson", "Hunger games"};
    String[] book = {"Twilligt", "Game of thrones", "Jurassic park novel", "harry potter 2"};
    Scanner myObj = new Scanner(System.in);
    IO.println("hello there");
    IO.println("hvor mange låneenheder ønskes der indtasted");
    int howmany = Integer.parseInt(myObj.nextLine());
     x = x + howmany;
    IO.println("Mængde\t" + howmany);
    for (int i = 0; i < list.length; i++) {
        IO.println("item number\t" + (i + 1) + "\t" + list[i]);
    }
    Scanner pick = new Scanner(System.in);

    System.out.println("pick book or video, press('v' or 'b') ");
    String borv = pick.nextLine();
    for (int i=1; i < x+1; i++){
     System.out.print("Item number" + "\t" + i + "\n");
    }


    //System.out.println("du valgte\t" + borv);
    // if (borv.equals("b")){
    //   IO.println(Arrays.toString(book));
    //}
    //if (borv.equals("v")){
    //System.out.println(Arrays.toString(video));
    //}
}


