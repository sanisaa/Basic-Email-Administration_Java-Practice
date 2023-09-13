package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String company = "lifthub.com";
	
	//constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		email = firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department.toLowerCase()+"."+company;

	}
	
	//ask for the department
	private String setDepartment() {
		System.out.println("New worker: " +firstName+"\nDepartment Codes\n 1 for sales\n 2 for Development \n 3 for Accounting \n 0 for none\n Enter Department Codes");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice ==1) { return "Sales"; }
		else if(deptChoice ==2) { return "Development"; }
		else if(deptChoice ==3) { return "Accounting"; }
		else {return "";}
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int random = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(random);
			
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity(){ return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME:"+firstName+" "+ lastName+
				"\nCompany Email: "+email+
				"\nMailbox Capacity: "+mailboxCapacity+ "mb";
	}
}
