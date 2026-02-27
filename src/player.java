public class player extends round{
    public player(int health, int damage) {
        super(health, damage);
    }

    public void attack(round target) {
        System.out.println("Player attacks for " + getDamage() + " damage!");
        target.takeDamage(getDamage());
    }

    @Override
    public String toString() {
        return  "Player -> Health: " + getHealth() +
                " Damage: " + getDamage();
    }
}
