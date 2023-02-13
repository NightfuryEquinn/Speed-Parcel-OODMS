package oodms.oop;

import java.util.HashMap;
import java.util.Map;

public class CountChildren {

    public String[][] getCountChildren(String fileDirectory) {
        String[][] parentChildrenCountArr;
        
        String[][] getItemArr = new Create3DArray().create3D(fileDirectory);
        
        // Count the number of children of each category
        // Get category of each item into an array
        String[] childrenCatArr = new String[getItemArr.length];
        
        for(int i = 0; i < childrenCatArr.length; i++) {
            childrenCatArr[i] = getItemArr[i][2];
        }
        
        // Count the appearance of each category using HashMap
        Map<String, Integer> countCategory = new HashMap<>();
        
        for(String eachCategory : childrenCatArr) {
            Integer childrenCatCount = countCategory.get(eachCategory);
            
            if(childrenCatCount == null) {
                childrenCatCount = 0;
            }
            
            countCategory.put(eachCategory, childrenCatCount + 1);
        }
        
        // Set the size of the multidimensional array
        parentChildrenCountArr = new String[countCategory.size()][2];
        
        int i = 0;
        for(Map.Entry<String, Integer> categoryEntry : countCategory.entrySet()) {
            parentChildrenCountArr[i][0] = categoryEntry.getKey();
            parentChildrenCountArr[i][1] = categoryEntry.getValue().toString();
            
            i++;
        }
        
        return parentChildrenCountArr;
    }
}
