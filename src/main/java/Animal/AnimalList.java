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

        if(head == null){
            System.out.println("Error: trying to remove from empty list.");
        }
        else if(head.getValue() == animalToRemove){
            head = head.getNext();
        }
        else{
            AnimalListItem animalToCheck = head.getNext();
            AnimalListItem prevAnimal = head;
            while(animalToCheck.getNext() != null){
                if (animalToCheck.getValue() == animalToRemove){
                    prevAnimal.setNext(animalToCheck.getNext());
                    System.out.println(animalToRemove.getName() + " removed");
                }
                prevAnimal = animalToCheck;
                animalToCheck = animalToCheck.getNext();
            }
            if(animalToCheck.getValue() == animalToRemove){
                prevAnimal.setNext(null);
            }
        }
        return true;
    }


//    public void remove(Animal item) {
//
//        if (head != null) {
//            boolean matchFound = false;
//
//            AnimalListItem temp = head;
//            while (temp.getNext() != null) {
//                if (temp.getNext().getValue().getName() == item.getName()) {
//                    if (temp.getNext().getNext() != null) {
//                        temp.setNext(temp.getNext().getNext());
//                    } else {
//                        temp.setNext(null);
//                    }
//                    matchFound = true;
//                }
//                if (temp.getNext() == null) {
//                    break;
//                } else {
//                    temp = temp.getNext();
//                }
//            }
//
//            if (head.getValue().getName() == item.getName()) {
//                head = head.getNext();
//                matchFound = true;
//            }
//
//            if (!matchFound) {
//                System.out.println("no match found");
//            }
//        } else {
//            System.out.println("no elements");
//        }
//
//    }
















}
