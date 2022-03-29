public class User {
    private String login;
    private String password;
    private String fullname;

    public User(String login, String password,String fullname){
        this.login = login;
        this.password = password;
        this.fullname = fullname;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getFullname() {
        return fullname;
    }
}
