public class User {
    private String name;
    protected String login;
    protected String password;
    protected String email;
    protected int age;

    public User(String name, String login, String password, String email, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
}
