/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FosterChild;

import Business.Parent.Parent;
import java.util.ArrayList;

/**
 *
 * @author shiva
 */
public class FosterChildDirectory {
    
    public ArrayList<FosterChild> FosterChildList;

    public FosterChildDirectory() {
        this.FosterChildList = new ArrayList<FosterChild>();
    }

    
    public void add(FosterChild child){
        this.FosterChildList.add(child);
    }
    
    public FosterChild getFosterChildBuyId(int id){
        for(FosterChild c : this.FosterChildList){
            if(c.getFosterChildId()== id){
                return c;
            }
        }
        return null;
    }
    
     public void updateFosterChild(int id, String fosterChildName, int age, String placeOfOrigin ,String sourceOfParents ){
        for(FosterChild child: this.FosterChildList){
            if(child.getFosterChildId()== id){
                child.setName(fosterChildName);
                child.setAge(age);
                child.setPlaceOfOrigin(placeOfOrigin);
                child.setSourceOfParents(sourceOfParents);
            }
        }
    }
    
    public void DeleteFosterChild(int id){
        FosterChild toDelete = null;
        for(FosterChild fosterchild: this.FosterChildList){
            if(fosterchild.getFosterChildId()== id){
                toDelete = fosterchild;
            }
        }
        
        if(toDelete != null){
            this.FosterChildList.remove(toDelete);
        }
    }
}
