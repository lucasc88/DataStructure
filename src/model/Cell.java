package model;

/**
 *
 * @author Lucas de Castro
 */
public class Cell {
    
    private Object object;
    private Cell next;

    public Cell(Object object, Cell next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }
    
    
}
