package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;

public class encapsulation_welcomePage {

    public static void main(String[] args) {
        try {
            // Get file from another package
            InputStream dataFile = encapsulation_welcomePage.class.getResourceAsStream("/oodms/database/credentialsData.txt");
            
            // Read file
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));
            
            // Get Number of Lines in File
            LineNumberReader lnr = new LineNumberReader(new InputStreamReader(dataFile));
            
            int lineLength = lnr.getLineNumber();

            // Create Array in Array
            String credentials;
            
            credentials = br.readLine();
            
            String[] credentialsData = credentials.split("\\s\\|\\s");
            
            String[][] credentialsArr = new String[lineLength][2];
        }
        
        catch(IOException e) {
            
        }
    }
}
