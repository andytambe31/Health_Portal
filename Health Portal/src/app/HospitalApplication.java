/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.time.LocalDate;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.Sys;
import model.VitalSigns;
import utility.UtilityFunctions;

/**
 *
 * @author user
 */
public class HospitalApplication {
    
    public static void main(String[] args){
        
        UtilityFunctions util = new UtilityFunctions();
        
        Sys sys = new Sys();
        
        PatientDirectory pD = sys.getPatDir();
        PersonDirectory perD = sys.getPerDir();
        
        //Create person
        Person per1 = perD.createPerson(1234, "Aniruddha Tambe", util.convertToDate("31-10-1996"));
        Person per2 = perD.createPerson(5678, "Siddhant Kohli", util.convertToDate("20-12-1996"));
        
        //Create patient
        Patient pat1 = pD.createPatient(per1);
        Patient pat2 = pD.createPatient(per2);
        
        // Step 1. Get patient
        Patient selectedPatient = pD.searchPatientByName("Aniruddha Tambe");
        
        // Step 2. Create vital signs
        VitalSigns vs = new VitalSigns(90,60,72);
        
        // Step 3. Map vital signs, patient & encounter
        selectedPatient.getEncounterHistory().addEncounter(vs);
                
        // Step 4. Get latest encounter
        pD.getPatientLatestEncounter(selectedPatient);
        
        
        
    }
    
}
