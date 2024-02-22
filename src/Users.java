import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Users {
    public LinkedList<Course> coursesList = new LinkedList<>();
    private HashMap<String, String> student_usersList;
    private HashMap<String, String> admin_usersList;
    public Scanner sc = new Scanner(System.in);
    private Student student;
    public Random random = new Random();


    public Users() {
        student_usersList = new HashMap<>();
        admin_usersList = new HashMap<>();
        coursesList.add(0,new Course("Javad Ebrahimi","Algebra 1",22217,4,false,"Sun-Tue: 10:30 A.M. - 12:30 P.M.","1403/03/22 - 09:00 A.M.",10.5,12.5,9,12,31,40,1));
        coursesList.add(1,new Course("M.R. Pournaki","Calculus 2",22016,4,false,"Sat-Mon: 10:30 A.M. - 12:30 P.M.","1403/03/24 - 09:00 A.M.",10.5,12.5,9,12,255,260,1));
        coursesList.add(2,new Course("S.M. Gholamzadeh","Calculus 1",22015,4,false,"Sun-Tue: 3:00 P.M. - 5:00 P.M.","1403/03/29 - 03:30 P.M.",15,17,15.5,18,151,250,2));
        coursesList.add(3,new Course("M. Ardeshir","Fundamental of Mathematics",22142,4,false,"Sun-Tue: 10:30 P.M. - 12:30 P.M.","1403/03/22 - 09:30 A.M.",10.5,12.5,9,12,70,70,1));
        coursesList.add(4,new Course("S. Rahimi","Persian literature",31119,3,true,"Sat-Mon: 10:30 P.M. - 12:00 P.M.","1403/03/30 - 1:30 P.M.",10.5,12,13.5,14.5,55,56,2));

    }

    public HashMap<String, String> getUsersList() {
        return student_usersList;
    }

    public void setUsersList(HashMap<String, String> usersList) {
        this.student_usersList = usersList;
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

    public void setUsersListArguments(String next, String next1) {
        if (next.charAt(0) == 'A') {
            admin_usersList.put(next, next1);
            System.out.println("account is successfully created!");
        } else if (next.charAt(0) == 'S') {
            student_usersList.put(next, next1);
            System.out.println("account is successfully created!");
            System.out.println("Enter your full name:");
            //Bug: بعد اولین بار که اسم کامل رو میگیره، بار دوم به بعد نمیگیره!
            String full_name = sc.nextLine();
            int default_id = 402100000;
            System.out.println("Have you entered as a pardis student?");
            System.out.println("1. yes");
            System.out.println("2. no");
            int yes_or_no = Integer.parseInt(sc.next());
            if (yes_or_no == 1) {
                default_id = 402170000;
                System.out.println("fine! :)");
            }
            System.out.println("Have you entered as a medalist student?");
            System.out.println("1. yes");
            System.out.println("2. no");
            Integer yes_or_no1 = sc.nextInt();
            if (yes_or_no1 == 1 && yes_or_no != 1) {
                default_id = 402110000;
                System.out.println("fine! :)");
            } else if (yes_or_no == 1 && yes_or_no1 == 1) {
                default_id = 402171000;
                System.out.println("fine! :)");
            }

            Integer personal_code = default_id + random.nextInt(1, 999);
            System.out.println("Your personal code is: " + personal_code);
            student = new Student(next, next1, full_name, personal_code);
            System.out.println("Your registration is done! You should log In to continue.");
        }
    }

    public boolean isValidStudent(String username, String password) {
        if (student_usersList.containsKey(username) && student_usersList.containsValue(password)) {
            return true;
        } else return false;

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
