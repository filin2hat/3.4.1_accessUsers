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

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}
