public class Clue extends Item
{
    private String personIncriminated;
    private boolean accuracy;

    public Clue(String name, String description, double weight, double value)
    {
        super(name,description,weight,value);
        this.personIncriminated = personIncriminated;
        this.accuracy = accuracy;
    }

    public void setPersonIncriminated(String personIncriminated) {
        this.personIncriminated = personIncriminated;
    }

    public void setAccuracy(boolean accuracy) {
        this.accuracy = accuracy;
    }

    public String getPersonIncriminated() {
        return personIncriminated;
    }

    public boolean getAccuracy() {
        return accuracy;
    }
}
