/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FosterChild;

/**
 *
 * @author shiva
 */
public class FosterChild {
    
    public String Name;
    
    public int Age;

    public FosterChild(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    
    public int FosterChildId;
    
    public String PlaceOfOrigin;
    
    public String SourceOfParents;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getFosterChildId() {
        return FosterChildId;
    }

    public void setFosterChildId(int FosterChildId) {
        this.FosterChildId = FosterChildId;
    }

    public String getPlaceOfOrigin() {
        return PlaceOfOrigin;
    }

    public void setPlaceOfOrigin(String PlaceOfOrigin) {
        this.PlaceOfOrigin = PlaceOfOrigin;
    }

    public String getSourceOfParents() {
        return SourceOfParents;
    }

    public void setSourceOfParents(String SourceOfParents) {
        this.SourceOfParents = SourceOfParents;
    }
    
    
}
