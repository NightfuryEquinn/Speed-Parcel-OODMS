package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WriteNewCustomer {
    public void newCustomer(String username, String password, String email, String contact, String address) {
        try {
            InputStream dataFile = WriteNewCustomer.class.getResourceAsStream("/oodms/database/credentials.txt");
        
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
            
            // New Customer Array
            String[] newCustomerArr = {username, password, email, contact, address};
            
            // Write file
            credentialsArr = addNewCustomer(credentialsArr, newCustomerArr);
            FlushAndWrite flushWrite = new FlushAndWrite();
            flushWrite.flushAndWrite(credentialsArr, "src/oodms/database/credentials.txt");
        }
        
        catch(IOException e) {
            System.out.println("Add New Customer Error: " + e);
        }
    } 
    
    // Add New Customer Data into Existing Customer Data
    public static String[][] addNewCustomer(String[][] existingArr, String[] newArr) {
        int arrRow = existingArr.length;
        int arrCol = existingArr[0].length;
        
        String[][] newExistingArr = new String[arrRow + 1][arrCol];
        
        for(int i = 0; i < arrRow; i++) {
            System.arraycopy(existingArr[i], 0, newExistingArr[i], 0, arrCol);
        }
        
        System.arraycopy(newArr, 0, newExistingArr[arrRow], 0, arrCol);
        
        return newExistingArr;
    }
}
