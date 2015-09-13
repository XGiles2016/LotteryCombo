/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;


/**
 *
 * @author Xavi
 */
public class IntCounter {
    private int number;
    private int count;
    
    public IntCounter(int a, int b){
        number = a;
        count = b;
    }
    
    public int getNumber(){
        return number;
    }
    public void setNumber(int x){
        number = x;
    }
    public int getCount(){
        return count;
    }
    
    public void setCount(int x){
        count = x;
    }
   public void addToCount(){
       count++;
   } 
}
