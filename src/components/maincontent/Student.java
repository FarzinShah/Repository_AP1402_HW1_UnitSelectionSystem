package components.maincontent;

import java.util.LinkedList;
import java.util.Objects;

public class Student extends Client {
    private boolean isPardis;
    private boolean isOlympiad;
    public LinkedList<Course> selected_courses = new LinkedList<>();
    public Users users = Application.users;

    public Student(String username, String password, String full_name, Integer personal_code, boolean isPardis, boolean isOlympiad) {
        super(username, password, full_name, personal_code);
        this.isOlympiad = isOlympiad;
        this.isPardis = isPardis;

    }

    public boolean isPardis() {
        return isPardis;
    }

    public void setPardis(boolean pardis) {
        isPardis = pardis;
    }

    public boolean isOlympiad() {
        return isOlympiad;
    }

    public void setOlympiad(boolean olympiad) {
        isOlympiad = olympiad;
    }

    public void addCourse(int code_of_course, int number_of_group,Integer personalCode) {

        String isNotExist = "\n";
        for (int i = 0; i < users.coursesList.size(); i++) {
            if (users.coursesList.get(i).getCode_of_Course() == code_of_course && users.coursesList.get(i).getNumber_of_group() == number_of_group) {
                if (users.coursesList.get(i).getCapacity() < users.coursesList.get(i).getMax_capacity()) {
                    selected_courses.add(users.coursesList.get(i));
                    System.out.println("The course added successfully!");
                    users.coursesList.get(i).setCapacity((users.coursesList.get(i).getCapacity() + 1));
                    users.databaseOfCourses.add(new DatabaseOfCourse(personalCode,code_of_course));
                } else {
                    isNotExist = "Course Not Found!";
                }
            }

        }
        System.out.println(isNotExist);

    }

    public void deleteCourse(int code_of_course, int number_of_group) {
        for (int i = 0; i < users.coursesList.size(); i++) {
            if (users.coursesList.get(i).getCode_of_Course() == code_of_course && users.coursesList.get(i).getNumber_of_group() == number_of_group) {
                if (selected_courses.get(i).getCode_of_Course()==code_of_course) {
                    selected_courses.remove(users.coursesList.get(i));
                    System.out.println("The course deleted successfully!");
                    users.coursesList.get(i).setCapacity((users.coursesList.get(i).getCapacity() - 1));

                } else {
                    System.out.println("Deletion is Failed. Try Again!");
                }
            }
        }
    }

    public boolean isLessThan5General(Integer personalCode){
        Integer sumOfUnits = 0;
        for (int i = 0; i < users.getStudents().size(); i++) {
            if (Objects.equals(users.getStudents().get(i).getPersonal_code(), personalCode)) {
                for (int j = 0; j < users.getStudents().get(i).selected_courses.size(); j++) {
                    if (users.getStudents().get(i).selected_courses.get(j).isGeneral()){
                        sumOfUnits+=users.getStudents().get(i).selected_courses.get(j).getNumber_of_units();
                    }
                }
            }
        }
        if(sumOfUnits<=5){
            return true;
        }else return false;
    }
    public boolean isLessThan20(Integer personalCode){
        Integer sumOfUnits = 0;
        for (int i = 0; i < users.getStudents().size(); i++) {
            if(Objects.equals(users.getStudents().get(i).getPersonal_code(), personalCode)){
                for (int j = 0; j < users.getStudents().get(i).selected_courses.size(); j++) {
                    sumOfUnits+=users.getStudents().get(i).selected_courses.get(j).getNumber_of_units();
                }
            }
        }
        if (sumOfUnits<=20){
            return true;
        }else return false;
    }
    public void show_menu_of_SelectedCourses() {
        HelperMethods helperMethods = new HelperMethods();
        System.out.println("----------------------------------------"+"\u001B[35m"+"*"+"\u001B[0m"+"------------------------------------------");
        for (int i = 1; i < selected_courses.size() + 1; i++) {
            System.out.println(i + ". " +"\u001B[33m"+selected_courses.get(i - 1).getCode_of_Course()+"\u001B[0m"+" - "+ selected_courses.get(i - 1).getName_of_Course());
        }
        System.out.println("----------------------------------------"+"\u001B[35m"+"*"+"\u001B[0m"+"------------------------------------------");

//        helperMethods.HatSector();
    }

}
