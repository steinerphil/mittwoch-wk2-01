package Animal;

public class AnimalList {

    private AnimalListItem head;


    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public AnimalListItem getHead() {
        return head;
    }

    public void setHead(AnimalListItem head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return head + "->";
    }

    public boolean add(Animal animalToAdd){
        AnimalListItem nextInList = new AnimalListItem(animalToAdd);
        head.setNext(nextInList);
        return true;
    }


}
