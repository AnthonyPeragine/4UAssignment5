/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class OrderedList {

    private IntNode head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        //start at beginning of list
        IntNode node = head;
        //see if it is the first item
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else if (node != null && node.getNum() > num) {
            IntNode temp = new IntNode(num);
            temp.setNext(node);
            head = temp;

        } else {
            //travel to the end
            while (node != null && node.getNext() != null && node.getNext().getNum() < num) {
                //travel to next node
                node = node.getNext();
            }
            //node is the last node
            //create a new node for the input
            IntNode temp = new IntNode(num);
            temp.setNext(node.getNext());
            //insert node into list
            node.setNext(temp);
        }
        //increase the size counter
        numItems++;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int position) {
        IntNode node = head;
        //move the number of times
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    public void remove(int num) {

        if (num == head.getNum()) {
            head = head.getNext();
        } else {

            //set node = start of list
            //go through the list until it finds the entered value
            IntNode node = head;
                while (node != null && node.getNext() != null) {
                    if (node.getNum() == num) {
                        //the node to remove
                        IntNode toRemove = node.getNext();
                        //next node
                        IntNode next = toRemove.getNext();
                        //set all the links
                        node.setNext(next);
                        toRemove.setNext(null);
                        break;
                    } else {
                        node = node.getNext();
                    }
                }
            }
        //decrease numitems
        numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderedList list = new OrderedList();

        System.out.println("Size: " + list.size());
        list.add(8);
        list.add(6);
        list.add(6);
        list.add(3);
        list.add(1);
        System.out.println("First position: " + list.get(0));
        System.out.println("" + list.get(1));
        System.out.println("" + list.get(2));
        System.out.println("" + list.get(3));
        System.out.println("" + list.get(4));
        
        System.out.println("-----------------");
        System.out.println("REMOVE 6");

        list.remove(6);
        System.out.println("First position: " + list.get(0));
        System.out.println("" + list.get(1));
        System.out.println("" + list.get(2));
        System.out.println("" + list.get(3));

    }
}
