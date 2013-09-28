package bussinessLogicL.Authenticator;

import DataAccess.DataAccessor;
import viewL.Users.User;

public class userAuthenticator {

    private boolean testAuthentication = false;

    public boolean authenticated(String name, String passward) {
        DataAccessor da = new DataAccessor();
        String storedPassword = da.getPassword(name);
        this.testAuthentication = storedPassword.equals(passward);
        return testAuthentication;
    }

    public boolean checkForAdmin(String name, String password) {
        boolean result = false;
        User user = User.getUser(name);

        if (authenticated(name, password) && user.getAuthority().equals("Admin")) {
            result = true;
        }

        return result;
    }
}