package Animal;

public class AnimalListItem extends AbstractAnimal{

    private AbstractAnimal value;
    private AnimalListItem next;


    public AnimalListItem(AbstractAnimal value) {
        this.value = value;
    }

    public AbstractAnimal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setValue(AbstractAnimal value) {
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