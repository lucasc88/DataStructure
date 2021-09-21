package model;

/**
 *
 * @author Lucas de Castro
 */
public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int total = 0;

    public void addBeginning(Object element) {
        Cell cell = new Cell(element, first);
        this.first = cell;

        if (total == 0) {
            this.last = this.first;
        }

        total++;
    }

    public void add(Object element) {
        if (total == 0) {
            addBeginning(element);
        } else {
            Cell cell = new Cell(element, null);
            this.last.setNext(cell);
            this.last = cell;

            this.total++;
        }
    }

    private boolean occupiedPosition(int position) {
        return position >= 0 && position < this.total;
    }

    private Cell getCell(int position) {
        if (!occupiedPosition(position)) {
            throw new IllegalArgumentException("Non-existent position");
        }

        Cell actual = first;
        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public void add(int posicao, Object element) {
        if (total == 0) {
            addBeginning(element);
        } else if (posicao == total) {
            add(element);
        } else {
            Cell previous = this.getCell(posicao - 1);
            Cell cell = new Cell(element, previous.getNext());
            previous.setNext(cell);
            this.total++;
        }
    }

    public Object get(int position) {
        return this.getCell(position);
    }

    public void removeBeginning(){
        if(total == 0){
            throw new IllegalArgumentException("List is empty, you cannot remove");
        }
        
        this.first = first.getNext();
        this.total--;
        
        if(total == 0){
            this.last = null;
        }
    }
    
    public void remove(int posicao) {
    }

    public int size() {
        return this.total;
    }

    public boolean contains(Object o) {
        return false;
    }

    @Override
    public String toString() {

        if (this.total == 0) {
            return "[]";
        }

        Cell atual = first;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < total; i++) {
            builder.append(atual.getObject());
            builder.append(",");

            atual = atual.getNext();
        }

        builder.append("]");

        return builder.toString();
    }
}
