/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Combo{
  //variables 
   private int one,two,three,four,five,powerball;
   private Reader reader = new Reader("file.txt");
   int[] combo;
   //constructors
   public Combo() throws IOException{
      int[] output = realList();
   }
   
  public ArrayList makeFullList() throws IOException{
      ArrayList<Integer> list = new ArrayList<> ();
     final int MAX = 4;
     int[]combination;
     
     for(int line = 0; line < reader.readLines(); line++){ //goes through reader obj line by line
         combination = reader.getInts(line);
         for(int index = 0; index < MAX; index++){ //goes through string array element by element
           list.add(combination[index]);        
     }
         }
      return list;    
  }
  
  public int[] realList() throws IOException{
      LinkedList<IntCounter> list = new LinkedList(); // list being returned
      ArrayList<Integer> numbers = makeFullList(); // Full list of numbers
      Integer nums[] = new Integer[numbers.size()];
      nums = numbers.toArray(nums); //copies list into array for easier traversal
      int[] occurences = new int[60];
      int MAX = 59; // highest possible lottery number
      int count; // counts how many times 
      int index;
      IntCounter counted;
      
      for(int i = 0; i <= MAX; i++){
          count = 0;
          for(index = 0; index < nums.length; index++){
              if(index == i)
                  count++;
          }
          occurences[i] = count;
      }
      return occurences;
      }
      /**
       for(int i = 0; i <= MAX; i++){ // checks to see if number in array matches current number
          count = 0;
          index = 0;
          while(index < nums.length){ // goes thru entire nums array
             if(index == i){
                 count++;
                 index++;
             }
             else {
                 index++;
             }
             }
          counted = new IntCounter(i, count);
          list.add(counted);
    }
    * **/
      
  public void print()throws IOException{
     int[] list = realList();
     for(int i = 0; i < list.length; i++)
         System.out.println(list[i]);
  }
}

