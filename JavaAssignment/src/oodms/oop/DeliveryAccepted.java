package oodms.oop;

public class DeliveryAccepted {
    private String orderID;
    private String deliveryID;
    private String username;
    private String address;
    private String status;
    
    public DeliveryAccepted (String orderID, String deliveryID, String username, String address, String status) {
        this.orderID = orderID;
        this.deliveryID = deliveryID;
        this.username = username;
        this.address = address;
        this.status = status;
        
        // OOP Method - Get Multidimensional Array
        String[][] deliveryArr = new Create3DArray().create3D("/oodms/database/delivery.txt");

        // New Delivery Array
        String[] newDeliveryArr = {orderID, deliveryID, username, address, status};

        // Write file
        deliveryArr = newDelivery(deliveryArr, newDeliveryArr);
        
        new FlushAndWrite().flushAndWrite(deliveryArr, "src/oodms/database/delivery.txt");
    }
    
    public String getOrderID() {
        return orderID;
    }
    
    public String getDeliveryID() {
        return deliveryID;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getStatus() {
        return status;
    }
    
    // Add a New Row for Delivery Data
    public static String[][] newDelivery(String[][] existingArr, String[] newArr) {
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
