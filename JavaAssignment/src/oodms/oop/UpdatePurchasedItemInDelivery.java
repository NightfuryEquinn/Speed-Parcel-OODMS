package oodms.oop;

public class UpdatePurchasedItemInDelivery extends UpdatePurchasedItem {
    @Override
    public void updatePurchasedItemData(String[] purchasedItemData, String orderID) {
        // Get customer address
        String[][] getCustomerAddress = new Create3DArray().create3D("/oodms/database/credentials.txt");
        String theCustomerAddress = null;
        
        for(String[] getArr : getCustomerAddress) {
            if(getArr[0].equalsIgnoreCase(purchasedItemData[1])) {
                theCustomerAddress = getArr[4];
            }
        }
        
        String[] purchasedItemDataInDeliveryArr = new String[] {
            "Unknown",
            orderID,
            "Unassigned",
            purchasedItemData[1],
            theCustomerAddress
        };
        
        String[][] existingArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        
        int arrRow = existingArr.length;
        int arrCol = existingArr[0].length;
        
        String[][] newExistingArr = new String[arrRow + 1][arrCol];
        
        for(int i = 0; i < arrRow; i++) {
            System.arraycopy(existingArr[i], 0, newExistingArr[i], 0, arrCol);
        }
        
        System.arraycopy(purchasedItemDataInDeliveryArr, 0, newExistingArr[arrRow], 0, arrCol);
        
        // Flush and Write
        new FlushAndWrite().flushAndWrite(newExistingArr, "src/oodms/database/delivery.txt");
    }
}
