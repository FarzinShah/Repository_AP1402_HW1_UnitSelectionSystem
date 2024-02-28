package components;

public class Course {
    private String name_of_Lecturer;
    private String name_of_Course;
    private int code_of_Course;
    private int number_of_units;
    private boolean isGeneral;
    private String date_of_class;
    private String date_of_exam;
    private double starting_time_of_class;
    private double finishing_time_of_class;
    private double starting_time_of_exam;
    private double finishing_time_of_exam;
    private int capacity;
    private int max_capacity;
    private int number_of_group;
    public Course(String name_of_Lecturer, String name_of_Course, int code_of_Course, int number_of_units, boolean isGeneral, String date_of_class, String date_of_exam, double starting_time_of_class, double finishing_time_of_class, double starting_time_of_exam, double finishing_time_of_exam, int capacity, int max_capacity, int number_of_group) {
        this.name_of_Lecturer = name_of_Lecturer;
        this.name_of_Course = name_of_Course;
        this.code_of_Course = code_of_Course;
        this.number_of_units = number_of_units;
        this.isGeneral = isGeneral;
        this.date_of_class = date_of_class;
        this.date_of_exam = date_of_exam;
        this.starting_time_of_class = starting_time_of_class;
        this.finishing_time_of_class = finishing_time_of_class;
        this.starting_time_of_exam = starting_time_of_exam;
        this.finishing_time_of_exam = finishing_time_of_exam;
        this.capacity = capacity;
        this.max_capacity = max_capacity;
        this.number_of_group = number_of_group;
    }

    public void menu_of_presented_courses(){

    }

    public String getName_of_Lecturer() {
        return name_of_Lecturer;
    }

    public void setName_of_Lecturer(String name_of_Lecturer) {
        this.name_of_Lecturer = name_of_Lecturer;
    }

    public String getName_of_Course() {
        return name_of_Course;
    }

    public void setName_of_Course(String name_of_Course) {
        this.name_of_Course = name_of_Course;
    }

    public int getCode_of_Course() {
        return code_of_Course;
    }

    public void setCode_of_Course(int code_of_Course) {
        this.code_of_Course = code_of_Course;
    }

    public int getNumber_of_units() {
        return number_of_units;
    }

    public void setNumber_of_units(int number_of_units) {
        this.number_of_units = number_of_units;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public void setGeneral(boolean general) {
        isGeneral = general;
    }

    public String getDate_of_class() {
        return date_of_class;
    }

    public void setDate_of_class(String date_of_class) {
        this.date_of_class = date_of_class;
    }

    public String getDate_of_exam() {
        return date_of_exam;
    }

    public void setDate_of_exam(String date_of_exam) {
        this.date_of_exam = date_of_exam;
    }

    public double getStarting_time_of_class() {
        return starting_time_of_class;
    }

    public void setStarting_time_of_class(double starting_time_of_class) {
        this.starting_time_of_class = starting_time_of_class;
    }

    public double getFinishing_time_of_class() {
        return finishing_time_of_class;
    }

    public void setFinishing_time_of_class(double finishing_time_of_class) {
        this.finishing_time_of_class = finishing_time_of_class;
    }

    public double getStarting_time_of_exam() {
        return starting_time_of_exam;
    }

    public void setStarting_time_of_exam(double starting_time_of_exam) {
        this.starting_time_of_exam = starting_time_of_exam;
    }

    public double getFinishing_time_of_exam() {
        return finishing_time_of_exam;
    }

    public void setFinishing_time_of_exam(int finishing_time_of_exam) {
        this.finishing_time_of_exam = finishing_time_of_exam;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    public int getNumber_of_group() {
        return number_of_group;
    }

    public void setNumber_of_group(int number_of_group) {
        this.number_of_group = number_of_group;
    }
}
