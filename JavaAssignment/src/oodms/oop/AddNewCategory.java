package oodms.oop;

public class AddNewCategory {
    private final String name;
    private final String description;
    
    public AddNewCategory(String name, String description) {
        this.name = name;
        this.description = description;
        
        String[][] catArr = new Create3DArray().create3D("/oodms/database/category.txt");
        
        String[] newCatArr = new String[] {name, description};
        
        catArr = addNewCategory(catArr, newCatArr);
        new FlushAndWrite().flushAndWrite(catArr, "src/oodms/database/category.txt");
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static String[][] addNewCategory(String[][] existingArr, String[] newArr) {
        int arrRow = existingArr.length;
        int arrCol = existingArr[0].length;
        
        String[][] newExistingArr = new String[arrRow + 1][arrCol];
        
        for(int i = 0; i < arrRow; i++) {
            System.arraycopy(existingArr[i], 0, newExistingArr[i], 0, arrCol);
        }
        
        System.arraycopy(newArr, 0, newExistingArr[arrRow], 0, arrCol);
        
        return newExistingArr;
    }
}
