/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HouseLessor;

/**
 *
 * @author shiva
 */
public class HouseLessor {
    
    public String Name;
    
    public int LessorId;
    
    public String Address;
    
    public String PhoneNumber;
    
    public String Email;

    public HouseLessor(String Name, String Address, String PhoneNumber, String Email) {
        this.Name = Name;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getLessorId() {
        return LessorId;
    }

    public void setLessorId(int LessorId) {
        this.LessorId = LessorId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
