/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.House;

import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class HouseDirectory {
    
    public ArrayList<House> HouseList;
    
    public HouseDirectory(){
        this.HouseList = new ArrayList<>();
    }

    public ArrayList<House> getHouseList() {
        return HouseList;
    }

    public void setHouseList(ArrayList<House> HouseList) {
        this.HouseList = HouseList;
    }
    
    public void AddHouse(House h){
        this.HouseList.add(h);
    }
    
    public House getHouseById(int id){
        House house = null;
        for(House h: this.HouseList){
            if(h.getId().equals(id)){
                house = h;
                break;
            }
        }
        return house;
    }
    
    public void DelereHouse(int id){
        
        House toDelete = null;
        
        for(House h: this.HouseList){
            if(h.getId().equals(id)){
                toDelete = h;
            }
        }
        
        this.HouseList.remove(toDelete);
    }
}
