/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
*
* @author peraa0837
*/
public class IntNode {
    private int item;
    private IntNode next;
    
    
    public IntNode(int num){
        item = num;
        next = null;
    }
    /**
     * Returns the number in the node
     * @return the stored number
     */
    public int getNum(){
        return item;
    }
    /**
     * return the next node
     * @return returns next node
     */
    public IntNode getNext(){
        return next;
    }
    
    /**
     * Sets the node that comes after
     * @param node 
     */
    public void setNext(IntNode node){
        next = node;
    }

}

