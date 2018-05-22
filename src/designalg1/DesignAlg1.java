
package designalg1;

/**
 * 
 * Created by Brian Orwick
 * 5/17/2018
 * DesignAlg1 was created to implement and test a sorting algorithm
 * Insertion algorithm is used
 * 
 */
public class DesignAlg1 {

    /**
     * 
     * Source of Algorithm:
     * Data Structures and Algorithms Made Easy
     * 5th edition
     * Narasima Karumanchi, M.Tech. IIT Bombay
     * Copyright 2017
     * 
     * and 
     * 
     * http://www.java2novice.com/java-interview-programs/insertion-sort/
     * 
     **/

    public static void main(String[] args) {

        int[] unsorted = {2, 5, 3, 1, 8, };
        insertionSort(unsorted);
    }

    private static void printNumbers(int[] input) {

        for (int anInput : input) {
            System.out.print(anInput + ", ");
        }
        System.out.println("\n");
    }

    private static void insertionSort(int unsorted[]) {
        
        for (int j = 1; j < unsorted.length; j++) {
           
           int i = j-1;
           while ( (i > -1) && ( unsorted [i] > unsorted[j] ) ) {
               unsorted [i+1] = unsorted [i];
               i--;
           }
           unsorted[i+1] = unsorted[j];
           printNumbers(unsorted);
        }
    }
}