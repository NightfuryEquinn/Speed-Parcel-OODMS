package oodms.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class UpdatePurchasedItemInOrder extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData, String orderID) {
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
        new FlushAndWrite().flushAndWrite(newExistingArr, "src/oodms/database/order.txt");
    }
}
