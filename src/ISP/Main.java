package ISP;

public class Main {

	public static void main(String[] args) {
		GmailAccount beñatGmail = new GmailAccount("Beñat", "beñat@gmail.com");
		EmailSender.sendEmail(beñatGmail, "SI2 proiektuaren GitHub esteka bidali faborez");
		EmailSender.sendEmail(beñatGmail, "3 kreditu eskuratu boluntariotza hau eginez...");
		EmailSender.sendEmail(beñatGmail, "Datorren astean hitzaldi bat egongo da fakultatean");

		
		beñatGmail.printEmails();
		
	}

}
