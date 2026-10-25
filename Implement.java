class Animal {
    
    void run() {

        System.out.println("This animal is eating");
    }
}

class dog extends animal
{
    void bark() {
        System.out.println("The dogs barks : Woof!");
    }
}

interface petAnimal
{
    void eat() {
        System.out.println(" The Animal also eats");
    }
}

class puppy extends dog implements petAnimal
{
    void Drink() {
        System.out.println("The puppy is drinking milk");
    }
}

public class Implement {
    public static void main(String args[]){
        puppy mypuppy = new puppy();
        puppy.Drink();
    }
}