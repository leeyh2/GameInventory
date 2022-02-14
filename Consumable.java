public class Consumable extends Item
{
    private int healthEffect;
    private int dosesRemaining;

    public Consumable(String name, String description, double weight, double value)
    {
        super(name,description,weight,value);
       this.healthEffect = healthEffect;
       this.dosesRemaining = dosesRemaining;
    }

    public void setHealthEffect(int healthEffect) {
        this.healthEffect = healthEffect;
    }

    public void setDosesRemaining(int dosesRemaining) {
        this.dosesRemaining = dosesRemaining;
    }

    public int getHealthEffect() {
        return healthEffect;
    }

    public int getDosesRemaining() {
        return dosesRemaining;
    }
}
