package components.subcourses;

public class MainCourses extends SampleCourses {
    public MainCourses(Integer personalCode) {
        super(personalCode);
    }

    public MainCourses(String name_of_Lecturer, String name_of_Course, int code_of_Course, int number_of_units, String date_of_class, String date_of_exam, double starting_time_of_class, double finishing_time_of_class, double starting_time_of_exam, double finishing_time_of_exam, int capacity, int max_capacity, int number_of_group) {
        super(name_of_Lecturer, name_of_Course, code_of_Course, number_of_units, date_of_class, date_of_exam, starting_time_of_class, finishing_time_of_class, starting_time_of_exam, finishing_time_of_exam, capacity, max_capacity, number_of_group);
    }
}
