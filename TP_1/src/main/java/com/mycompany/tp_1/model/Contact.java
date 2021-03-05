/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp_1.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zihao ZHENG
 */
public class Contact {
    private String firstname, lastname;
    
    private int age;
    
    private boolean genre;
    
    private Email email = null;
    
    private Address address = null;
    
    private List<PhoneNumber> phoneNumbers;
    
    public Contact(String firstname, String lastname, int age, boolean genre){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.genre = genre;
        
        this.phoneNumbers = new ArrayList<PhoneNumber>();
    }
    
    public void setEmail(Email email){
        this.email = email;
    }
    
    public void setAddress(Address address){
        this.address = address;
    }
    
    public void addPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }
}
