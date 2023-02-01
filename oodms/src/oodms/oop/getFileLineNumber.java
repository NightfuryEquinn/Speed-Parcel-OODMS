package oodms.oop;

import java.io.InputStream;
import java.util.Scanner;

public class getFileLineNumber {
    int countFileLineNumber(String fileDirectory) {
        InputStream dataFile = encapsulation_welcomePage.class.getResourceAsStream(fileDirectory);
        
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
