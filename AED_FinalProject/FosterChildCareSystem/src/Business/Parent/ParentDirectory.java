/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Parent;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class ParentDirectory {
    
    public ArrayList<Parent> ParentList;

    public ParentDirectory() {
        this.ParentList = new ArrayList<Parent>();
    }

    public ArrayList<Parent> getParentList() {
        return ParentList;
    }

    public void setParentList(ArrayList<Parent> CustomerList) {
        this.ParentList = CustomerList;
    }
    
    public void add(Parent customer){
        this.ParentList.add(customer);
    }
    
    public Parent getParentById(int ParentId){
        for(Parent c : this.ParentList){
            if(c.getParentId()== ParentId){
                return c;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Parent parent: this.ParentList){
            if(parent.getPhoneNumber().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(Parent customer: this.ParentList){
            if(customer.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateParent(int id, String parentName, String parentPhone, String address ,String parentEmail ){
        for(Parent customer: this.ParentList){
            if(customer.getParentId()== id){
                customer.setName(parentName);
                customer.setPhoneNumber(parentPhone);
                customer.setAddress(address);
                customer.setEmail(parentEmail);
            }
        }
    }
    
    public void DeleteParent(int id){
        Parent toDelete = null;
        for(Parent customer: this.ParentList){
            if(customer.getParentId()== id){
                toDelete = customer;
            }
        }
        
        if(toDelete != null){
            this.ParentList.remove(toDelete);
        }
    }
}
