package oodms.oop;

public class DeleteSelected {

    public void deleteUsername(String selectedUsername, String fileDirectory) {
        // OOP Method - Get Multidimensional Array
        String[][] deleteFileArr = new Create3DArray().create3D(fileDirectory);
        
        // New array to exclude removed array
        String[][] newFileArr;
        
        // Delete the selected user
        for(String[] deleteUserArr : deleteFileArr) {
            if(deleteUserArr[0].equals(selectedUsername)) {
                
            }
        }
    }
}