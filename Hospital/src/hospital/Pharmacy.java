/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.ArrayList;

/** this is the Account class that has all the pharmacy objects and methods.
 *
 * @author faisa
 */
public class Pharmacy {
    
 private String name;
 private String location;
 private  ArrayList<String> staff = new ArrayList<>();
 private ArrayList<Medicine> medcines = new ArrayList<>();
 
 
    public ArrayList<String> getStaff() {
        return staff;
    }

    public void setStaff(final ArrayList<String> staff) {
        this.staff = staff;
    }
 

    public ArrayList<Medicine> getMedcines() {
        return medcines;
    }

    public void setMedcines(final ArrayList<Medicine> medcines) {
        this.medcines = medcines;
    }

 
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Pharmacy(final String name, final String location) {
        this.name = name;
        this.location = location;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }
 
 
     @Override
    public String toString() {
        return "Pharmacy{" + "name=" + name + ", location=" + location + '}';
    }
}