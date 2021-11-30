/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import static model.Patient.count;
import utility.UtilityFunctions;

/**
 *
 * @author user
 */
public class Encounter {
    
    VitalSigns vital;
    private LocalDate lastVisitDate;
    private long id;
    static long count = 0;
    
    public Encounter(){
        count = count + 1;
        this.id = count;
    }

    public long getId() {
        return id;
    }
    
    public VitalSigns getVital() {
        return vital;
    }

    public LocalDate getLastVisitDate() {
        return lastVisitDate;
    }
    
    public Encounter(VitalSigns vital){
        
        this.lastVisitDate = LocalDate.now();
        this.vital = vital;
        count = count + 1;
        this.id = count;

    }
    
    @Override
    public String toString(){
        UtilityFunctions util = new UtilityFunctions();
        return util.covertDateToString(this.getLastVisitDate());
    }
    
}
