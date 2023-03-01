package oodms.oop;

public class AddNewFeedback {
    private final String orderID;
    private final String username;
    private final String rating;
    private final String feedback;
    
    public AddNewFeedback(String orderID, String username, String rating, String feedback) {
        this.orderID = orderID;
        this.username = username;
        this.rating = rating;
        this.feedback = feedback;
        
        String[][] feedbackArr = new Create3DArray().create3D("/oodms/database/feedback.txt");
        
        String[] newFeedbackArr = new String[] {orderID, username, rating, feedback};
        
        feedbackArr = addNewFeedback(feedbackArr, newFeedbackArr);
        new FlushAndWrite().flushAndWrite(feedbackArr, "src/oodms/database/feedback.txt");
    }
    
    public String getOrderID() {
        return orderID;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getRating() {
        return rating;
    }
    
    public String getFeedback() {
        return feedback;
    }
    
    public static String[][] addNewFeedback(String[][] existingArr, String[] newArr) {
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
