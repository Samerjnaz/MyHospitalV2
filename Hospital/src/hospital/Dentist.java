/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/**  this is the Account class that has all the dentist objects and methods.
 *
 * @author faisa
 */
public class Dentist extends Doctor { 
    
    public Dentist(final Hospital hospital, final String clinic,final String name, final String id,
    	final String email, final String username, final String password) {
        super(hospital, clinic, name, id, email, username, password);
    }

    @Override
    public String toString() {
        return "Dentist{" + '}';
    }
    
   
}
