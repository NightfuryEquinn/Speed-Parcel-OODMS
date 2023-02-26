package oodms.oop;

public class SaveSelected {

    public String[][] saveUsername(String[] newChangesArr, String compareOldUsername) {
        // OOP Method - Get multidimensional array
        String[][] saveFileArr = new Create3DArray().create3D("/oodms/database/credentials.txt");

        // Compare value of text field with value of text file
        for(int i = 0; i < saveFileArr.length; i++) {
            if(saveFileArr[i][0].equals(compareOldUsername)) {
                System.arraycopy(newChangesArr, 0, saveFileArr[i], 0, 1);
                System.arraycopy(newChangesArr, 1, saveFileArr[i], 2, 5);
            }
        }
        
        return saveFileArr;
    }

    public String[][] saveCategory(String[] newChangesArr, String compareOldCategory) {
        String[][] saveFileArr = new Create3DArray().create3D("/oodms/database/category.txt");
        String[][] itemFileArr = new Create3DArray().create3D("/oodms/database/item.txt");
        
        for(int i = 0; i < saveFileArr.length; i++) {
            if(saveFileArr[i][0].equalsIgnoreCase(compareOldCategory)) {
                System.arraycopy(newChangesArr, 0, saveFileArr[i], 0, 1);
            }
        }
        
        // Change item category related
        for(int i = 0; i < itemFileArr.length; i++) {
            if(itemFileArr[i][2].equalsIgnoreCase(compareOldCategory)) {
                itemFileArr[i][2] = newChangesArr[0];
            }
        }
        
        new FlushAndWrite().flushAndWrite(itemFileArr, "src/oodms/database/item.txt");
        
        return saveFileArr;
    }
    
    public String[][] saveItem(String[] newChangesArr, String compareOldItem) {
        String[][] saveItemArr = new Create3DArray().create3D("/oodms/database/item.txt");
        
        for(int i = 0; i < saveItemArr.length; i++) {
            if(saveItemArr[i][0].equalsIgnoreCase(compareOldItem)) {
                System.arraycopy(newChangesArr, 0, saveItemArr[i], 0, 1);
            }
        }
        
        return saveItemArr;
    }
    
    public String[][] saveDelivery(String[] newChangesArr, String findTheRow) {
        String[][] saveDeliveryArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        
        for(int i = 0; i < saveDeliveryArr.length; i++) {
            if(saveDeliveryArr[i][1].equals(findTheRow)) {
                System.arraycopy(newChangesArr, 0, saveDeliveryArr[i], 0, 5);
            }
        }
        
        return saveDeliveryArr;
    }
    
    public String[][] saveCustomerProfile(String[] newChangesArr, String findTheUsername) {
        String[][] saveCustomerProfileArr = new Create3DArray().create3D("/oodms/database/credentials.txt");
        
        for(int i = 0; i < saveCustomerProfileArr.length; i++) {
            if(saveCustomerProfileArr[i][0].equalsIgnoreCase(findTheUsername)) {
                System.arraycopy(newChangesArr, 0, saveCustomerProfileArr[i], 1, 1);
                System.arraycopy(newChangesArr, 1, saveCustomerProfileArr[i], 3, 4);
            }
        }
        
        return saveCustomerProfileArr;
    }
    
    public String[][] saveCart(String[] newChangesArr, String findTheID, String findTheItem) {
        String[][] saveCartArr = new Create3DArray().create3D("/oodms/database/cart.txt");
        
        for(int i = 0; i < saveCartArr.length; i++) {
            if(saveCartArr[i][0].equals(findTheID)) {
                if(saveCartArr[i][2].equals(findTheItem)) {
                    System.arraycopy(newChangesArr, 0, saveCartArr[i], 0, 6);
                }
            }
        }
        
        return saveCartArr;
    }
    
    public String[][] saveFeedback(String[] newChangesArr, String findTheID, String findTheUsername) {
        String[][] saveFeedbackArr = new Create3DArray().create3D("/oodms/database/feedback.txt");
        
        for(int i = 0; i < saveFeedbackArr.length; i++) {
            if(saveFeedbackArr[i][0].equals(findTheID)) {
                if(saveFeedbackArr[i][1].equals(findTheUsername)) {
                    System.arraycopy(newChangesArr, 0, saveFeedbackArr[i], 0, 4);
                }
            }
        }
        
        return saveFeedbackArr;
    }

    public String[][] saveStatus(String changeStatus, String theStaff, String findTheID) {
        String[][] saveStatusArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        String[][] saveOrderStatusArr = new Create3DArray().create3D("/oodms/database/order.txt");
        
        for(int i = 0; i < saveStatusArr.length; i++) {
            if(saveStatusArr[i][1].equals(findTheID)) {
                saveStatusArr[i][0] = theStaff;
                saveStatusArr[i][2] = changeStatus;
            }
        }
        
        for(int i = 0; i < saveOrderStatusArr.length; i++) {
            if(saveOrderStatusArr[i][0].equals(findTheID)) {
                saveOrderStatusArr[i][7] = changeStatus;
            }
        }
        
        new FlushAndWrite().flushAndWrite(saveOrderStatusArr, "src/oodms/database/order.txt");
        
        return saveStatusArr;
    }
    
    public String[][] saveConfirmDelivery(String changeStatus, String changePaymentStatus, String findTheID) {
        String[][] saveConfirmDeliveryArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        String[][] saveConfirmOrderDeliveryArr = new Create3DArray().create3D("/oodms/database/order.txt");
        String[][] saveConfirmPaymentDeliveryArr = new Create3DArray().create3D("/oodms/database/payment.txt");
        
        for(int i = 0; i < saveConfirmDeliveryArr.length; i++) {
            if(saveConfirmDeliveryArr[i][1].equals(findTheID)) {
                saveConfirmDeliveryArr[i][2] = changeStatus;
            }
        }
        
        for(int i = 0; i < saveConfirmOrderDeliveryArr.length; i++) {
            if(saveConfirmOrderDeliveryArr[i][0].equals(findTheID)) {
                saveConfirmOrderDeliveryArr[i][7] = changeStatus;
            }
        }
        
        for(int i = 0; i < saveConfirmPaymentDeliveryArr.length; i++) {
            if(saveConfirmPaymentDeliveryArr[i][1].equals(findTheID)) {
                saveConfirmPaymentDeliveryArr[i][3] = changePaymentStatus;
            }
        }
        
        new FlushAndWrite().flushAndWrite(saveConfirmOrderDeliveryArr, "src/oodms/database/order.txt");
        new FlushAndWrite().flushAndWrite(saveConfirmPaymentDeliveryArr, "src/oodms/database/payment.txt");
        
        return saveConfirmDeliveryArr;
    }
}
