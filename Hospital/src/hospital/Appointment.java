/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/** this is the Account class that has all the appointment objects and methods.
 *
 * @author faisa
 */
public class Appointment {
    private String time;
    private boolean availability;

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(final boolean availability) {
        this.availability = availability;
    }

    public Appointment(final String time, final boolean availability) {
        this.time = time;
        this.availability = availability;
    }

    @Override
    public String toString() { 
   return "appointment{" + "time=" + time + ", availability=" + availability + '}';
    } 
     
    
}
