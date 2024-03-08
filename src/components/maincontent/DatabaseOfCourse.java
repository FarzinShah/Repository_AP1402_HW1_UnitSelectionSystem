package components.maincontent;

import java.util.LinkedList;

public class DatabaseOfCourse {
    private LinkedList <Integer> personalCodes = new LinkedList<>();
    private Integer codeOfCourse;

    public DatabaseOfCourse(Integer personalCode, Integer codeOfCourse) {
        personalCodes.add(personalCode);
        this.codeOfCourse = codeOfCourse;
    }

    public LinkedList<Integer> getPersonalCodes() {
        return personalCodes;
    }

    public void deleteOneCode(int index){
        personalCodes.remove(index);
    }

    public void setPersonalCodes(LinkedList<Integer> personalCodes) {
        this.personalCodes = personalCodes;
    }

    public Integer getCodeOfCourse() {
        return codeOfCourse;
    }

    public void setCodeOfCourse(Integer codeOfCourse) {
        this.codeOfCourse = codeOfCourse;
    }
}
