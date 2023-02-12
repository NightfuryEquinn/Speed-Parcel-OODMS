package oodms.oop;

public class SaveSelected {

    public String[][] saveUsername(String[] newChangesArr, String compareOldUsername, String fileDirectory) {
        // OOP Method - Get multidimensional array
        String[][] saveFileArr = new Create3DArray().create3D(fileDirectory);

        // Compare value of text field with value of text file
        for(int i = 0; i < saveFileArr.length; i++) {
            if(saveFileArr[i][0].equals(compareOldUsername)) {
                System.arraycopy(newChangesArr, 0, saveFileArr[i], 0, 1);
                System.arraycopy(newChangesArr, 1, saveFileArr[i], 2, 5);
            }
        }
        
        return saveFileArr;
    }
}
