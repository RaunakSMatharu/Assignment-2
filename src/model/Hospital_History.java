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
public class Hospital_History {
    private ArrayList<Hospital> Hospital_List;

    public ArrayList<Hospital> getHospital_List() {
        return Hospital_List;
    }

    public void setHospital_List(ArrayList<Hospital> Hospital_List) {
        this.Hospital_List = Hospital_List;
    }

    public Hospital_History() {
        this.Hospital_List = new ArrayList<Hospital>(); 
    }
    
    public Hospital addnewHospitalDetails(){
        Hospital newHospitalDetails = new Hospital();
        Hospital_List.add(newHospitalDetails);
        return newHospitalDetails;
        }
    
    
    public void deleteHospitalInfo(Hospital ei){
    Hospital_List.remove(ei);
    } 
    public void UpdateHospitalInfo(int index,Hospital hospital){
        Hospital_List.set(index,hospital);
    }
    
}
