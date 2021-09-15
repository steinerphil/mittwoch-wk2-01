package Animal;

public class AnimalListItem extends Animal {

    private Animal value;
    private AnimalListItem next;


    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    //     @Override
//     String makeSound() {
//     return null;
//    }
    }