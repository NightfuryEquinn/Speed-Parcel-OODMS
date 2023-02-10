package oodms.oop;

import oodms.oop.WriteNewCustomer;

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
        
        // OOP Method - Writing New User into File
        WriteNewCustomer newCustomerData = new WriteNewCustomer();
        newCustomerData.newCustomer(username, password, email, contact, address, age, gender);
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
}
