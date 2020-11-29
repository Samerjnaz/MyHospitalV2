/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.ArrayList;

/**  this is the Account class that has all the patient objects and methods.
 *
 * @author faisa
 */
public class Patient extends Account { 
    
    private String gender;
    private int age;
    private MedicalHistory medicalState;
    private ArrayList<Appointment> appointments = new ArrayList<>(); 
    private ArrayList<String> notes = new ArrayList<>();
    private ArrayList<String> prescriptions = new ArrayList<>(); 

    public ArrayList<String> getNotes() {
		return notes;
	}

	public ArrayList<String> getPrescriptions() {
		return prescriptions;
	}

    

    public Patient(final String gender,final int age, final MedicalHistory medicalState,
    		final String name, final String id,final String email,final String username,final  String password) { 
    	super(name, id, email, username, password);
        this.gender = gender;
        this.age = age;
        this.medicalState = medicalState;
    }

    public void setNotes(final ArrayList<String> notes) {
        this.notes = notes;
    }

    public void setPrescriptions(final ArrayList<String> prescriptions) {
        this.prescriptions = prescriptions;
    }



    public ArrayList<String> viewNotes() {
        return notes;
    }

    public ArrayList<String> viewPrescriptions() {
        return prescriptions;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(final ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public MedicalHistory getMedicalState() {
        return medicalState;
    }

    public void setMedicalState(final MedicalHistory medicalState) {
        this.medicalState = medicalState;
    }
    

    public void bookAppointment(final Appointment appointment) { 
    	if (appointment.isAvailability() == false) { 
    		this.appointments.add(appointment);
            } 
        else { 
        	System.out.println("appointment is not available");
        
        }
    }
    

    
        public void cancelAppointment(final Appointment appointment) { 
        	for (int i = 0; i < appointments.size(); i++) {
                if (appointments.get(i).equals(appointment)) { 
                  appointments.get(i).setAvailability(true);
                }
            }
       
    
        }

    @Override
    public String toString() {
        return "Patient{" + "gender=" + gender + ", age=" + age +  ", medicalState=" + medicalState
        + ", appointments=" + appointments + ", notes="
        + notes + ", prescriptions=" + prescriptions + '}';
    }
}
