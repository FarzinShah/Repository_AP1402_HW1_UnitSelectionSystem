import java.util.LinkedList;

public class Student extends Client {
    private boolean isPardis;
    private boolean isOlympiad;
    private LinkedList<Course> selected_courses = new LinkedList<>();
    public Users users = new Users();
    public Student(String username, String password, String full_name, Integer personal_code) {
        super(username, password, full_name, personal_code);
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
    public void addCourse(int code_of_course, int number_of_group){
        Course course=null;
        String isNotExist = "\n";
        for (int i = 0; i < users.coursesList.size(); i++) {
            if(users.coursesList.get(i).getCode_of_Course()==code_of_course && users.coursesList.get(i).getNumber_of_group()==number_of_group){
                course=users.coursesList.get(i);
                if (course.getCapacity()<course.getMax_capacity()) {
                    selected_courses.add(course);
                    System.out.println("The course added successfully!");
                    users.coursesList.get(i).setCapacity(users.coursesList.get(i).getCapacity()+1);

                }
            }
            else {
                isNotExist="Course Not Found!";
            }
        }
        System.out.println(isNotExist);

    }
}
