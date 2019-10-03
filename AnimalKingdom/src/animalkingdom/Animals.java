package animalkingdom;

public abstract class Animals 
{
    // fields
    public String name;
    public int yearDiscovered;

    // constructor
    public Animals(String name, int yearDiscovered) 
    {
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // methods
    public String getName() 
    {
        return name;
    }

    public int getYearDiscovered() 
    {
        return yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

} 
