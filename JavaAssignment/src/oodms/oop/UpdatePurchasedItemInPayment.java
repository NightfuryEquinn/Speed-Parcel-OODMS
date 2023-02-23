package oodms.oop;

import java.util.Arrays;
import java.util.Random;

public class UpdatePurchasedItemInPayment extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData, String orderID) {
        // 3023432 | QWER | Strawberry | 3.90 | 7 | 27.30
        // 16003450 | 15432000 | QWER | Pending | 19 | 24.76
        // Random generate a payment ID
        Random random = new Random();
        int getPaymentID = random.nextInt(1000000) + 16000000;
        String randomPaymentID = String.valueOf(getPaymentID);
        
        // Calculate amount payable
        double totalPrice = Double.parseDouble(purchasedItemData[5]);
        double getAmountPayable = ((totalPrice * 1.04) + 5);
        String amountPayable = String.format("%.2f", getAmountPayable);
        
        String[] purchasedItemDataInPaymentArr = new String[] {
            randomPaymentID,
            orderID,
            purchasedItemData[1],
            "Pending",
            purchasedItemData[5],
            amountPayable
        };
        
        String[][] existingArr = new Create3DArray().create3D("/oodms/database/payment.txt");
        
        int arrRow = existingArr.length;
        int arrCol = existingArr[0].length;
        
        String[][] newExistingArr = new String[arrRow + 1][arrCol];
        
        for(int i = 0; i < arrRow; i++) {
            System.arraycopy(existingArr[i], 0, newExistingArr[i], 0, arrCol);
        }
        
        System.arraycopy(purchasedItemDataInPaymentArr, 0, newExistingArr[arrRow], 0, arrCol);
        
        // Flush and Write
        new FlushAndWrite().flushAndWrite(newExistingArr, "src/oodms/database/payment.txt");
    }
}