/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.ArrayList;

/**  this is the Account class that has all the mh objects and methods.
 *
 * @author faisa
 */
public class MedicalHistory {
    
    private String sickness;
    private ArrayList<String> allergies = new ArrayList<>();
    private ArrayList<String> prescreption = new ArrayList<>();

    public MedicalHistory(final String sickness) {
        this.sickness = sickness;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(final String sickness) {
        this.sickness = sickness;
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(final ArrayList<String> allergies) {
        this.allergies = allergies;
    }

    public ArrayList<String> getPrescreption() {
        return prescreption;
    }

    public void setPrescreption(final ArrayList<String> prescreption) {
        this.prescreption = prescreption;
    }

    @Override
    public String toString() {
        return "medicalHistory{" + "sickness=" + sickness 
        + ", allergies=" + allergies + ", prescreption=" + prescreption + '}';
    }
    
    

}
