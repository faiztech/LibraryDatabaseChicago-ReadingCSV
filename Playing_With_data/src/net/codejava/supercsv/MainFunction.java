package net.codejava.supercsv;

import java.util.HashMap;
import java.util.Map;


public class MainFunction
{

    public static void main(String[] args)
    {


        //Reading the CSV and putting it into a Map
        String filename =  "src/main/java/Libraries.csv";
        Map<String, Library> map = new HashMap<>();
        new  ReadCSV(filename, map);


        System.out.println(map.get("Altgeld").toString());



    }

}
