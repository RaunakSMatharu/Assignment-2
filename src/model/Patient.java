/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raunak Singh Matharu
 */
public class Patient {
    private String Patient_Name;
    private String Patient_UID;
    private int Patient_age;
    private String Patient_Gender;
    private String Patient_Email;
    private String Patient_City;
    private String Patient_Cell;
    private String Patient_Hospital_Visit;
    private String Patient_Temp;
    private String Patient_Blood_Group;

    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getPatient_UID() {
        return Patient_UID;
    }

    public void setPatient_UID(String Patient_UID) {
        this.Patient_UID = Patient_UID;
    }

    public int getPatient_age() {
        return Patient_age;
    }

    public void setPatient_age(int Patient_age) {
        this.Patient_age = Patient_age;
    }

    public String getPatient_Gender() {
        return Patient_Gender;
    }

    public void setPatient_Gender(String Patient_Gender) {
        this.Patient_Gender = Patient_Gender;
    }

    public String getPatient_Email() {
        return Patient_Email;
    }

    public void setPatient_Email(String Patient_Email) {
        this.Patient_Email = Patient_Email;
    }

    public String getPatient_City() {
        return Patient_City;
    }

    public void setPatient_City(String Patient_City) {
        this.Patient_City = Patient_City;
    }

    public String getPatient_Cell() {
        return Patient_Cell;
    }

    public void setPatient_Cell(String Patient_Cell) {
        this.Patient_Cell = Patient_Cell;
    }

    public String getPatient_Hospital_Visit() {
        return Patient_Hospital_Visit;
    }

    public void setPatient_Hospital_Visit(String Patient_Hospital_Visit) {
        this.Patient_Hospital_Visit = Patient_Hospital_Visit;
    }

    public String getPatient_Temp() {
        return Patient_Temp;
    }

    public void setPatient_Temp(String Patient_Temp) {
        this.Patient_Temp = Patient_Temp;
    }

    public String getPatient_Blood_Group() {
        return Patient_Blood_Group;
    }

    public void setPatient_Blood_Group(String Patient_Blood_Group) {
        this.Patient_Blood_Group = Patient_Blood_Group;
    }
    @Override
   public String toString(){
       return Patient_Name;
}
}