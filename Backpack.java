import java.util.ArrayList;

public class Backpack
{
    private ArrayList<Item> contents = new ArrayList<>();

    public void add(Item item)
    {
        contents.add(item);
    }
    public String listWeapons()
    {
        String weaponString = "";
        for(Item item : contents)
        {
            if(item instanceof Weapon)
                weaponString+= item.toString();
            weaponString+="\n...............................\n";
        }
        return  weaponString;

    }
    public String listClues()
    {
        String clueString = "";
        for(Item item : contents)
        {
            if(item instanceof Clue)
                clueString+= item.toString();
                clueString+="\n...............................\n";
        }
        return  clueString;
    }
    public String listConsumables()
    {
        String consumablesString = "";
        for(Item item : contents)
        {
            if(item instanceof Consumable)
                consumablesString+= item.toString();
            consumablesString+="\n...............................\n";
        }
            return  consumablesString;
    }


}
