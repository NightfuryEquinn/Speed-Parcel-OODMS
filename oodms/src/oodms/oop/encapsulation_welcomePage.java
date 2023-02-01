package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class encapsulation_welcomePage {

    public static void main(String[] args) {
        try {
            // Get file from another package
            InputStream dataFile = encapsulation_welcomePage.class.getResourceAsStream("/oodms/database/credentialsData.txt");
            
            // Read file
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));
            
            getFileLineNumber lineLength = new getFileLineNumber();
            int lineCount = lineLength.countFileLineNumber("/oodms/database/credentialsData.txt");
            
            // Create Array in Array
            String[] credentialsData;
            String[][] credentialsArr = new String[lineCount][2];
            
            String line;
            int pass = 0;
            
            while((line = br.readLine()) != null) {
                credentialsData = line.split("\\s\\|\\s");

                for(int i = 0; i < credentialsData.length; i++) {
                    credentialsArr[pass][i] = credentialsData[i];
                }
                
                pass++;
            }

            System.out.println(Arrays.deepToString(credentialsArr));
            
        }
        
        catch(IOException e) {
            System.out.println("Error");
        }
    }
}
