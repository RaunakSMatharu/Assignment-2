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
public class Individual_History {
     private ArrayList<Individual> Individual_List;
    
    public Individual_History(){
        
        this.Individual_List = new ArrayList<Individual>();
    
    }

    public ArrayList<Individual> getHistory() {
        return Individual_List;
    }

    public void setHistory(ArrayList<Individual> personList) {
        this.Individual_List = Individual_List;
    }
    
    public Individual addnewDetails(){
    Individual newDetails = new Individual();
    Individual_List.add(newDetails);
    return newDetails;
    }
    
    
    public void deletePatientInfo(Individual p){
        
        Individual_List.remove(p);
    
        
    }
     
}
