/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.ArrayList;

/**  this is the Account class that has all the hospital objects and methods.
 *
 * @author faisa
 */
public class Hospital {
	
private String name;
private String location;
private ArrayList<String> schedules = new ArrayList<>();

    
    public ArrayList<String> getSchedules() {
        return schedules;
    }

    public void setSchedules(final ArrayList<String> schedules) {    
        this.schedules = schedules;
    }

    public Hospital(final String name, final String location) {
        this.name = name;
        this.location = location;
    }

    
 
 
 
 public void setName(final String name) {
	this.name = name;
}

public void setLocation(final String location) {
	this.location = location;
}



    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
         

 public void showAllSchedules() { 
	 for (int i = 0; i < schedules.size(); i++) {
         System.out.println(schedules.get(i) + " ");
     }
 }

    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", location=" + location 
        + ", schedules=" + schedules + '}';
    }
    
    
}
