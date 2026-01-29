import java.util.Scanner;

public class Weathercreatervariable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String[] weather = {"Thunder", "Rain", "Dry", "Snow"};
        int p = 0;
        int temp = 0;
        int windspeed = 0;
        boolean rain = false;
        System.out.println("would you like to start the weather\t type start to begin");
        String start = myObj.nextLine();

        if (start.equals("start")){
           temp =  (int)(Math.random() * 101);
           windspeed = (int)(Math.random() * 101);
            System.out.println(temp);
            System.out.println(windspeed);
        }

        for (int i = 0; i <10; i++){

        }

        while (p == 0) {
            System.out.println("hi");

        }
    }

}
