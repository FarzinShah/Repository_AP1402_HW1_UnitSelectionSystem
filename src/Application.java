import java.util.Scanner;

public class Application {
    public static Users users = new Users();

    public Application() {
        Scanner sc = new Scanner(System.in);
        boolean boo1 = true;
        boolean boo2 = true;
        boolean boo3 = true;
        boolean boo4 = true;
        boolean boo5 = true;
        boolean boo6 = true;
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String Magenta= "\u001B[35m";
        String Cyan= "\u001B[32m";



        int alert_controller = 0;
        setDefaultCourses();
        System.out.println(Magenta+"Hi! Welcome to the System of unit selection" +RESET+" - "+YELLOW+" Version 1.0.0"+RESET);
        System.out.println(Cyan+"All rights reserved "+"\u001B[29m"+"@c -2024"+RESET);
        System.out.println(RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RESET);

        while (boo1) {
            boo3 = true;
            System.out.println("Choose one option:"+RESET);
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            int input = sc.nextInt();

            if (input == 1) {
                if (alert_controller == 0) {
                    System.out.println("Alert: if you sign as an admin, your username most start with 'A'.  if you sign as a student, your username most start with 'S' ");
                    alert_controller = 1;
                }
                while (boo2) {

                    System.out.println("Enter your Username: ");
                    String next = sc.next();
                    System.out.println("Enter your Password: ");
                    String next1 = sc.next();
                    //delay 10 ms
                    if (users.getSUsersList().containsKey(next) || users.getAUsersList().containsKey(next)) {
                        System.out.println(RED+"Warning!"+RESET+" Already this username was taken. Try again!");
//                            break;
                    } else if (next.charAt(0) != 'A' && next.charAt(0) != 'S') {
                        //red
                        System.out.println(YELLOW + "Warning!" + RESET + RED + " This username is out of rule." + RESET + YELLOW + " Try again!" + RESET);
//                            boo2 = false;
//                            break;
                    } else {
                        users.setUsersListArguments(next, next1);
                        break;
                    }

                }


            } else if (input == 2) {
                if (users.getSUsersList().isEmpty() && users.getAUsersList().isEmpty()) {
                    System.out.println("Error: There is no user made!");
                } else {
                    while (true) {
                        if(!boo3){
                            input = 0;
                            break;
                        }
                        System.out.println("Enter your Username: ");
                        String next = sc.next();
                        System.out.println("Enter your Password: ");
                        String next1 = sc.next();
                        if (next.charAt(0) != 'A' && next.charAt(0) != 'S') {
                            System.out.println(YELLOW + "Warning!" + RESET + RED + " This username is not exist." + RESET + YELLOW + " Try again!" + RESET);
                        }
                        if(next.charAt(0) == 'A'){
                            if (users.isValidAdmin(next,next1)){
                                System.out.println("Log In Successful!");
                                int index = 0;
                                for (int i = 0; i < users.getAdmins().size(); i++) {
                                    if(users.getAdmins().get(i).getUsername().equals(next)){
                                        index=i;
                                    }
                                }
                                while (true){
                                    if(users.getAdmins().get(index).isDepartmentChair()){
                                        System.out.println("Choose one option:");
                                        System.out.println("1. Change the Education Vice Chair");
                                        System.out.println("2. Menu of presented courses"); // list of selected
                                        System.out.println("3. Show the personal information");
                                        System.out.println("4. Settings");
                                        System.out.println("5. Contact us");
                                        System.out.println("6. Log out");
                                    }
                                    System.out.println("Choose one option:");
                                    System.out.println("1. Menu of presented courses"); // list of selected
                                    System.out.println("2. Add to courses");
                                    System.out.println("3. Select the units for a student");
                                    System.out.println("4. Delete the course");
                                    System.out.println("5. Show the personal information");
                                    System.out.println("6. Settings");
                                    System.out.println("7. Contact us");
                                    System.out.println("8. Log out");
                                    int option = sc.nextInt();
                                    if(option == 1){
                                        for (int i = 0; i < users.coursesList.size(); i++) {
                                            System.out.print(users.coursesList.get(i).getCode_of_Course() + " - " + users.coursesList.get(i).getName_of_Course() + " - Group: " + users.coursesList.get(i).getNumber_of_group() + " - " + users.coursesList.get(i).getName_of_Lecturer() + " - Date of class: " + users.coursesList.get(i).getDate_of_class() + " - Date of final exam: " + users.coursesList.get(i).getDate_of_exam());
//                                        if(users.coursesList.get(i).isGeneral()){
//                                            System.out.println(YELLOW +"This course is general"+RESET);
//                                        }
                                            if (users.coursesList.get(i).getCapacity() == users.coursesList.get(i).getMax_capacity()) {
                                                System.out.print(" - Capacity: " + RED + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            } else if (users.coursesList.get(i).getCapacity() >= users.coursesList.get(i).getMax_capacity() - 5 && users.coursesList.get(i).getCapacity() <= users.coursesList.get(i).getMax_capacity()) {
                                                System.out.print(" - Capacity: " + YELLOW + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            } else {
                                                System.out.print(" - Capacity: " + GREEN + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            }
                                        }
                                    }
                                    if(option == 2){
                                        System.out.println("Enter the name of Lecturer: ");
                                        String name_of_Lecturer = sc.next();
                                        System.out.println("Enter the name_of_Course: ");
                                        String name_of_Course = sc.next();
                                        System.out.println("Enter the code of Course: ");
                                        int code_of_Course = sc.nextInt();
                                        System.out.println("Enter the number of units: ");
                                        int number_of_units = sc.nextInt();
                                        System.out.println("Is this a general course? ");
                                        System.out.println("1. yes");
                                        System.out.println("2. no");
                                        int isGeneralCount = sc.nextInt();
                                        boolean isGeneral = true;
                                        if(isGeneralCount == 2){
                                            isGeneral = false;
                                        }
                                        System.out.println("Enter the date of class: ");
                                        String date_of_class = sc.next();
                                        System.out.println("Enter the date of exam: ");
                                        String date_of_exam = sc.next();
                                        System.out.println("Enter the starting time of class: ");
                                        double starting_time_of_class = sc.nextDouble();
                                        System.out.println("Enter the finishing time of class: ");
                                        double finishing_time_of_class = sc.nextDouble();
                                        System.out.println("Enter the starting time of exam: ");
                                        double starting_time_of_exam = sc.nextDouble();
                                        System.out.println("Enter the finishing time of exam: ");
                                        double finishing_time_of_exam = sc.nextDouble();
                                        System.out.println("Enter the capacity of course: ");
                                        int capacity = sc.nextInt();
                                        System.out.println("Enter the max capacity of course: ");
                                        int max_capacity = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        users.coursesList.add(new Course(name_of_Lecturer, name_of_Course, code_of_Course ,number_of_units, isGeneral, date_of_class, date_of_exam, starting_time_of_class, finishing_time_of_class, starting_time_of_exam, finishing_time_of_exam, capacity, max_capacity, number_of_group));
                                        System.out.println("The course added Successfully!");
                                    }
                                    if(option == 3){
                                        System.out.println("Enter the personal code of student: ");
                                        int personal_code = sc.nextInt();
                                        System.out.println("The presented courses are these: ");
                                        listOfPresentedCourses();
                                        System.out.println("----------------------------------------*----------------------------------------");
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        for (int i = 0; i < users.getStudents().size(); i++) {
                                            if (users.getStudents().get(i).getPersonal_code()==personal_code) {
                                                users.getStudents().get(i).addCourse(code_of_course, number_of_group);
                                                System.out.println("The course added Successfully!");
                                            }
                                        }
                                    }
                                    if(option == 4){
                                        System.out.println("The presented courses are these: ");
                                        listOfPresentedCourses();
                                        System.out.println("----------------------------------------*----------------------------------------");
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        users.courseRemover(code_of_course,number_of_group);
                                    }
                                    if(option == 5){
                                        System.out.println("Your full name is: " + users.getAdmins().get(index).getFull_name());
                                        System.out.println("Your personal code is: " + users.getAdmins().get(index).getPersonal_code());
                                        System.out.println("Your Username is: " + users.getAdmins().get(index).getUsername());
                                        System.out.println("Your Password is: " + users.getAdmins().get(index).getPassword());

                                    }
                                    if(option == 8){
                                        boo3 = false;
                                        System.out.println("You logged out. Have a good time!");
                                        System.out.println("-----------------------------------------*-----------------------------------------");
                                        break;

                                    }

                                }
                            }
                        }
                        if (next.charAt(0) == 'S') {
                            if (users.isValidStudent(next, next1)) {
                                System.out.println("Log In Successful!");
                                int index = 0;
                                for (int i = 0; i < users.getStudents().size(); i++) {
                                    if(users.getStudents().get(i).getUsername().equals(next)){
                                        index=i;
                                    }
                                }
                                while (true) {
                                    System.out.println("Choose one option:");
                                    System.out.println("1. Menu of selected units"); // list of selected
                                    System.out.println("2. Menu of presented courses");
                                    System.out.println("3. Select the units");
                                    System.out.println("4. Delete the units");
                                    System.out.println("5. Show the personal information");
                                    System.out.println("6. Settings");
                                    System.out.println("7. Contact us");
                                    System.out.println("8. Log out");
                                    int option = sc.nextInt();
                                    if(option == 1){
                                        users.getStudents().get(index).show_menu_of_SelectedCourses();
                                    }
                                    if (option == 2) {
                                        for (int i = 0; i < users.coursesList.size(); i++) {
                                            System.out.print(users.coursesList.get(i).getCode_of_Course() + " - " + users.coursesList.get(i).getName_of_Course() + " - Group: " + users.coursesList.get(i).getNumber_of_group() + " - " + users.coursesList.get(i).getName_of_Lecturer() + " - Date of class: " + users.coursesList.get(i).getDate_of_class() + " - Date of final exam: " + users.coursesList.get(i).getDate_of_exam());
//                                        if(users.coursesList.get(i).isGeneral()){
//                                            System.out.println(YELLOW +"This course is general"+RESET);
//                                        }
                                            if (users.coursesList.get(i).getCapacity() == users.coursesList.get(i).getMax_capacity()) {
                                                System.out.print(" - Capacity: " + RED + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            } else if (users.coursesList.get(i).getCapacity() >= users.coursesList.get(i).getMax_capacity() - 5 && users.coursesList.get(i).getCapacity() <= users.coursesList.get(i).getMax_capacity()) {
                                                System.out.print(" - Capacity: " + YELLOW + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            } else {
                                                System.out.print(" - Capacity: " + GREEN + users.coursesList.get(i).getCapacity() + RESET);
                                                System.out.println();
                                            }
                                        }

                                    } else if (option == 3) {
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();

                                        for (int i = 0; i < users.getStudents().size(); i++) {
                                            if (users.getStudents().get(i).getUsername().equals(next)) {
                                                users.getStudents().get(i).addCourse(code_of_course, number_of_group);
                                            }

                                        }

                                    }else if(option == 4){
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        users.getStudents().get(index).deleteCourse(code_of_course,number_of_group);
                                    }
                                    else if(option == 5){
                                        System.out.println("Your full name is: " + users.getStudents().get(index).getFull_name());
                                        System.out.println("Your personal code is: " + users.getStudents().get(index).getPersonal_code());
                                        System.out.println("Your Username is: " + users.getStudents().get(index).getUsername());
                                        System.out.print("Type of entrance: ");
                                        if (!users.getStudents().get(index).isOlympiad() && users.getStudents().get(index).isPardis()){
                                            System.out.print("Pardis");
                                            System.out.println();
                                        }else if(!users.getStudents().get(index).isPardis() && users.getStudents().get(index).isOlympiad()){
                                            System.out.print("Olympiad");
                                            System.out.println();
                                        }else if(users.getStudents().get(index).isOlympiad() && users.getStudents().get(index).isPardis()){
                                            System.out.print("Olympiad + Pardis");
                                        }else System.out.print("Entrance exam");
                                        System.out.println();
                                    }else if(option == 8){
                                        System.out.println("You logged out. Have a good time!");
                                        System.out.println("-----------------------------------------*-----------------------------------------");
                                        break;
                                    }

                                }
                            } else {
                                System.out.println("Maybe your username or password is incorrect. Try again!");
                            }
                        }
                    }
                }

            } else {
                System.out.println("Try again!");
            }

        }
    }
    public static void setDefaultCourses(){
        users.coursesList.add(0, new Course("Javad Ebrahimi", "Algebra 1", 22217, 4, false, "Sun-Tue: 10:30 A.M. - 12:30 P.M.", "1403/03/22 - 09:00 A.M.", 10.5, 12.5, 9, 12, 31, 40, 1));
        users.coursesList.add(1, new Course("M.R. Pournaki", "Calculus 2", 22016, 4, false, "Sat-Mon: 10:30 A.M. - 12:30 P.M.", "1403/03/24 - 09:00 A.M.", 10.5, 12.5, 9, 12, 255, 260, 1));
        users.coursesList.add(2, new Course("S.M. Gholamzadeh", "Calculus 1", 22015, 4, false, "Sun-Tue: 3:00 P.M. - 5:00 P.M.", "1403/03/29 - 03:30 P.M.", 15, 17, 15.5, 18, 151, 250, 2));
        users.coursesList.add(3, new Course("M. Ardeshir", "Fundamental of Mathematics", 22142, 4, false, "Sun-Tue: 10:30 P.M. - 12:30 P.M.", "1403/03/22 - 09:30 A.M.", 10.5, 12.5, 9, 12, 70, 70, 1));
        users.coursesList.add(4, new Course("S. Rahimi", "Persian literature", 31119, 3, true, "Sat-Mon: 10:30 P.M. - 12:00 P.M.", "1403/03/30 - 1:30 P.M.", 10.5, 12, 13.5, 14.5, 55, 56, 2));

    }

    public static void listOfPresentedCourses(){
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        for (int i = 0; i < users.coursesList.size(); i++) {
            System.out.print(users.coursesList.get(i).getCode_of_Course() + " - " + users.coursesList.get(i).getName_of_Course() + " - Group: " + users.coursesList.get(i).getNumber_of_group() + " - " + users.coursesList.get(i).getName_of_Lecturer() + " - Date of class: " + users.coursesList.get(i).getDate_of_class() + " - Date of final exam: " + users.coursesList.get(i).getDate_of_exam());
//                                        if(users.coursesList.get(i).isGeneral()){
//                                            System.out.println(YELLOW +"This course is general"+RESET);
//                                        }
            if (users.coursesList.get(i).getCapacity() == users.coursesList.get(i).getMax_capacity()) {
                System.out.print(" - Capacity: " + RED + users.coursesList.get(i).getCapacity() + RESET);
                System.out.println();
            } else if (users.coursesList.get(i).getCapacity() >= users.coursesList.get(i).getMax_capacity() - 5 && users.coursesList.get(i).getCapacity() <= users.coursesList.get(i).getMax_capacity()) {
                System.out.print(" - Capacity: " + YELLOW + users.coursesList.get(i).getCapacity() + RESET);
                System.out.println();
            } else {
                System.out.print(" - Capacity: " + GREEN + users.coursesList.get(i).getCapacity() + RESET);
                System.out.println();
            }
        }
    }
}
