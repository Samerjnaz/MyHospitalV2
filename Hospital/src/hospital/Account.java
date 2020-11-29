/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

/** this is the Account class that has all the account objects and methods.
*
* @author samer 
*/



public class Account {

	private String name;
	private String id;
	private String email;
	private String username;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(final String password) {
		this.password = password;
	}

	
	public Account(final String name, final  String id,final String email, 
			final String username,final String password) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
	}

 
	// view Profile here.
	public void viewProfile() { 
	System.out.println("name: " + name + " ID: " + id + " email: "
	+ email + " username: " + username
	+ " password: " + password);
	}


	
	public void resetPassword(final String password) { 
		this.password = password;

	}

	public void editProfileName(final String name) {
		this.name = name;
	}


	
	public boolean login(final String username,final String password) { 
	if (this.password.equals(password) && this.username.equals(username)) {
		return true;

		} else {
			
		return false;
		}
	}

	@Override
	public String toString() {
		return "Account{" + "name=" + name + ", ID=" + id + ", email=" + email
		+ ", username=" + username + ", password=" + password + '}';
	}
}
