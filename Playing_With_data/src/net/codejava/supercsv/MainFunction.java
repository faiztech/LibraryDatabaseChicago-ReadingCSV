package net.codejava.supercsv;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class MainFunction {

    public static void main(String[] args) {


        //Reading the CSV and putting it into a Map also creating a list of choices to use with the JOptionPane
        String filename = "Playing_With_data/src/main/java/Libraries.csv";
        Map<String, Library> map = new HashMap<>();
        String[] choices = new String[83];
        new ReadCSV(filename, map, choices);


        //USER INTERFACE using JOptionPane
        String input = (String) JOptionPane.showInputDialog(null, "Please select a library from the dropdown",
                "Search Library Information", JOptionPane.QUESTION_MESSAGE, null,
                choices, // Array of choices
                choices[0]); // Initial choice

        if (input.equals("--Select a Library--")) {
            System.out.println("Please re run and select a Library");
            JOptionPane.showMessageDialog(null, "Please re run and select a Library", "ERROR", JOptionPane.ERROR_MESSAGE, null);

        } else {
            System.out.println("Showing results for " + input);
            System.out.println(map.get(input).toString());
            JOptionPane.showMessageDialog(null, map.get(input).toString(), input + " Library Information:", JOptionPane.INFORMATION_MESSAGE, null);

        }

    }

}
