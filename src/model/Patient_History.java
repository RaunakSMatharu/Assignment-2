/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Raunak Singh Matharu
 */
public class Patient_History {
    private ArrayList<Patient> patient_list;

    public ArrayList<Patient> getPatient_list() {
        return patient_list;
    }

    public void setPatient_list(ArrayList<Patient> patient_list) {
        this.patient_list = patient_list;
    }
    
    public Patient addnewDetails(){
    Patient newDetails = new Patient();
    patient_list.add(newDetails);
    return newDetails;
    }
    
    
    public void deletePatientInfo(Person p){
        
        patient_list.remove(p);
    
        
    }
     
}
