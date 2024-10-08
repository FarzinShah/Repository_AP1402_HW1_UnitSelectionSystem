package components;

import java.util.LinkedList;

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

    public void addCourse(int code_of_course, int number_of_group) {

        String isNotExist = "\n";
        for (int i = 0; i < users.coursesList.size(); i++) {
            if (users.coursesList.get(i).getCode_of_Course() == code_of_course && users.coursesList.get(i).getNumber_of_group() == number_of_group) {
                if (users.coursesList.get(i).getCapacity() < users.coursesList.get(i).getMax_capacity()) {
                    selected_courses.add(users.coursesList.get(i));
                    System.out.println("The course added successfully!");
                    users.coursesList.get(i).setCapacity((users.coursesList.get(i).getCapacity() + 1));

                } else {
                    isNotExist = "practicial_classes.Course Not Found!";
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


                }
            }
        }
    }

    public void show_menu_of_SelectedCourses() {
        for (int i = 1; i < selected_courses.size() + 1; i++) {
            System.out.println(i + ". " + selected_courses.get(i - 1).getName_of_Course());
        }
        System.out.println("----------------------------------------*------------------------------------------");
    }

}
