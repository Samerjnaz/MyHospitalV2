/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**  this is the Account class that has all the docter objects and methods.
 *
 * @author faisa
 */
public class Doctor extends Account {
    private Hospital hospital;
    private String clinic;
 
    
    public Doctor(final Hospital hospital, final String clinic, final String name, 
    		final String id, final String email,final String username,final String password) {
    	super(name, id, email, username, password);
        this.hospital = hospital;
        this.clinic = clinic;
    }

    public Doctor(final String name, final String id, final String email, final String username,final String password) {
        super(name, id, email, username, password);
    }

 

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(final Hospital hospital) {
        this.hospital = hospital;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(final String clinic) {
        this.clinic = clinic;
    }
    
    public void writeNotesForPatient(final Patient patient, final String note) { 
        patient.viewNotes().add(note);
    }
    
     public void writePrescreptionsForPatient(final Patient patient, final String precreption) { 
        patient.viewPrescriptions().add(precreption);
    }

    @Override
    public String toString() {
        return "Doctor{" + "hospital=" + hospital + ", clinic=" + clinic + '}';
    }
     
}
