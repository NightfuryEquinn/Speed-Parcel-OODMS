package oodms.oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FlushAndWrite {

    public void flushAndWrite(String[][] existingArr, String fileDirectory) {
        try {
            File f = new File(fileDirectory);
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
            System.out.println("Write file error: " + e);
        }
    }
}
