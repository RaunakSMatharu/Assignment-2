/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raunak Singh Matharu
 */
public class City {
    public static String[] cityValues = {"Boston", "Irvine", "New York", "Florida", "Seattle"};
    public String cityName;
   // public static ArrayList<Community> communityList = new ArrayList<>();
    
    
    public static String state;
    
    public City(){
    }
    
    public City(String cityName, String state){
        this.cityName = cityName;
        City.state = "Massachusetts";
    }
    

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String validateCityName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "City Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 30) {
            isValid = "City Name must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid City Name Field! \n";
        }else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
}
