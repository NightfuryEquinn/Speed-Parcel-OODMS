package oodms.oop;

public class AddNewCustomer {
    private String username;
    private String password;
    private String email;
    private String contact;
    private String address;
    private String age;
    private String gender;
    
    public AddNewCustomer(String username, String password, String email, String contact, String address, String age, String gender) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.age = age;
        this.gender = gender;
        
        // OOP Method - Get Multidimensional Array
        String[][] credentialsArr = new Create3DArray().create3D("/oodms/database/credentials.txt");

        // New Customer Array
        String[] newCustomerArr = {username, password, email, contact, address, age, gender};

        // Write file
        credentialsArr = addNewCustomer(credentialsArr, newCustomerArr);
        
        new FlushAndWrite().flushAndWrite(credentialsArr, "src/oodms/database/credentials.txt");
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getContact() {
        return contact;
    }
    
    public String getAddress() {
        return address;
    } 
    
    public String getAge() {
        return age;
    }
    
    public String getGender() {
        return gender;
    }
    
    // Add New Customer Data into Existing Customer Data
    public static String[][] addNewCustomer(String[][] existingArr, String[] newArr) {
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
