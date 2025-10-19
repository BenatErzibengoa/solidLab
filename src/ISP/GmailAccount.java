package ISP;

import java.util.ArrayList;

public class GmailAccount implements Emailable {
	String name, emailAddress;
	ArrayList<String> emails = new ArrayList<String>();

	public GmailAccount(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}
	
	public String getEmail() {return emailAddress;};
	
	public void receiveEmail(String email) {
		emails.add(email);
		}
	
	public void printEmails() {
		for(String email: emails) {
			System.out.println("Email: " + email);
		}
	}

}
