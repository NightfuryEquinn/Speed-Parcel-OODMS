package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CheckUsernamePassword {

    public boolean credentialsChecker(String username, String password, String confirmPassword, String email, String contact, String address) {
        // Declare variable to check for similarity in username and password confirmation
        boolean checkSimilarity = false;
        
        try {
            // Get file from another package
            InputStream dataFile = CheckUsernamePassword.class.getResourceAsStream("/oodms/database/credentials.txt");

            // Read file
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));

            // OOP Method - Get .txt file line number
            GetFileLineNumber lineLength = new GetFileLineNumber();
            int lineCount = lineLength.countFileLineNumber("/oodms/database/credentials.txt");

            // Create Array in Array
            String[] credentialsData;
            String[][] credentialsArr = new String[lineCount][5];

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

            // Check for similarity in Username and Password confirmation
            for(String[] singleData : credentialsArr) {
                if((singleData[0].equalsIgnoreCase(username)) || (username.toLowerCase().startsWith("delivery")) || (username.toLowerCase().startsWith("admin"))) {
                    checkSimilarity = true;
                    break;
                }
            }

            if(!password.equalsIgnoreCase(confirmPassword)) {
                checkSimilarity = true;
            }
        }
        
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
        
        return checkSimilarity;
    }
}
