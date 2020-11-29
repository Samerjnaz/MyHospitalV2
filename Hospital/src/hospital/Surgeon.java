/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**  this is the Account class that has all the surgeon objects and methods.
 *
 * @author faisa
 */
public class Surgeon extends Doctor { 
    private int successfulSurgeries;
    private int failedSurgeries;

    public Surgeon(final Hospital hospital, final String clinic, final String name,
    		final String id, final String email, final String username, final String password) {
        super(hospital, clinic, name, id, email, username, password);
    }
    

    public Surgeon(final int successfulSurgeries, final  int failedSurgeries, final Hospital hospital,
    final String clinic, final String name, final String id, final String email, final String username,
    final String password) {
        super(hospital, clinic, name, id, email, username, password);
        this.successfulSurgeries = successfulSurgeries;
        this.failedSurgeries = failedSurgeries;
    }
    
  

    public Surgeon(final int successfulSurgeries, final int failedSurgeries, final String name,
    		final String id, final String email, final String username, final String password) { 
    	super(name, id, email, username, password);
        this.successfulSurgeries = successfulSurgeries;
        this.failedSurgeries = failedSurgeries;
    }

    public int getSuccessfulSurgeries() {
        return successfulSurgeries;
    }

    public void setSuccessfulSurgeries(final int successfulSurgeries) {
        this.successfulSurgeries = successfulSurgeries;
    }

    public int getFailedSurgeries() {
        return failedSurgeries;
    }

    public void setFailedSurgeries(final int failedSurgeries) {
        this.failedSurgeries = failedSurgeries;
    }

    @Override
    public String toString() {
        return "Surgeon{" + "successfulSurgeries=" + successfulSurgeries
        + ", failedSurgeries=" + failedSurgeries + '}';
    }
    
}
