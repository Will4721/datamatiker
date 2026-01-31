public class opgavemogens {
    public static void main(String[] args) {
        String[] Mission = {"M","i","s","s","i","o","n","\t","Y","e","a","r","\t","D","a","y","s"," ","i","n","\t","s","p","a","c","e","\n","I","r","i","s","s","\t","2","0","1","5","\t","1","0","\n","H","u","g","i","n","n","\t","2","0","2","3","\t","1","8","0"};

        for (int i=0; i<56;i++){
            System.out.print(Mission[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("Mission\t Year\t Days in space\nIriss\t 2015\t 10\nHuginn\t 2023\t 180");
        System.out.println("\n");

        System.out.println("   /\\ \n  /  \\ \n /____\\ \n |    |\n |ISS |\n |____|\n   ||\n   ||\n  /  \\ \n /____\\ ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
