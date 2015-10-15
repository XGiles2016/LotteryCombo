/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



public class Combo{
   private Reader reader = new Reader("file.txt");
   HashMap<Integer,Integer> map;
   
   
   public Combo() throws IOException{
      makeFullList();
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
  
  public HashMap realList() throws IOException{ // creates array with occurences of number
      ArrayList<Integer> numbers = makeFullList(); // Full list of numbers
      int count;
      map = new HashMap();
      for(int currentNumber = 0; currentNumber < 60; currentNumber++){
          count = 0;
        for(int num : numbers){
            if(num == currentNumber)
                count++;
        }     
      map.put(currentNumber, count);
      }
      return map;
  }

  public int[] twentyHighestNumbers()throws IOException{
      HashMap<Integer,Integer> list = realList();
      final int SIZE = 20;
      int[] combination = new int[SIZE];
      int index = 0;
      while(index < SIZE){
        
      Map.Entry<Integer,Integer> maxEntry = null;
      for(Map.Entry<Integer,Integer> entry : list.entrySet()){
          if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
            maxEntry = entry;  
          }
      }
      combination[index] = maxEntry.getKey();
      list.remove(maxEntry.getKey());
      index++;
      }
      Arrays.sort(combination);
      return combination;
  }
  
  public int[][] fiveCombos() throws IOException{
      int[] twentyNums = this.twentyHighestNumbers();
      int length = 5;
      int width = 5;
      int[][] combos = new int[length][width];
      for(int i = 0; i < length; i++){
          for(int j = 0; j < width; j++)
              combos[i][j] = twentyNums[randomNumber()];
      }
      return combos;
  }
  
  private int randomNumber(){
      Random rand = new Random();
      return rand.nextInt(20);
      
  }
  
  public void printCombination() throws IOException{
      int[][] combination = this.fiveCombos();
      for(int[] number : combination){
          for(int num : number)
            System.out.print(num + " ");
          System.out.println();
      }
  }
  
  public void printList()throws IOException{
     HashMap<Integer,Integer> list = realList();
     for(Map.Entry<Integer,Integer> entry: map.entrySet()){
         int key = entry.getKey();
         int value = entry.getValue();
         System.out.println(key + " " + value);
     }
      
  }
  
}

