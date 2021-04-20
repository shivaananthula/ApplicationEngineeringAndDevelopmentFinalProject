/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

/**
 *
 * @author shiva
 */
public class House {
    
   public String Id;
   
   public String HouseName;
   
   public String Address;
   
   public String City;

    public House(String Id, String HouseName, String Address, String City) {
        this.Id = Id;
        this.HouseName = HouseName;
        this.Address = Address;
        this.City = City;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
   
   
}
