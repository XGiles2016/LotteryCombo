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
  
  public int[] realList() throws IOException{ // creates array with occurences of number
      ArrayList<Integer> numbers = makeFullList(); // Full list of numbers
      int[] occurences = new int[60];
      int MAX = 59; // highest possible lottery number
      int count; // counts how many times 
      
      for(int i = 0; i <= MAX; i++){
        count = 0;
        for(int x : numbers){
            if(x == i)
                count++;
        }
          occurences[i] = count;
      }
      return occurences;
      }
      
  public void printList()throws IOException{
     int[] list = realList();
     for(int i = 0; i < list.length; i++)
         System.out.println(list[i]);
  }
  
  public int[] getCombo() throws IOException{
      int[] combination = new int[5];
      int[] list = realList();
      int max = 0;
      int number;
      for(int index = 0; index < 5; index++){ // index of combination array
        for(int i = 0; i < 60; i++){ //travels through list array one index at a time
          if(list[i] >= max){ //if current number is greater than max
              max = list[i];
              number = i; //keeps track of index of highest number
          }
          
      }
        
        
        
      }
  }
}

