package components;

import components.working_with_file_and_folders.FileManager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Users {
    public LinkedList<Course> coursesList = new LinkedList<>();
    public LinkedList<Course> coursesListMath = new LinkedList<>();
    public LinkedList<Course> coursesListCE = new LinkedList<>();
    public LinkedList<Course> coursesListEE = new LinkedList<>();
    public LinkedList<Course> coursesListLan = new LinkedList<>();
    public HashMap<Integer,LinkedList<Integer>> courseCodeToPersonalCodes = new HashMap<>();
    public LinkedList<DatabaseOfCourse> databaseOfCourses = new LinkedList<>();
    private HashMap<String, String> student_usersList;
    private HashMap<String, String> admin_usersList;
    public Scanner sc = new Scanner(System.in);
    public Scanner sc2 = new Scanner(System.in);
    public Scanner sc3 = new Scanner(System.in);
    public FileManager fileManager = new FileManager();
    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Admin> admins = new LinkedList<>();


    public Random random = new Random();


    public Users() {
        student_usersList = new HashMap<>();
        admin_usersList = new HashMap<>();

    }


    public HashMap<String, String> getSUsersList() {
        return student_usersList;
    }

    public HashMap<String, String> getAUsersList() {
        return admin_usersList;
    }


    public void setSUsersList(HashMap<String, String> usersList) {
        this.student_usersList = usersList;
    }

    public void setAUsersList(HashMap<String, String> usersList) {
        this.admin_usersList = usersList;
    }


    public HashMap<String, String> getStudent_usersList() {
        return student_usersList;
    }

    public void setStudent_usersList(HashMap<String, String> student_usersList) {
        this.student_usersList = student_usersList;
    }

    public HashMap<String, String> getAdmin_usersList() {
        return admin_usersList;
    }

    public void setAdmin_usersList(HashMap<String, String> admin_usersList) {
        this.admin_usersList = admin_usersList;
    }
    public void setDefaultAdminArgument(String next, String next1) {
        admin_usersList.put(next, next1);
        admins.add(new Admin(next, next1, "John Forbes", 402600001, "Central Admin",false));
        fileManager.createUserFolderOnUserSignupIfAdmin(next, next1, "John Forbes", 402600001, "Central Admin",false);

    }
    public void setUsersListArguments(String next, String next1) {
        HelperMethods helperMethods = new HelperMethods();
        if (next.charAt(0) == 'A') {
            admin_usersList.put(next, next1);
            System.out.println("Your account is successfully created!");
            helperMethods.HatSector();
            System.out.println("Enter your full name:");
            //Bug: بعد اولین بار که اسم کامل رو میگیره، بار دوم به بعد نمیگیره!
            String full_name = sc3.nextLine();
            int default_id = 402900000;
            System.out.println("Choose your post:");
            System.out.println("1. Department Chair"); //  میتونه با عوض کردن اسم معاون، اونو عوضش کنه! درس خاص رو اضافه کنه!
            System.out.println("2. Education Vice Chair"); // این ابراهیمیه!
            System.out.println("3. Education Assistant"); // این بهزاده! کارش با ابراهیمی یکیه ولی برا حذف کردن درسا باید اجازه ازش داشته باشه.
            int option = sc.nextInt();
            if (option == 1) {
                Integer personalCode = default_id + 10000 + random.nextInt(1, 999);
                admins.add(new Admin(next, next1, full_name, personalCode, "Department Chair",true));
                fileManager.createUserFolderOnUserSignupIfAdmin(next, next1, full_name, personalCode, "Education Vice Chair",false);
                System.out.println("Your personal code is: " +"\u001B[33m"+ personalCode + "\u001B[0m");
                System.out.println("\u001B[32m"+"Your registration is done!"+" You should log In to continue."+"\u001B[0m");
            } else if (option == 2) {
                Integer personalCode = default_id + 20000 + random.nextInt(1, 999);
                admins.add(new Admin(next, next1, full_name, personalCode, "Education Vice Chair",false));
                fileManager.createUserFolderOnUserSignupIfAdmin(next, next1, full_name, personalCode, "Education Vice Chair",false);
                System.out.println("Your personal code is: " +"\u001B[33m"+ personalCode + "\u001B[0m");
                System.out.println("\u001B[32m"+"Your registration is done!"+" You should log In to continue."+"\u001B[0m");
            } else if (option == 3) {
                Integer personalCode = default_id + 30000 + random.nextInt(1, 999);
                admins.add(new Admin(next, next1, full_name, personalCode, "Education Assistant",false));
                fileManager.createUserFolderOnUserSignupIfAdmin(next, next1, full_name, personalCode, "Education Assistant",false);
                System.out.println("Your personal code is: " +"\u001B[33m"+ personalCode + "\u001B[0m");
                System.out.println("\u001B[32m"+"Your registration is done!"+" You should log In to continue."+"\u001B[0m");
            }
        } else if (next.charAt(0) == 'S') {
            student_usersList.put(next, next1);
            boolean isPardis = false;
            boolean isOlympiad = false;
            System.out.println("account is successfully created!");
            helperMethods.HatSector();
            System.out.println("Enter your full name: ");
            //Bug: بعد اولین بار که اسم کامل رو میگیره، بار دوم به بعد نمیگیره!
            String q = sc2.nextLine();
            int default_id = 402100000;

            System.out.println("Have you entered as a pardis student?");
            System.out.println("1. yes");
            System.out.println("2. no");
            int yes_or_no = sc.nextInt();
            if (yes_or_no == 1) {
                default_id = 402170000;
                System.out.println("fine! :)");
                isPardis = true;
            }
            System.out.println("Have you entered as a medalist student?");
            System.out.println("1. yes");
            System.out.println("2. no");
            int yes_or_no1 = sc.nextInt();
            if (yes_or_no1 == 1 && yes_or_no != 1) {
                default_id = 402110000;
                System.out.println("fine! :)");
                isOlympiad = true;
            } else if (yes_or_no == 1 && yes_or_no1 == 1) {
                default_id = 402171000;
                System.out.println("fine! :)");

            }

            Integer personal_code = default_id + random.nextInt(1, 999);
            System.out.println("Your personal code is: " +"\u001B[33m"+ personal_code + "\u001B[0m");
            students.add(new Student(next, next1, q, personal_code, isPardis, isOlympiad));
            fileManager.createUserFolderOnUserSignupIfStudent(next, next1, q, personal_code, isPardis, isOlympiad);
            System.out.println("\u001B[32m"+"Your registration is done!"+" You should log In to continue."+"\u001B[0m");
        }
    }

    public boolean isValidStudent(String username, String password) {
        String isUsername = "";
        String isPassword = "";
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUsername().equals(username) && students.get(i).getPassword().equals(password) && student_usersList.containsKey(username) && student_usersList.containsValue(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidAdmin(String username, String password) {
        String isUsername = "";
        String isPassword = "";
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUsername().equals(username) && admins.get(i).getPassword().equals(password) && admin_usersList.containsKey(username) && admin_usersList.containsValue(password)) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public LinkedList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(LinkedList<Admin> admins) {
        this.admins = admins;
    }

    public void setOneAdmin(Admin admin){
        admins.add(admin);
    }
    public void setOneStudent(Student student){
        students.add(student);
    }

    public void courseRemover(int code_of_course, int number_of_group) {
        for (int i = 0; i < coursesList.size(); i++) {
            if (coursesList.get(i).getCode_of_Course() == code_of_course && coursesList.get(i).getNumber_of_group() == number_of_group) {
                coursesList.remove(i);
                System.out.println("\u001B[32m"+"The course removed Successfully!"+"\u001B[0m");
            }
        }

    }
}
