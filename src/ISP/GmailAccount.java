package ISP;

public class GmailAccount implements Emailable {
	String name, emailAddress;

	public GmailAccount(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}
	
	public String getEmail() {return emailAddress;};

}
