package app;

import model.LinkedList;

/**
 *
 * @author Lucas de Castro
 */
public class TestLinkedList {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list);
        list.addBeginning("mauricio");
        System.out.println(list);
        list.addBeginning("paulo");
        System.out.println(list);
        list.addBeginning("guilherme");
        System.out.println(list);
        
        list.add("Lucas");
        System.out.println(list);
        
        list.add(2, "Lucas de Castro");
        System.out.println(list);
        
        list.removeBeginning();
        System.out.println(list);
    }
}
