package Animal;

public class AnimalList {

    private AnimalListItem head;


    public AnimalList() {;
    }

    public AnimalListItem getHead() {
        return head;
    }

    public void setHead(AnimalListItem head) {
        this.head = head;
    }

    @Override
    public String toString() {
        String result = "";
        AnimalListItem current = head;
        if(current == null){
            return "EMPTY";
        }
        else {
            while (current.getNext() != null) {
                result += current.getValue();
                if (current.getNext() != null) {
                    result += " -> ";
                }
                current = current.getNext();
            }
            result += current.getValue();
        }
        return "List: " + result;
    }

    public boolean add(Animal animalToAdd){
        AnimalListItem newInList = new AnimalListItem(animalToAdd);
        newInList.setNext(null);

        if(head == null){
            setHead(newInList);
        }
        else{
            AnimalListItem lastItemInList = head;
            while(lastItemInList.getNext() != null){
                lastItemInList = lastItemInList.getNext();
            }
            lastItemInList.setNext(newInList);
        }
        return true ;
    }

    public boolean remove(Animal animalToRemove){

        if(head.getValue() == animalToRemove){
            head = head.getNext();
        }
        else{
            AnimalListItem animalToCheck = head.getNext();
            AnimalListItem prevAnimal = null;
            while(animalToCheck.getValue() != animalToRemove){
                prevAnimal = animalToCheck;
                animalToCheck = animalToCheck.getNext();
            }
            prevAnimal.setNext(animalToCheck.getNext());


        }




return true;


    }

}
