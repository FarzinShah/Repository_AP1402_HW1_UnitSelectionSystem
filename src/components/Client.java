package components;

public abstract class Client {
    private String username;
    private String password;
    private String full_name;
    private Integer personal_code;

    public Client(String username, String password, String full_name, Integer personal_code) {
        this.username = username;
        this.password = password;
        this.full_name = full_name;
        this.personal_code = personal_code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getPersonal_code() {
        return personal_code;
    }

    public void setPersonal_code(Integer personal_code) {
        this.personal_code = personal_code;
    }
    //optional: number of login;
    // file: saving the time of logs;

}
