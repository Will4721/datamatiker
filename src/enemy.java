public class enemy extends round {
     int health;

    public enemy(int health, int damage) {
        super(health, damage);
    }
    @Override
    public String toString() {
        return  "enemy -> Health: " + getHealth() +
                " Damage: " + getDamage();
    }
}
