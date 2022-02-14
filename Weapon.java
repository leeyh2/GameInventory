public class Weapon extends Clue
{
    private int damage;
    private DamageType damageType;

    public Weapon(String name, String description, double weight, double value)
    {
        super(name,description,weight,value);
        this.damage = damage;
        this.damageType = damageType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getDamage() {
        return damage;
    }

    public DamageType getDamageType() {
        return damageType;
    }
}
