package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SearchFileData {

    public String[][] searchUsername(String keyword, String fileDirectory) {
        String[][] returnSearchArr = null;
        
        try {
            InputStream dataFile = SearchFileData.class.getResourceAsStream(fileDirectory);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));
            
            // OOP Method - Get Multidimensional Array
            String[][] searchFileArr = new Create3DArray().create3D(fileDirectory);
            
            int countCol = new FileRowColumn().countFileColumnNumber(fileDirectory);
            int countReturnRow = 0;
            
            // Search Username Function
            for(String[] dataArr : searchFileArr) {
                if(dataArr[0].startsWith(keyword)) {
                    countReturnRow++;
                }
            }
            
            // Create a new multidimensional containing only the searched array
            returnSearchArr = new String[countReturnRow][countCol];
            int index = 0;
            
            for(String[] dataArr : searchFileArr) {
                if(dataArr[0].startsWith(keyword)) {
                    returnSearchArr[index++] = dataArr;
                }
            }
            
            // Close File
            dataFile.close();
            br.close();
        }
        
        catch(IOException e) {
            System.out.println("Search Error: " + e);
        }
        
        return returnSearchArr;
    }
}
