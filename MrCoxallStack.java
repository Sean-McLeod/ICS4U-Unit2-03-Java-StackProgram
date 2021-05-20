/*
* This is a class that pushes
* and prints out elements.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-20
*/

import java.util.ArrayList;

public final class MrCoxallStack {
    /** This is an ArrayList for stacking data. */
    private ArrayList<Integer> stackList = new ArrayList<Integer>();

    /**
    * This function returns the top
    * element but doesn't remove it.
    * @return topElement
    */
    public int peekElement() {
        int size = this.stackList.size();
        if (size <= 0) {
            return -1;
        } else {
            int topElement = this.stackList.get(size - 1);
            return (topElement);
        }
    }

    /**
    * This function removes the
    * last element and returns it.
    * @return lastElement
    */
    public int popElement() {
        int size = this.stackList.size();
        if (size <= 0) {
            return -1;
        } else {
            int lastElement = this.stackList.remove(size - 1);
            return (lastElement);
        }
    }

    /**
    * This function pushes
    * elements into the ArrayList.
    * @param preElement
    * @return whether or not it's a valid input
    */
    public int pushNumber(final String preElement) {
        try {
            int anElement = Integer.parseInt(preElement);
            this.stackList.add(anElement);
            return 1;
        } catch (Exception ex) {
            return -1;
        }
    }

    /** This function prints out the elements in the ArrayList. */
    public void printStack() {
        int size = this.stackList.size();
        if (size <= 0) {
            System.out.println("****no item****");
        } else {
            for (int counter = 0; counter < size; counter++) {
                System.out.println(this.stackList.get(counter));
            }
        }
    }
}
