/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**  this is the Account class that has all the medicine objects and methods.
 *
 * @author faisa
 */
public class Medicine {
    
    private String medicineID;
    private String name;
    private String type;
    private double cost;
    private boolean instock;
    private String manual;
    private String medicineDescription;
  
    public Medicine(final String medicineID,final  String name,final String type,final double cost,final  boolean instock, 
    		final String manual, final String medicineDescription) { 
    	this.medicineID = medicineID;
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.instock = instock;
        this.manual = manual;
        this.medicineDescription = medicineDescription;
    }
    

    public String getManual() {
        return manual;
    }

    public void setManual(final String manual) {
        this.manual = manual;
    }

    public boolean isInstock() {
        return instock;
    }

    public void setInstock(final boolean instock) {
        this.instock = instock;
    }
    

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(final String medicineID) {
        this.medicineID = medicineID;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(final double cost) {
        this.cost = cost;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(final String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    @Override
    public String toString() {
        return "medicine{" + "medicineID=" + medicineID + ", name="
    + name + ", type=" + type + ", cost="
    + cost + ", instock=" + instock + ", manual="
    + manual + ", medicineDescription=" + medicineDescription + '}';
    }

    
}
