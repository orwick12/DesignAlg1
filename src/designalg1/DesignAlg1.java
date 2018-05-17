
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
     * http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
     * 
     **/
    
    
    
    public int insertionSort(int [] input){
        int x;
        for(int i = 1; i <= input.length; i++){
            for(int j = i; j>0; j--){
                if(input[j] < input[j-1]){
                    x = input[j];
                    input[j] = input[j-1];
                    input[j-1] = x;
                }
            }    
        }
      return input;
  }
    public static void main(String[] args) {
        
        //start with unsorted array
        int[] unsorted = {4,2,8,3,8};
        
        //sort the unsorted in a new array
        int[] sorted = insertionSort(unsorted);
        
    }
    
}
