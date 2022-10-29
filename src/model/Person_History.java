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
public class Person_History {
     private ArrayList<Person> person_List;
    
    public Person_History(){
        
        this.person_List = new ArrayList<Person>();
    
    }

    public ArrayList<Person> getHistory() {
        return person_List;
    }

    public void setHistory(ArrayList<Person> personList) {
        this.person_List = person_List;
    }
    
    public Person addnewDetails(){
    Person newDetails = new Person();
    person_List.add(newDetails);
    return newDetails;
    }
    
    
    public void deletePatientInfo(Person p){
        
        person_List.remove(p);
    
        
    }
     
}
