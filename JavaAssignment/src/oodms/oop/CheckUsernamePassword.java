package oodms.oop;

public class CheckUsernamePassword {

    public boolean credentialsChecker(String username, String password, String confirmPassword, String email, String contact, String address) {
        // Declare variable to check for similarity in username and password confirmation
        boolean checkSimilarity = false;
        
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D();

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
        
        return checkSimilarity;
    }
}
