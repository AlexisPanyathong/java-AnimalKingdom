package animalkingdom;

public class Fish extends Animals
{
    public Fish(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }
    
    public String reproduce()
    {
        return "eggs";
    }
    
    // @Override
    // public String toString()
    // {
    //     return "\nFish {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + ", movement: swim, breathing: gills, reproduction: eggs}";
    // }
     @Override
        public String toString()
        {
            return "Fish{" +
                    "Name='" + name + '\'' +
                    ", Year =" + yearDiscovered + '}';
        }
}