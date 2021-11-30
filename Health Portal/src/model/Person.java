/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author user
 */
public class Person {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long contactNo;
    private String addr;
    private String imagePath;
    static long count = 0;
    private long id;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    //Create a person
    public Person(long contactNo,String name,LocalDate dob){
       
        count += 1;
        this.id = count;
        this.name = name;
        this.contactNo = contactNo;
        this.age = calculateAge(dob);
        this.dob = dob;
        this.addr = "146 Bolyston St., Jamaica Plain, Boston, MA 02130";
    }

    public String getAddr() {
        return addr;
    }

    public boolean matchById(int personId){
        return this.getId()==personId;
    }

    public long getId() {
        return id;
    }
    
    public int calculateAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getContactNo() {
        return contactNo;
    }

    public boolean matchByName(String name) {
        
        return this.getName().equals(name);
    }
    
    
}
