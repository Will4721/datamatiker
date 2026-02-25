public abstract class round {
    private int health;
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
}

