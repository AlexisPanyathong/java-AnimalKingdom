package animalkingdom;

//Almost always need this
import java.util.*;

public class Main
{

    public static ArrayList<Animals> filteredList = new ArrayList<Animals>();

    public static void printAnimals(ArrayList<Animals> animals, CheckAnimals tester)
    {
        filteredList.clear();

        for (Animals a : animals)
        {
            if (tester.test(a))
            {
                //This is printing out the Animal's name, year discovered, how it moves, breathes, and reproduces
                System.out.println(a.getName() + "" + a.getYearDiscovered() + "" + a.move() + "" + a.breathe() + "" + a.reproduce());
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args)
    {
        //Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("BigFoot", 2021);

        //Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animals> animalList = new ArrayList<Animals>();

        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        System.out.println("***Animal List***");
        System.out.println(animalList.toString());
        System.out.println("\n");

        // filter list
        animalList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        System.out.println("***Sorted by Year Named***");
        System.out.println(animalList.toString());
        System.out.println("\n");

        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase((a2.getName())));
        System.out.println("***Sorted Alphabetically by Name***");
        System.out.println(animalList.toString());
        System.out.println("\n");

        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println("***Sorted by Movement***");
        System.out.println(animalList.toString());
        System.out.println("\n");

        System.out.println("***Animals that Breathe with Lungs***");
        printAnimals(animalList, a -> a.breathe() == "lungs");
        System.out.println("\n");

        System.out.println("***Animals that Breathe with Lungs and Named in 1758***");
        printAnimals(animalList, a -> (a.breathe() == "lungs") && (a.getYearDiscovered() == 1758));
        System.out.println("\n");

        System.out.println("***Animals that Lay Eggs & Breathe with Lungs");
        printAnimals(animalList, a -> (a.breathe() == "lungs") && (a.reproduce() == "eggs"));
        System.out.println("\n");

        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println("***Animals that Breathe with Lungs & Named in 1758***");
        printAnimals(animalList, a -> a.getYearDiscovered() == 1758);
        System.out.println("\n");

        System.out.println("***Mammals Sorted Alphabetically***");
        printAnimals(animalList, a -> a instanceof Mammals);

    }
    
}