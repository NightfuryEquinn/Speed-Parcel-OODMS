package oodms.oop;

public class SearchFileData {

    public String[][] searchUsername(String keyword, String fileDirectory) {
        String[][] returnSearchArr;
        
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

        return returnSearchArr;
    }
}
