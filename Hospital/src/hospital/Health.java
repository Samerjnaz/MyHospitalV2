/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;


/**  this is the Account class that has all the health objects and methods.
 *
 * @author faisa
 */
public class Health {
    
    private boolean sick;
    private boolean needsurgery;
    private int temprature;
    private double height;
    private double weight;
    
  

    public Health(final boolean sick, final boolean needsurgery,final int temprature, final int height, final double weight) { 
    	this.sick = sick;
    	this.needsurgery = needsurgery;
        this.temprature = temprature;
        this.height = height;
        this.weight = weight;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(final boolean sick) {
        this.sick = sick;
    }

    public boolean isNeedsurgery() {
        return needsurgery;
    }

    public void setNeedsurgery(final boolean needsurgery) {
        this.needsurgery = needsurgery;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(final int temprature) {
        this.temprature = temprature;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Health{" + "sick=" + sick + ", needsurgery=" + needsurgery 
        + ", temprature=" + temprature + ", height=" + height
        + ", weight=" + weight + '}';
    }
    
    
}
