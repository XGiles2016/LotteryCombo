/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
import java.io.File;

public class Parse {
    
    private static final String URL = "http://www.powerball.com/powerball/pb_frequency.asp?matrixID=4&graph=0";
    
    public Parse() throws IOException{
        Document doc;
        File file = new File("C:\\Users\\Xavi\\Documents\\NetBeansProjects\\Lottery");
        PrintWriter printWriter = new PrintWriter("file.txt");
        
        try {
            doc = Jsoup.connect(URL).get(); //parses lottery HTML page
            Element table = doc.select("tbody").get(0); // needs to be edited to trim unnecessary info
            Elements rows = table.select("tr"); // collects all items with "tr" element
            for(int i = 1; i < rows.size(); i++){
                Element row = rows.get(i);
                Elements cols = row.select("td");
                printWriter.println(cols.text()); // prints winning numbers to file.txt
            }
            printWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

