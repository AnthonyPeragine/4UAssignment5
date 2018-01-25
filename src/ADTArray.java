/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class ADTArray {

    private int[] array;
    private int numItems;

    public ADTArray() {
        array = new int[10];
        numItems = 0;
    }

    /*
     * Doubles the size of the array
     */
    private void doubleArray() {
        //create a temporary array
        int[] temp = new int[array.length * 2];

        //copies original array onto new, double sized array
        System.arraycopy(array, 0, temp, 0, array.length);

        //set new array as original array
        array = temp;
    }

    /*
     * Adds an integer to the array at the specified position
     * Doubles the array if more space is needed
     * Shifts all required positions further into the array if needed
     */
    public void add(int index, int num) {
        if (numItems + 1 > array.length) {
            doubleArray();
        }
        //shifts all array positions after the entered index up 1 position
        for (int shift = array.length - 1; shift > index; shift--) {
            array[shift] = array[shift - 1];
        }
        //set entered position as entered number
        array[index] = num;
        numItems++;


    }

    public void remove(int pos) {


        //remove the dsignated position
            array[pos] = 0;
            //shift numbers to the left
            for (int shift = pos; shift < array.length - 1; shift++) {
                array[shift] = array[shift + 1];
            }
            numItems--;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int index) {
        return array[index];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ADTArray array = new ADTArray();

        for (int i = 0; i < 10; i++) {
            array.add(i, i);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        array.add(7, 66);

        System.out.println("---------------------");

        for (int i = 0; i < array.size(); i++) {

            System.out.println(array.get(i));
        }
        
        array.remove(2);
        
        System.out.println("-----------------");
        
        for (int i = 0; i < array.size(); i++) {

            System.out.println(array.get(i));
        }
    }
}
