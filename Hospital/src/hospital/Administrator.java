/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;


/** this is the Account class that has all the Admin objects and methods.
 *
 * @author faisa
 */
public class Administrator extends Account {

 private String verificationCode;

    public String getVerificationCode() {
	return verificationCode;
}

public void setVerificationCode(final String verificationCode) {
	this.verificationCode = verificationCode;
}

	public Administrator(final String verificationCode, final String name,
    		final String id, final String email, final String username, final String password) {
        super(name, id, email, username, password);
        this.verificationCode = verificationCode;
    }

    @Override
    public String toString() {
        return "Administrator{" + "verificationCode=" + verificationCode + '}';
    }
 
    
}
