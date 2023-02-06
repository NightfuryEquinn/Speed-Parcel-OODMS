package oodms.oop;

import java.io.InputStream;
import java.util.Scanner;

public class GetFileLineNumber {
    int countFileLineNumber(String fileDirectory) {
        InputStream dataFile = GetFileLineNumber.class.getResourceAsStream(fileDirectory);
        
        // Get Number of Line in file
        int lineLength = 0;
        Scanner scan = new Scanner(dataFile);

        while(scan.hasNextLine()) {
            scan.nextLine();
            lineLength++;
        }

        return lineLength;
    }
}
