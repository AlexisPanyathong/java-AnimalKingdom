package animalkingdon;

//"Abstract" methods

public abstract class Animals
{   String name;
    int yearDiscovered;
    int id;
    private static int maxId = 0;

    public Animals(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String eat()
    {
        return name + " is eating";
    }

    public String getName()
    {
        return name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    public void move();
    public void breathe();
    public void reproduce();
}