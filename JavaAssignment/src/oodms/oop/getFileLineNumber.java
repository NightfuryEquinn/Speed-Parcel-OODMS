package oodms.oop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class GetFileLineNumber {
    public int countFileLineNumber(String fileDirectory) {
        int lineLength = 0;
        
        try {
            InputStream dataFile = GetFileLineNumber.class.getResourceAsStream(fileDirectory);

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
}
