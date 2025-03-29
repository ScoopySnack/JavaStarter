package gr.aueb.cf.ch19;


/**
 * A class representing a node in a linked list.
 * @param <T>  the type of the item in the node
 */
public class NodeGen <T>{
    private T item;

    public NodeGen() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
