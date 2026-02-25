public class player extends round{
    public player(int health, int damage) {
        super(health, damage);
    }
    @Override
    public String toString() {
        return  "Player -> Health: " + getHealth() +
                " Damage: " + getDamage();
    }
}
