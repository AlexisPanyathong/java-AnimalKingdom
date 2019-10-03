package animalkingdom;

// interface contains methods and no fields
// inherits from multiple interface

public class Mammals extends Animals
{
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override 
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    // @Override
    // public String toString()
    // {
    //     return "Mammals {" + "name: ' " + name + '\'' + ", year discovered: " + yearDiscovered + '}';
    // }
    @Override
   public String toString()
   {
       return "Mammals{" +
               "Name='" + name + '\'' +
               ", Year =" + yearDiscovered + '}';
   }
}