/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author Sandesh
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();   
        int[] nums = new int [10000]; //array with the size 10000.
        for( int i=0; i< nums.length; i++){
            nums[i] = rnd.nextInt(201); //random number between 0-200.
             
          }
        int sum =0;
        for (int item: nums){
            sum = sum + item; //Find the sum of the array.
        }
        System.out.println("The sum of this array is " + sum);
        
        double average = 0;
        for(int item: nums){
            average = average + (double)item/nums.length;//Average of the array.
        }
        System.out.println("The average of this array is " + average);
        
        int minvalue = 0;
        for (int item: nums){
            if(item < minvalue){ //Minimum value of the array.
                minvalue = item;
            }
        }
        System.out.println("The Minimun value of this array is " + minvalue);
        
        int maxvalue = 0;
        for (int item: nums){
            if(item > maxvalue){ //Maximum value of an array.
                maxvalue = item;
            }
        }
        System.out.println("The maximum value of this array is " + maxvalue);
        
        int odd = 0;
        int even = 0;
        for (int item : nums){
            if(item % 2 == 0){ //Count the even numbers in the array.
                even++;
            }
            else if(item % 2 == 1){ //Count the odd numbers in the array.
                odd++;
            }
        }
        System.out.println("This array has " + even + " even numbers." );
        System.out.println("This array has " + odd + " odd numbers.");
        }
    }
    

