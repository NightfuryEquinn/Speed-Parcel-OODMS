package oodms.oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNewCustomer {
    public void newCustomer(String username, String password, String email, String contact, String address) {   
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D("/oodms/database/credentials.txt");

        // New Customer Array
        String[] newCustomerArr = {username, password, email, contact, address};

        // Write file
        credentialsArr = addNewCustomer(credentialsArr, newCustomerArr);
        
        flushAndWrite(credentialsArr, "src/oodms/database/credentials.txt");
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
    
    // Flush and write new and existing data
    public static void flushAndWrite(String[][] existingArr, String fileDirectory) {
        File f = new File(fileDirectory);
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f.getAbsolutePath()));
            
            // Flush file
            bw.flush();
            
            // Loop through the multidimensional array
            for(int i = 0; i < existingArr.length; i++) {
                // Create variable for each array in the multidimensional array
                String[] arrRow = existingArr[i];
                
                // Loop through the array
                for(int j = 0; j < arrRow.length; j++) {
                    // Create Variable for each element in the array
                    String dataElement = arrRow[j];
                    
                    bw.write(dataElement);
                    // Ignore | for the last element
                    if(j != arrRow.length - 1) {
                        bw.write(" | ");
                    }
                }
                // Ignore new line for the last array
                if(i != existingArr.length - 1) {
                    bw.write("\n");
                }
            }
            
            // CLose file
            bw.close();
        }
        
        catch(IOException e) {
            System.out.println("Write Error: " + e);
        }
    }
}
