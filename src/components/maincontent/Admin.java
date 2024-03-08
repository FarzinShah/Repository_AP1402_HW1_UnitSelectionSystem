package components.maincontent;

import java.util.*;

public class Admin extends Client{
    private String post;
    private boolean isDepartmentChair = false;
    private Map<Map<String,String>,Integer> personalisation = new HashMap<>(); // لازم نشد فعلا.
    public Admin(String username, String password, String full_name, Integer personal_code, String post, boolean isDepartmentChair) {
        super(username, password, full_name, personal_code);
        this.post = post;
        this.isDepartmentChair = isDepartmentChair;
    }


    public Map<Map<String, String>, Integer> getPersonalisation() {
        return personalisation;
    }

    public void setPersonalisation(Map<Map<String, String>, Integer> personalisation) {
        this.personalisation = personalisation;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public boolean isDepartmentChair() {
        return isDepartmentChair;
    }

    public void setDepartmentChair(boolean departmentChair) {
        isDepartmentChair = departmentChair;
    }
}
