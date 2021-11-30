/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    Sys syst;
    
    public PersonDirectory(Sys syst){
        
        personList = new ArrayList<Person>();
        this.syst = syst;
        
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(long contactNo,String name,LocalDate dob){
        
        //Create person
        Person newPerson = new Person(contactNo,name,dob);
        
        //Add created person to a list
        personList.add(newPerson);
        
        return newPerson;
        
    }
    
     public Person getPersonById(int personId){
    
        for(Person p: this.personList){
            
            if(p.matchById(personId)){
                return p;
            }
            
            //Patient not found
            
        }
        return null;
        
    }
     
    
}
