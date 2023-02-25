package oodms.oop;

interface toCart {
    public String[][] addToCart(String[][] existingArr, String[] newArr);
}

public final class AddNewItemToCart implements toCart {
    private final String username;
    private final String item;
    private final String price;
    private final String quantity;
    private final String totalPrice;
    
    public AddNewItemToCart(String username, String item, String price, String quantity, String totalPrice) {
        this.username = username;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        
        String[][] cartArr = new Create3DArray().create3D("/oodms/database/cart.txt");
        
        String[] newCartArr = new String[] {username, item, price, quantity, totalPrice};

        cartArr = addToCart(cartArr, newCartArr);
        new FlushAndWrite().flushAndWrite(cartArr, "src/oodms/database/cart.txt");    
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getItem() {
        return item;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    public String getTotalPrice() {
        return totalPrice;
    }
    
    @Override
    public String[][] addToCart(String[][] existingArr, String[] newArr) {
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
