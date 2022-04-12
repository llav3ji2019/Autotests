package Utils;

public class User {
    private String login;
    private String password;
    private String fullName;

    public User(){
        this.login = "";
        this.password = "";
        this.fullName = "";
    }

    public User(String login, String password,String fullName){
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public static class UserBuilder {
        private final User user;

        public UserBuilder() {
            this.user = new User();
        }

        public UserBuilder setLogin(String login){
            user.login = login;
            return this;
        }

        public UserBuilder setPassword(String password){
            user.password = password;
            return this;
        }

        public UserBuilder setFullName(String fullName){
            user.fullName = fullName;
            return this;
        }

        public User build(){
            return user;
        }
    }
}
