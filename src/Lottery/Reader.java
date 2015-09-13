/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;
import java.io.IOException;
import java.io.*;
/**
 *
 * @author Xavi
 */
public class Reader {
  
    private String path;
    
    public Reader(String file){
        path = file;
    }
    
    public String[] OpenFile() throws IOException{
       FileReader fr = new FileReader(path);
       BufferedReader br = new BufferedReader(fr);
       
       int numOfLines = readLines();
       String[] textData = new String[numOfLines];
       
       for(int i = 0; i < numOfLines; i++)
       { textData[i] = br.readLine();}
       br.close();
       return textData;
    }
    
    public int readLines() throws IOException{
        BufferedReader read = new BufferedReader(new FileReader(path));
        int count = 0;
        while(read.readLine()!= null)
            count++; 
        return count;
    }
    
    public String[] getNumbers() throws IOException{ // returns all combinations in a String array
        String[] altered = OpenFile();
        String newOne = null;
        int lines = readLines();
        
        for(int i =0; i < lines; i++){
            newOne = getCombination(i);
            altered[i] = newOne;
        }
        return altered;
    }
    
    public String getCombination(int num) throws IOException{ // returns one combination at a time.
        String[] file = OpenFile();
        String a = file[num].substring(12,14) + " ";
        String b = file[num].substring(16,18) + " ";
        String c = file[num].substring(20,22) + " ";
        String d = file[num].substring(24,26) + " ";
        String e = file[num].substring(28,30) + " ";
        String f = file[num].substring(32,34) + " ";
        return a + c + d + e + f;
         
    }
    public int[] getInts(int num) throws IOException{ // returns combination in an int array
        int[] back = new int[6];
        String[] file = OpenFile();
        back[0] = Integer.parseInt(file[num].substring(12,14));
        back[1] = Integer.parseInt(file[num].substring(16,18));
        back[2] = Integer.parseInt(file[num].substring(20,22));
        back[3] = Integer.parseInt(file[num].substring(24,26));
        back[4] = Integer.parseInt(file[num].substring(28,30));
        back[5] = Integer.parseInt(file[num].substring(32,34));
        return back;
    }
}
