/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raunak Singh Matharu
 */
public class Doctor {
    private String Doctor_Name;
    private String Doctor_ID;
    private String Doctor_Cell;
    private String Doctor_Gender;
    private String Doctor_City;
    private String Doctor_Hospital_Associated;
    private String Doctor_Age;

    public String getDoctor_Age() {
        return Doctor_Age;
    }

    public void setDoctor_Age(String Doctor_Age) {
        this.Doctor_Age = Doctor_Age;
    }
    
    public String getDoctor_Name() {
        return Doctor_Name;
    }

    public String getDoctor_ID() {
        return Doctor_ID;
    }

    public void setDoctor_ID(String Doctor_ID) {
        this.Doctor_ID = Doctor_ID;
    }

    public String getDoctor_Cell() {
        return Doctor_Cell;
    }

    public void setDoctor_Cell(String Doctor_Cell) {
        this.Doctor_Cell = Doctor_Cell;
    }

    public String getDoctor_Gender() {
        return Doctor_Gender;
    }

    public void setDoctor_Gender(String Doctor_Gender) {
        this.Doctor_Gender = Doctor_Gender;
    }

    public String getDoctor_City() {
        return Doctor_City;
    }

    public void setDoctor_City(String Doctor_City) {
        this.Doctor_City = Doctor_City;
    }

    public String getDoctor_Hospital_Associated() {
        return Doctor_Hospital_Associated;
    }

    public void setDoctor_Hospital_Associated(String Doctor_Hospital_Associated) {
        this.Doctor_Hospital_Associated = Doctor_Hospital_Associated;
    }

   

    public void setDoctor_Name(String Doctor_Name) {
        this.Doctor_Name = Doctor_Name;
    }

   
   @Override
   public String toString(){
       return Doctor_Name;
    
}
}