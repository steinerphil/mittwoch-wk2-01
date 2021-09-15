package Main;
import Animal.*;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");
        Animal cow = new Animal("Cow");

        AnimalList firstList = new AnimalList();

        System.out.println(firstList.toString());
        System.out.println("*************");

        firstList.add(dog);
        firstList.add(cow);
        firstList.add(cat);
        System.out.println(firstList.toString());
        System.out.println("*************");

        firstList.remove(cow);
        System.out.println(firstList.toString());
        System.out.println("*************");


    }
}
