public class enemy extends round {
    public enemy(int health, int damage) {
        super(health, damage);
    }
    @Override
    public String toString() {
        return  "enemy -> Health: " + getHealth() +
                " Damage: " + getDamage();
    }
}
