
package Lottery;

import java.io.IOException;
import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[]args) throws IOException{
        //Parse main = new Parse();
        
       /**
        //outputs from reader object directly
        Reader go = new Reader("file.txt");
        for(int i = 0; i < go.readLines(); i++)
        System.out.println(go.getCombination(i));
        * */
        Combo combo = new Combo();
        combo.printCombination();
}
}
