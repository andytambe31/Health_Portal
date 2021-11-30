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
public class City {
    
    String citName;
    ArrayList<Community> commList;
    Sys sys;
    
    public City(Sys sys,String citName){
        this.commList = new ArrayList<Community>();
        this.sys = sys;
        this.citName = citName;
    }
    
    public Community newCommunity(String commName){
        Community comm = new Community(commName);
        this.commList.add(comm);
        return comm;
    }

    public String getCitName() {
        return citName;
    }
    
    public void setCitName(String citName){
        this.citName = citName;
    }

    public ArrayList<Community> getCommList() {
        return commList;
    }
    
    public Community getCommByObject(Community commName){
        
        for(Community comm: this.getCommList()){
            
            if(comm.getCommName().equals(commName)){
                return comm;
            }
        }
        
        return null;
    }
    
    public boolean CommunityExists(String commName){
        
        for(Community comm: this.getCommList()){
            
            if(comm.getCommName().equals(commName)){
                return true;
            }
        }
        
        return false;
    }
    
    public Community getCommunityByName(String commName){
        
        for(Community comm: this.getCommList()){
            
            if(comm.getCommName().equals(commName)){
                return comm;
            }
        }
        
        return null;
    }
    
    public House findHouseInCommunity(Person person){
    
        for(Community community:this.getCommList()){
            
            person.getName();
            
            if(!(community.findPersonInCommunity(person) == null)){
                return community.findPersonInCommunity(person);
            }
        
        }
        
        return null;
    }
    
    @Override
    public String toString(){
        return this.getCitName();
    }
    
    
    
}
