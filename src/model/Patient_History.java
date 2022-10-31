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
    private ArrayList<Patient> Patient_List;
    public Patient_History(){
        
        this.Patient_List = new ArrayList<Patient>();
    
    }

    public ArrayList<Patient> getPatient_List() {
        return Patient_List;
    }

    public void setPatient_List(ArrayList<Patient> Patient_List) {
        this.Patient_List = Patient_List;
    }
    
    public Patient addnewDetails(){
    Patient newDetails = new Patient();
    Patient_List.add(newDetails);
    return newDetails;
    }
    
    public void deletePatientInfo(Patient ei){
        
        Patient_List.remove(ei);
    
}
//    public void UpdatePatientInfo(int index,Patient patient){
//        Patient_List.set(index,patient);
//    }
    
     public void UpdatePatientVitalsInfo(Patient pv, int index){
        
       Patient_List.set(index, pv);
    }
    
    
}