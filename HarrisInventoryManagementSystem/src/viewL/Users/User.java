package viewL.Users;

public class User {

    public String name;
    private String authorityLevel = null;
    
    public User(String name , String authorityLevel){
        this.name = name;
        this.authorityLevel = authorityLevel;
    }
    
    public static User getUser(String userName) {
        User user = null ;
        return user;
    }

    public String getAuthority() {
        return authorityLevel;
    }
}
