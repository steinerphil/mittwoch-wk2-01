package Animal;

public class AnimalList {

    private AnimalListItem head;


    public AnimalList(AnimalListItem head) {
        this.head = head;
    }

    public AnimalListItem getHead() {
        return head;
    }

    @Override
    public String toString() {
        return " " +
                "head=" + head +
                '}';
    }
}
