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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterList;
    
    public EncounterHistory(Patient patient){
        this.encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }
    
    public Encounter addEncounter(VitalSigns vital){
        
        Encounter newEncounter = new Encounter(vital);
        encounterList.add(newEncounter);
        return newEncounter;
        
    }
    
}
