package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Create3DArray {
    public String[][] create3D() {
        // Declare for multidimensional array
        String[][] credentialsArr = null;
        
        try {
            // Get file from another package
            InputStream dataFile = Create3DArray.class.getResourceAsStream("/oodms/database/credentials.txt");

            // Read file
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));

            // OOP Method - Get .txt file line number
            FileLineNumber lineLength = new FileLineNumber();
            int lineCount = lineLength.countFileLineNumber("/oodms/database/credentials.txt");

            // Create Array in Array
            String[] credentialsData;
            credentialsArr = new String[lineCount][5];

            String line;
            int pass = 0;

            while((line = br.readLine()) != null) {
                credentialsData = line.split("\\s\\|\\s");

                System.arraycopy(credentialsData, 0, credentialsArr[pass], 0, credentialsData.length);

                pass++;
            }

            // Close file
            dataFile.close();
            br.close();
        }
        
        catch(IOException e) {
            System.out.println("Array Error:" + e);
        }
        
        return credentialsArr;
    }
}
