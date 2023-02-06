package oodms.oop;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FlushAndWrite {

    public void flushAndWrite(String[][] existingArr, String fileDirectory) {
        try {
            FileOutputStream toDataFile = new FileOutputStream(fileDirectory);
            OutputStreamWriter osWriter = new OutputStreamWriter(toDataFile);
            BufferedWriter bw = new BufferedWriter(osWriter);
            
            // Flush file
            bw.flush();
            
            for(String[] arrRow : existingArr) {
                for(String dataElement : arrRow) {
                    bw.write(dataElement + " | ");
                }
                bw.write("\n");
            }
            
            // CLose file
            bw.close();
        }
        
        catch(IOException e) {
            System.out.println("Write file error: " + e);
        }
    }
}
