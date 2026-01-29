public class opgavemogens {
    public static void main(String[] args) {
        System.out.println("Mission\t Year\t Days in space\nIriss\t 2015\t 10\nHuginn\t 2023\t 180");

        System.out.println("   /\\ \n  /  \\ \n /____\\ \n |    |\n |ISS |\n |____|\n   ||\n   ||\n  /  \\ \n /____\\ ");
        //rocket effect
        for (int i=0; i<12; i++){
            System.out.println("  ||||");
            //wait function taget fra stack overflow
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("**************************\n**************************\n    LAUNCH SUCCSESS\n    MISSION COMPLETE\n**************************\n**************************");
    }
}
