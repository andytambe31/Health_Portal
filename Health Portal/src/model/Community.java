/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Community {
    
    private ArrayList<House> houseList;

    public ArrayList<House> getHouseList() {
        return houseList;
    }
    private String commName;

    public void setCommName(String commName) {
        this.commName = commName;
    }
    
    public Community(String commName){
        this.houseList = new ArrayList<>();
        this.commName = commName;
    }
    
    @Override
    public String toString(){
        return this.getCommName();
    }

    public String getCommName() {
        return commName;
    }
    
    public House findPersonInCommunity(Person person){
    
        for(House house:this.getHouseList())
        
            if(house.getFamiliyMembers().contains(person))
                return house;
    
         return null;
    }
    
    public House createHouse(int houseNum,String streetName,
                 String community,String city){
        
        House newHouse = new House( houseNum, streetName,
                  community, city);
        this.getHouseList().add(newHouse);
        return newHouse;
        
    }
    
    
    
}
