package LinkedList.PersonalTaks;
import LinkedList.OneWayLinked.LinkedList;
public class Wrapper extends LinkedList<DataType> {

    public void addNumber(int number) throws EmptyListException {
        if (this.isEmpty()) {
            throw new EmptyListException("Tried adding to an empty list.");
        }

        var curNode = this.head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        if (curNode.getData().checkArr()) {
            this.addToTail(new Node<DataType>(new DataType()));
            curNode = curNode.getNext();
        }

        curNode.getData().addArr(number);

    }
}
