

public class battleincremental {
    public static void main(String[] args) {
        round[] rounds = registerRounds();
        printRounds(rounds);

    }

    public static round[] registerRounds() {
        round[] rounds = new round[2];
        for (int i = 0; i < 2; i++) {
            if(i == 1) {
                rounds[i] = new player(15, 10);
            }else {
                rounds[i] = new enemy(30, 10);
            }

        }
return rounds;
    }
    public static void printRounds(round[] rounds) {
        for (int i = 0; i < rounds.length; i++) {
            System.out.println(rounds[i]);
        }
    }
}
