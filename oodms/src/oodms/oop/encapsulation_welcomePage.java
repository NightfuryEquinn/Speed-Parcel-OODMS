package oodms.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import oodms.general.WelcomePage;

public class encapsulation_welcomePage {

    public static void main(String[] args) {
        try {
            InputStream dataFile = WelcomePage.class.getResourceAsStream("/oodms/database/credentialsData.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(dataFile));

            String credentials;

            credentials = br.readLine();
            
            String[] credentialsArr = credentials.split("\\s\\|\\s");

            System.out.println(credentialsArr);
        }
        
        catch(IOException e) {
            
        }
    }
}
