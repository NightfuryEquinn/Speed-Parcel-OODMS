package oodms.oop;

public class AddNewCustomer {
    private String username;
    private String password;
    private String email;
    private String contact;
    private String address;
    
    public AddNewCustomer(String username, String password, String email, String contact, String address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.address = address;
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
}
