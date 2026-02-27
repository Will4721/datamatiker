public abstract class round {
    private static int health;
    private int damage;

    public round(int health, int damage){
        this.health= health;
        this.damage = damage;
    }
    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    @Override
    public String toString() {
        return "Health: " + health + " Damage: " + damage;
    }

    public static void takeDamage(int amount){
        health -= amount;
        if(health <0){
            health = 0;
            System.out.println("you win round 1");
            health = health + 20;

        }

    }
    public boolean isAlive() {
        return health > 0;
    }
}

