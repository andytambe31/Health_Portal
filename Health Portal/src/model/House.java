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
public class House {
    
    private int houseNum;
    private String unitNum;
    private String streetName;
    private String community;
    private String city;
    private long zipcode;
    ArrayList<Person> familiyMembers;
    
    public House(int houseNum,String streetName,
                 String community,String city
                    ){
        
        this.houseNum = houseNum;
        this.streetName = streetName;
        this.community = community;
        this.city = city;
        this.familiyMembers = new ArrayList<Person>();
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public void setFamiliyMembers(ArrayList<Person> familiyMembers) {
        this.familiyMembers = familiyMembers;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public ArrayList<Person> getFamiliyMembers() {
        return familiyMembers;
    }
    
    public void addPersonToHouse(Person member){
        
        this.getFamiliyMembers().add(member);
    
    }
    
}
