package oodms.oop;

public class CheckSimilarity {

    // For public use
    public boolean credentialsChecker(String username, String password, String confirmPassword, String email) {
        // Declare variable to check for similarity in username and password confirmation
        boolean checkSimilarity = false;
        
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D("/oodms/database/credentials.txt");

        // Check for similarity in Username and Password confirmation
        for(String[] singleData : credentialsArr) {
            if((singleData[0].equalsIgnoreCase(username)) || (username.toLowerCase().startsWith("delivery")) || (username.toLowerCase().startsWith("admin")) || (singleData[2].toLowerCase().equalsIgnoreCase(email))) {
                checkSimilarity = true;
                break;
            }
        }

        if(!password.equalsIgnoreCase(confirmPassword)) {
            checkSimilarity = true;
        }
        
        return checkSimilarity;
    }
    
    // For admin use to check username
    public boolean credentialsAdminChecker(String username, String email) {
        // Declare variable to check for similarity in username and password confirmation
        boolean checkSimilarity = false;
        
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D("/oodms/database/credentials.txt");

        // Check for similarity in Username and Password confirmation
        for(String[] singleData : credentialsArr) {
            if((singleData[0].equalsIgnoreCase(username)) || (singleData[2].equalsIgnoreCase(email))) {
                checkSimilarity = true;
                break;
            }
        }
        
        return checkSimilarity;
    }
    
    // Check user login
    public boolean loginChecker(String username, String password) {
        // Declare variable to validate existing username and password
        boolean checkUserPass = false;
        
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D("/oodms/database/credentials.txt");
        
        // Check for user input and actual data
        for(String[] singleData : credentialsArr) {
            if((singleData[0].equals(username)) && (singleData[1].equals(password))) {
                checkUserPass = true;
                break;
            }
        }
        
        return checkUserPass;
    }
    
    // Check category name
    public boolean catChecker(String category) {
        boolean checkSimilarity = false;
        
        String[][] catArr = new Create3DArray().create3D("/oodms/database/category.txt");
        
        for(String[] singleCat : catArr) {
            if(singleCat[0].equalsIgnoreCase(category)) {
                checkSimilarity = true;
                break;
            }
        }
        
        return checkSimilarity;
    }
}
