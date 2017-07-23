package net.codejava.supercsv;


import java.io.FileReader;
import java.io.IOException;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;
import java.io.FileNotFoundException;
import java.util.Map;


public class ReadCSV
{
    ICsvBeanReader beanReader = null;

    public ReadCSV(String fileN, Map map, String[] choices)
    {

        int i = 0;


        CellProcessor[] processors = new CellProcessor[]{new NotNull(), new NotNull(), new NotNull(), new NotNull(), new NotNull(), new NotNull()};


        try
        {
            beanReader = new CsvBeanReader(new FileReader(fileN), CsvPreference.STANDARD_PREFERENCE);

            String[] header = beanReader.getHeader(true);

            Library libBean = null;
            choices[i++] = "--Select a Library--";

            while ((libBean = beanReader.read(Library.class, header, processors)) != null)
            {
                map.put(libBean.getName(), new Library(libBean.getName(), libBean.getHoursOfOp(), libBean.getAddress(), libBean.getZip(), libBean.getPhone(), libBean.getWebsite()));
                choices[i++] = libBean.getName();
            }


        } catch (FileNotFoundException ex)
        {
            System.err.println("Could not find the CSV File: " + ex);
        } catch (IOException ex)
        {
            System.err.println("Error reading the CSV file: " + ex);
        } finally
        {
            if (beanReader != null)
            {
                try
                {
                    beanReader.close();
                } catch (IOException ex)
                {
                    System.err.println("Error closing the reader: " + ex);
                }
            }



























        }

    }
}

