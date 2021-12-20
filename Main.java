/**You need ask the user for input "How many times will like the coin the flip". User can up to 1000 times. 
Randomly genearte a number btw 1 and 10.
Store all the numbers in an array. 
Do this repetely for the number of times the user inputed as flip number.
How many times each number out of 10 showed up.
Which number showed up most often.
If even numbers are heads, and odd numbers are tails, which side of the coin came up more often?**/

import java.util.Scanner; 
import java.util.Random;
import java.util.Arrays;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	    System.out.println("Please enter how many times you will like to flip? ");
	    int noOfTimesToFlip = myScanner.nextInt();
	    Random myRandom = new Random();
	    int max = 10;
	    int min = 1;
	   int [] randomNumStorage = new int [noOfTimesToFlip]; 
	   for(int i = 0; i < noOfTimesToFlip; i++){
	       int randomNum = myRandom.nextInt((max - min) + 1 ) + min;
	       randomNumStorage[i] = randomNum;
	   }
	   //System.out.println("The length/size of the array is " + randomNumStorage.length);
	   int count1 = 0; 
	   int count2 = 0; 
	   int count3 = 0; 
	   int count4 = 0; 
	   int count5 = 0;
	   int count6 = 0; 
	   int count7 = 0;
	   int count8 = 0; 
	   int count9 = 0; 
	   int count10 = 0;
	   TreeMap<Integer, Integer> NumbersAndTheirCount = new TreeMap<Integer, Integer>();
	   for(int i = 0; i < randomNumStorage.length; i++){
	       
	       if(randomNumStorage[i] == 1){
	           count1 += 1;
	           NumbersAndTheirCount.put(1, count1);
	       }
	       else if(randomNumStorage[i] == 2){
	           count2 += 1;
	           NumbersAndTheirCount.put(2, count2);
	       }
	       else if(randomNumStorage[i] == 3){
	           count3 += 1;
	           NumbersAndTheirCount.put(3, count3);
	       }
	       else if(randomNumStorage[i] == 4){
	           count4 += 1;
	           NumbersAndTheirCount.put(4, count4);
	       }
	       else if(randomNumStorage[i] == 5){
	           count5 += 1;
	           NumbersAndTheirCount.put(5, count5);
	       }
	       else if(randomNumStorage[i] == 6){
	           count6 += 1;
	           NumbersAndTheirCount.put(6, count6);
	       }
	       else if(randomNumStorage[i] == 7){
	           count7 += 1;
	           NumbersAndTheirCount.put(7, count7);
	       }
	       else if(randomNumStorage[i] == 8){
	           count8 += 1;
	           NumbersAndTheirCount.put(8, count8);
	       }
	       else if(randomNumStorage[i] == 9){
	           count9 += 1;
	           NumbersAndTheirCount.put(9, count9);
	       }
	       else if(randomNumStorage[i] == 10){
	           count10 += 1;
	           NumbersAndTheirCount.put(10, count10);
	       }
	   }
	   int countsArray [] = {count1, count2, count3, count4, count5, count6, count7, count8, count9, count10};
	   Arrays.sort(countsArray);
	   System.out.println("Sorted Array: " + Arrays.toString(countsArray));
	   int highestCount = countsArray[(countsArray.length) - 1];
	   System.out.println("The highest COUNT of random numbers is " + highestCount);
	   Set<Integer>Keys = NumbersAndTheirCount.keySet();
	   int mostFreqNum = 0;
	   for (Integer key : Keys){
	       if(NumbersAndTheirCount.get(key) == highestCount) {
	           mostFreqNum += key;
	           System.out.println("The most freq num with the highest Count of " + highestCount + " is " + key);
	       }
	   }
	   if (mostFreqNum % 2 == 0) {
	        System.out.println("The side of the coin that came up most often is Head because the most freq num was " + mostFreqNum);
	   }
	   else {
	        System.out.println("The side of the coin that came up most often is tail because the most freq num was " + mostFreqNum);
	   }  
	   
	   System.out.println("The count of one's is " + count1);
	   System.out.println("The count of two's is " + count2);
	   System.out.println("The count of three's is "+ count3);
	   System.out.println("The count of four's is " + count4);
	   System.out.println("The count of five's is " + count5);
	   System.out.println("The count of six's is " + count6);
	   System.out.println("The count of seven's is " + count7);
	   System.out.println("The count of eight's is " + count8);
	   System.out.println("The count of nine's is " + count9);
	   System.out.println("The count of ten's is " + count10); 
	}
}