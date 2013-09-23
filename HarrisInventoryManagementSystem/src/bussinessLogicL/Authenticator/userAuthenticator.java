package bussinessLogicL.Authenticator;
public class userAuthenticator {
	private boolean testAuthentication = false;
	
	public boolean authenticated(String name, String passward){			
		this.testAuthentication = this.retrievePassward(name) == passward;	
		return testAuthentication;
	}
	
	private String retrievePassward(String name){
		String passward = null;
		return passward;
	}
}
