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
public class Doctor_History {
        private ArrayList<Doctor> Doctor_List;

    public Doctor_History() {
        this.Doctor_List = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctor_List() {
        return Doctor_List;
    }

    public void setDoctor_List(ArrayList<Doctor> Doctor_List) {
        this.Doctor_List = Doctor_List;
    }
    public Doctor addnewDoctorDetails(){
        Doctor newDoctorDetails = new Doctor();
        Doctor_List.add(newDoctorDetails);
        return newDoctorDetails;
        }
    public void deleteDoctorInfo(Doctor ei){
    Doctor_List.remove(ei);
    }
     
    public void UpdateDoctorInfo(int index,Doctor doctor){
        Doctor_List.set(index,doctor);
    }
}

