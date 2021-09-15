package Animal;

public class AnimalListItem extends Animal{

    private Animal value;
    private AnimalListItem next;


    public AnimalListItem(Animal value) {
        this.value = value;
    }

    @Override
    String makeSound() {
        return null;
    }
}


