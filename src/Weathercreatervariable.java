import java.util.Scanner;

public class Weathercreatervariable {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int p = 0;
        int temp = 1;
        int windspeed = 1;
        int type = 1;
        System.out.println("would you like to start the weather\t type start to begin");
        String start = myObj.nextLine();

        if (start.equals("start")){
            while (p == 0) {
                Scanner newObj = new Scanner(System.in);
                System.out.println("for diffrent weather type 'next'");
                System.out.println("at any point type 'end' to stop program");
                String next = newObj.nextLine();
                if (next.equals("next")){
                    temp =  (int)(Math.random() * 101);
                    windspeed = (int)(Math.random() * 101);
                    type = (int)(Math.random() * 101);
                    System.out.println("the temp is now\t" + temp + "\t degree Celsius");
                    System.out.println("windspeed is now\t" + windspeed + "km/h");
                }
                if (next.equals("end")){
                    p = 1;
                }
                if (type<50 && type>26){
                    System.out.println("the weather is now thunder");
                }
                if (type<25 && type>0){
                    System.out.println("the weather is now dry");
                }
                if (type<75 && type>51){
                    System.out.println("the weather is now snow");
                }
                if (type<100 && type>76){
                    System.out.println("the weather is now rain");
                }
            }


        }


        }



}
