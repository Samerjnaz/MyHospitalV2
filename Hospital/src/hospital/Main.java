/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospital;

import java.util.Scanner;

/**  this is the Account class that has all the main objects and methods.
 *
 * @author faisa
 */
public final class Main {
    public static void main(final String[] args) { 
    	Patient patientAccount;
        Doctor doctorAccount;
        Administrator administratorAccount;
        try (Scanner input = new Scanner(System.in)) {
			do { 
			    System.out.println("---- Create An Account ----");
			   
			    System.out.println("Enter username: ");
			   
			    final String username = input.next();
			    
			    
			    System.out.println("Enter password: ");
			    final String password = input.next();
			   
			    
			    System.out.println("Enter ID: ");
			    final String id = input.next();
			    
			    System.out.println("Enter email: ");
			    final String email = input.next();
			    
			    System.out.println("Enter name: ");
			    
			    final String name = input.next();
			    
			   
			     System.out.println("---- Choose Account Type ----");
			    System.out.println("(Doctor, Patient, Administrator)");
			    final String accountType = input.next();

			    if (accountType.equalsIgnoreCase("patient")) { 
 
			        
			    System.out.println("Enter gender: ");
			    final String gender = input.next();
			    
			    System.out.println("Enter age: ");
			    final int age = input.nextInt();
			    
			    System.out.println("Any sickness ? ");
			   final String sick = input.next();
			   final MedicalHistory medicalState = new MedicalHistory(sick);
			    
			    patientAccount = new Patient(gender, age, medicalState,
			    name, id, email, username, password);
			    
			    System.out.println("username :");
			    final String attemptusername = input.next();
			    System.out.println("password :");
			    final String attemptpassword = input.next();
			    
			    if (patientAccount.login(attemptusername, attemptpassword) == true) { 
			    System.out.println("Logged in");
			          
			        System.out.println("---- MYhospital ----");
			        System.out.println("if you want to book an appointment enter '1' ");
			        final String answer = input.next();
			        
   
			    if (answer.equalsIgnoreCase("1")) { 
			        System.out.println("What time would you like the appointment to be");

			        System.out.println("Appointment is booked");
			    } else { 
			            System.out.println("Invalid request");
			     } 
			    break; 
			    }
			   
			    else { 
			    	System.out.println("Password or Username is incorrect");
			    
			    }
			    break; 
			    }
			    
			    else if (accountType.equalsIgnoreCase("doctor")) { 
			        System.out.println("Enter Hospital name:");
			        final String hospitalname = input.next();
			        
			        System.out.println("Enter Hospital location:");
			        final String hospitallocation = input.next();
			        final Hospital hospital = new Hospital(hospitalname, hospitallocation);
			       
			       System.out.println("Clinic: ");
			       final String clinic = input.next();
			        
			       doctorAccount = new Doctor(hospital, clinic, name, id, email, username, password);
			        
			    System.out.println("---- Login ----");
			    System.out.println("username :");
			    final String attemptusername = input.next();
			    System.out.println("password :");
			    final String attemptpassword = input.next();
			    
			    if (doctorAccount.login(attemptusername, attemptpassword) == true) { 
			    System.out.println("Logged in"); 
			    } else { 
			    	System.out.println("Password or Username is incorrect");
			    break;  
			    }
			    } 
			    
			    else if (accountType.equalsIgnoreCase("administrator")) { 
			                
			        System.out.println("VerificationCode: ");
			        final String verificationCode = input.next();
			        
			        administratorAccount = new Administrator(verificationCode,
			        name, id, email, username, password);
			         
			         
			                 System.out.println("---- Login ----");
			    
			    System.out.println("username :");
			    final String attemptusername = input.next();
			    System.out.println("password :");
			    final String attemptpassword = input.next();
			    
			    if (administratorAccount.login(attemptusername, attemptpassword) == true) { 
			    System.out.println("Logged in"); 
			    }
			    else { 
			    	System.out.println("Password or Username is incorrect");
			    
			    break;
			    } 
			     } 
			    
			    else { 
			    	System.out.println("Account type is not valid, try again");
			    }
			     } while (true);
		}
        
  
        
    }
    
    
}
