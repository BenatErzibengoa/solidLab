package ocp;

public class AuthService {
	private ISignIn service;
	
	public AuthService(ISignIn service) {
		this.service = service;
	}
	
	public boolean signIn(String log, String pass) {
		return service.signIn(log, pass);
	}
		
}


