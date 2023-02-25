package oodms.oop;

public class AddNewItem {
    private final String name;
    private final String price;
    private final String category;
    private final String description;
    
    public AddNewItem(String name, String price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        
        String[][] itemArr = new Create3DArray().create3D("/oodms/database/item.txt");
        
        String[] newItemArr = new String[] {name, price, category, description};
        
        itemArr = addNewItem(itemArr, newItemArr);
        new FlushAndWrite().flushAndWrite(itemArr, "src/oodms/database/item.txt");
    }
    
    public String getName() {
        return name;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDescription() {
        return description;
    }
    
    public static String[][] addNewItem(String[][] existingArr, String[] newArr) {
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
