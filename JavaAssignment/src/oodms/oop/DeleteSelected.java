package oodms.oop;

public class DeleteSelected {

    public String[][] deleteSelected(String selected, String fileDirectory) {
        // OOP Method - Get Multidimensional Array
        String[][] deleteFileArr = new Create3DArray().create3D(fileDirectory);
        
        // New array to exclude removed array
        String[][] newFileArr = new String[deleteFileArr.length - 1][];
        
        // Get the index of the selected array to be deleted
        int indexToDelete = -1;
        
        for(int i = 0; i < deleteFileArr.length; i++) {
            String[] deleteUserArr = deleteFileArr[i];
            
            if(deleteUserArr[0].equals(selected)) {
                indexToDelete = i;
                break;
            }
        }

        // Copy the whole array to a temporary array
        // Copy again while excluding the selected array
        System.arraycopy(deleteFileArr, 0, newFileArr, 0, indexToDelete);
        System.arraycopy(deleteFileArr, indexToDelete + 1, newFileArr, indexToDelete, deleteFileArr.length - indexToDelete - 1);
        
        return newFileArr;
    }
}