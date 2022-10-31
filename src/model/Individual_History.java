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
    private ArrayList<Individual> individualList;
    
    public Individual_History(){
        
        this.individualList = new ArrayList<Individual>();
    
    }

    public ArrayList<Individual> getIndividualList() {
        return individualList;
    }
    public Individual addnewDetails(){
    Individual newDetails = new Individual();
    individualList.add(newDetails);
    return newDetails;
    }

    public void setIndividualList(ArrayList<Individual> individualList) {
        this.individualList = individualList;
    }
    
}