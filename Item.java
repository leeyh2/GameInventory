public class Item
{
    protected String name;
    protected String description;
    protected double weight;
    protected double value;

    public Item(String name, String description, double weight, double value)
    {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item name:\t" + name +
               "\nDescription: \t" + description +
                "\nWeight: \t" + weight + "lbs" +
                "\nValue: \t" + value + " gold pieces";
    }
}
