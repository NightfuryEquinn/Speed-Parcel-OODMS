package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileRowColumn {
    public int countFileRowNumber(String fileDirectory) {
        int lineLength = 0;
        
        try {
            InputStream dataFile = FileRowColumn.class.getResourceAsStream(fileDirectory);

            // Get Number of Line in file
            Scanner scan = new Scanner(dataFile);

            while(scan.hasNextLine()) {
                scan.nextLine();
                lineLength++;
            }

            // Close file
            dataFile.close();
            scan.close();
        }
        
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        
        return lineLength;
    }
    
    public int countFileColumnNumber(String fileDirectory) {
        int defaultColumnLength = 0;
        
        try {
            InputStream dataFile = FileRowColumn.class.getResourceAsStream(fileDirectory);

            // Get first row of file as example
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));
            
            String column;
            String[] defaultColumn;
            
            column = br.readLine();
            defaultColumn = column.split("\\s\\|\\s");
            defaultColumnLength = defaultColumn.length;
            
            // Close File
            dataFile.close();
            br.close();
        }
        
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        
        return defaultColumnLength;
    }
}
