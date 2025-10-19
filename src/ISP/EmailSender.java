package ISP;

public class EmailSender {
	 public static void sendEmail(Emailable e, String message){
	// Mezu bat bidaltzen du Person klaseko korreo helbidera. }
		 e.receiveEmail(message);
	}
}