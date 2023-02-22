package oodms.customer;

import java.time.LocalDate;
import java.util.Random;
import oodms.oop.Create3DArray;
import oodms.oop.FlushAndWrite;

/**
 * !Important!
 * This abstract class need to be in the same package where the function method is called
 */ 
public abstract class UpdatePurchasedItem {
    public abstract void updatePurchasedItemData(String[] purchasedItemData);
}

class UpdatePurchasedItemInOrder extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData) {
        // Random generate an UID
        Random random = new Random();
        int getOrderID = random.nextInt(1000000) + 15000000;
        String orderID = String.valueOf(getOrderID);
        
        // Get purchased date
        LocalDate getPurchasedDate = java.time.LocalDate.now();
        String purchasedDate = getPurchasedDate.toString();
        
        String[] purchasedItemDataInOrderArr = new String[] {
            orderID,
            purchasedItemData[1],
            purchasedItemData[2],
            purchasedItemData[4],
            purchasedItemData[3],
            purchasedItemData[5],
            purchasedDate,
            "Unassigned"
        };
        
        String[][] existingArr = new Create3DArray().create3D("/oodms/database/order.txt");
        
        int arrRow = existingArr.length;
        int arrCol = existingArr[0].length;
        
        String[][] newExistingArr = new String[arrRow + 1][arrCol];
        
        for(int i = 0; i < arrRow; i++) {
            System.arraycopy(existingArr[i], 0, newExistingArr[i], 0, arrCol);
        }
        
        System.arraycopy(purchasedItemDataInOrderArr, 0, newExistingArr[arrRow], 0, arrCol);
        
        // Flush and Write
        new FlushAndWrite().flushAndWrite(existingArr, "src/oodms/database/order.txt");
    }
}

class UpdatePurchasedItemInPayment extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData) {
        
    }
}

class UpdatePurchasedItemInDelivery extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData) {
        
    }
}