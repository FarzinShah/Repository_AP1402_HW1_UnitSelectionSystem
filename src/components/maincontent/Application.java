package components.maincontent;

import components.working_with_file_and_folders.FileManager;

import java.util.Scanner;

public class Application {
    public static Users users = new Users();

    public Application() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
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
        String Magenta = "\u001B[35m";
        String Cyan = "\u001B[32m";
        String C2 = "\u001B[37m";
        HelperMethods helperMethods = new HelperMethods();
        FileManager fileManager = new FileManager();
        int alert_controller = 0;
//        setDefaultCourses();
        fileManager.readCoursesFromCoursesText2(users);
        addDefaultCoursesToFile();
        fileManager.readMainAdmin(users);
        helperMethods.defaultDatabase(users);
        System.out.println(Magenta + "Hi! Welcome to the System of unit selection" + RESET + " - " + YELLOW + " Version 1.0.0" + RESET);
        System.out.println(Cyan + "All rights reserved " + "\u001B[29m" + "@c -2024" + RESET);
        helperMethods.date();
        helperMethods.ColorfulSector();

        while (boo1) {
            boo3 = true;
            System.out.println("Choose one option:" + RESET);
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");

            int input = sc.nextInt();
            if (input == 1) {
                if (alert_controller == 0) {
                    System.out.println(RED + "Alert: " + RESET + C2 + "if you sign as an admin, your username most start with " + RESET + GREEN + "'A'" + RESET + C2 + ".  if you sign as a student, your username most start with " + RESET + GREEN + "'S'" + RESET + C2 + "." + " By entering " + RESET + RED + "'0'" + RESET + C2 + ", you can back to previous mode." + RESET);
                    alert_controller = 1;
                }
                while (boo2) {
                    System.out.println("Enter your Username: ");
                    String next = sc.next();
                    if (next.equals("0")) break;
                    System.out.println("Enter your Password: ");
                    String next1 = sc.next();
                    if (next1.equals("0")) break;
                    //delay 10 ms
                    if (users.getSUsersList().containsKey(next) || users.getAUsersList().containsKey(next)) {
                        System.out.println(RED + "Warning!" + RESET + " Already this username was taken. Try again!");
//                            break;
                    } else if (next.charAt(0) != 'A' && next.charAt(0) != 'S') {
                        //red
                        System.out.println(YELLOW + "Warning!" + RESET + RED + " This username is out of rule." + RESET + YELLOW + " Try again!" + RESET);
//                            boo2 = false;
//                            break;
                    } else {
                        users.setUsersListArguments(next, next1);
                        helperMethods.HatSector();
                        break;
                    }

                }


            } else if (input == 2) {
                if (users.getSUsersList().isEmpty() && users.getAUsersList().isEmpty()) {
                    System.out.println(RED + "Error:" + RESET + " There is no user made!");
                } else {
                    while (true) {
                        if (!boo3) {
                            input = 0;
                            break;
                        }
                        System.out.println("Enter your Username: ");
                        String next = sc.next();
                        if (next.equals("0")) break;
                        System.out.println("Enter your Password: ");
                        String next1 = sc.next();
                        if (next1.equals("0")) break;
                        if (next.charAt(0) != 'A' && next.charAt(0) != 'S') {
                            System.out.println(YELLOW + "Warning!" + RESET + RED + " This username is not exist." + RESET + YELLOW + " Try again!" + RESET);
                        }
                        if (next.charAt(0) == 'A') {
                            if (users.isValidAdmin(next, next1)) {
                                System.out.println(GREEN + "Log In Successful!" + RESET);
                                int index = 0;
                                for (int i = 0; i < users.getAdmins().size(); i++) {
                                    if (users.getAdmins().get(i).getUsername().equals(next)) {
                                        index = i;
                                    }
                                }
                                helperMethods.HatSector();
                                while (true) {
                                    System.out.println("Choose one option:");
                                    System.out.println("1. Menu of presented courses"); // list of selected
                                    System.out.println("2. Add to courses");
                                    System.out.println("3. Select the units for a student");
                                    System.out.println("4. Delete the course");
                                    System.out.println("5. Show the list of students of a course");
                                    System.out.println("6. Edit the max capacity of a course");
                                    System.out.println("7. Show the personal information");
                                    System.out.println("8. Contact us");
                                    System.out.println("9. Log out");
                                    int option = sc1.nextInt();
                                    if (option == 1) {
                                        listOfPresentedCourses();
                                    }
                                    if (option == 2) {
                                        a:
                                        while (true) {
                                            System.out.println("Enter the name of Lecturer: ");
                                            String name_of_Lecturer = sc4.nextLine();
                                            b:
                                            while (true) {
                                                System.out.println("Enter the name of Course: ");
                                                String name_of_Course = sc3.nextLine();
                                                if (name_of_Course.equals("0")) {
                                                    continue a;
                                                }
                                                c:
                                                while (true) {
                                                    System.out.println("Enter the code of Course: ");
                                                    int code_of_Course = sc2.nextInt();
                                                    if (code_of_Course == 0) {
                                                        continue b;
                                                    }
                                                    d:
                                                    while (true) {
                                                        System.out.println("Enter the number of units: ");
                                                        int number_of_units = sc.nextInt();
                                                        if (number_of_units == 0) {
                                                            continue c;
                                                        }
                                                        e:
                                                        while (true) {
                                                            System.out.println("Is this a general course? ");
                                                            System.out.println("1. yes");
                                                            System.out.println("2. no");
                                                            int isGeneralCount = sc.nextInt();
                                                            boolean isGeneral = true;
                                                            if (isGeneralCount == 2) {
                                                                isGeneral = false;
                                                            }
                                                            System.out.print("");
                                                            if (isGeneralCount == 0) {
                                                                continue d;
                                                            }
                                                            f:
                                                            while (true) {
                                                                System.out.println("Enter the date of class: ");
                                                                String date_of_class = sc3.nextLine();
                                                                System.out.print("");
                                                                if (date_of_class.equals("0")) {
                                                                    continue e;
                                                                }
                                                                g:
                                                                while (true) {
                                                                    System.out.println("Enter the starting time of class: ");
                                                                    Double starting_time_of_class = Double.valueOf(sc3.nextLine());
                                                                    System.out.print("");
                                                                    if (starting_time_of_class == 0) {
                                                                        continue f;
                                                                    }
                                                                    h:
                                                                    while (true) {
                                                                        System.out.println("Enter the finishing time of class: ");
                                                                        Double finishing_time_of_class = Double.valueOf(sc3.nextLine());
                                                                        if (finishing_time_of_class == 0) {
                                                                            continue g;
                                                                        }
                                                                        i:
                                                                        while (true) {
                                                                            System.out.println("Enter the date of exam: ");
                                                                            System.out.print(" ");
                                                                            String date_of_exam = sc5.nextLine();
                                                                            if (date_of_exam.equals("0")) {
                                                                                continue h;
                                                                            }
                                                                            j:
                                                                            while (true) {
                                                                                System.out.println("Enter the starting time of exam: ");
                                                                                Double starting_time_of_exam = Double.valueOf(sc4.next());
                                                                                if (starting_time_of_exam == 0) {
                                                                                    continue i;
                                                                                }
                                                                                k:
                                                                                while (true) {
                                                                                    System.out.println("Enter the finishing time of exam: ");
                                                                                    Double finishing_time_of_exam = Double.valueOf(sc1.next());
                                                                                    if (finishing_time_of_exam == 0) {
                                                                                        continue j;
                                                                                    }
                                                                                    l:
                                                                                    while (true) {
                                                                                        System.out.println("Enter the capacity of course: ");
                                                                                        int capacity = sc.nextInt();
                                                                                        if ((capacity == 0)) {
                                                                                            continue k;
                                                                                        }
                                                                                        m:
                                                                                        while (true) {
                                                                                            System.out.println("Enter the max capacity of course: ");
                                                                                            int max_capacity = sc.nextInt();
                                                                                            if (max_capacity == 0) {
                                                                                                continue l;
                                                                                            }
                                                                                            n:
                                                                                            while (true) {
                                                                                                System.out.println("Enter the number of group: ");
                                                                                                int number_of_group = sc.nextInt();
                                                                                                if (number_of_group == 0) {
                                                                                                    continue m;
                                                                                                }
                                                                                                users.coursesList.add(new Course(name_of_Lecturer, name_of_Course, code_of_Course, number_of_units, isGeneral, date_of_class, date_of_exam, starting_time_of_class, finishing_time_of_class, starting_time_of_exam, finishing_time_of_exam, capacity, max_capacity, number_of_group));
                                                                                                System.out.println("The course added Successfully!");
                                                                                                helperMethods.HatSector();
                                                                                                System.out.println("if you want to export the course information, Enter 1 else 2");
                                                                                                int option5 = sc.nextInt();
                                                                                                if (option5 == 1) {
                                                                                                    fileManager.createCoursesLogs(name_of_Lecturer, name_of_Course, code_of_Course, number_of_units, isGeneral, date_of_class, date_of_exam, starting_time_of_class, finishing_time_of_class, starting_time_of_exam, finishing_time_of_exam, capacity, max_capacity, number_of_group);
                                                                                                    helperMethods.HatSector();
                                                                                                } else if (option5 == 2) {
                                                                                                    System.out.println("Fine!");
                                                                                                }
                                                                                                break a;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        //دستی باید تایپ کنه! کپی پیست کنه باگ میخوره.
                                    }
                                    if (option == 3) {
                                        a:
                                        while (true) {
                                            System.out.println("Enter the personal code of student: ");
                                            int personal_code = sc.nextInt();
                                            if (personal_code == 0) continue a;
                                            b:
                                            while (true) {
                                                System.out.println("The presented courses are these: ");
                                                listOfPresentedCourses();
                                                helperMethods.HatSector();
                                                System.out.println("Enter the code of course: ");
                                                int code_of_course = sc.nextInt();
                                                if (code_of_course == 0) continue a;
                                                c:
                                                while (true) {
                                                    System.out.println("Enter the number of group: ");
                                                    int number_of_group = sc.nextInt();
                                                    if (number_of_group == 0) continue b;
                                                    for (int i = 0; i < users.getStudents().size(); i++) {
                                                        if (users.getStudents().get(i).getPersonal_code() == personal_code) {
                                                            users.getStudents().get(i).addCourse(code_of_course, number_of_group, users.getStudents().get(i).getPersonal_code());
                                                            System.out.println("The course added Successfully!");
                                                            break a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (option == 4) {
                                        System.out.println("The presented courses are these: ");
                                        listOfPresentedCourses();
                                        helperMethods.HatSector();
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        users.courseRemover(code_of_course, number_of_group);
                                    }
                                    if (option == 5) {
                                        System.out.println("Enter code of course:");
                                        int code_of_course = sc5.nextInt();
                                        System.out.println("Enter number of group:");
                                        int groupNumber = sc3.nextInt();
                                        for (int i = 0; i < users.databaseOfCourses.size(); i++) {
                                            if (users.databaseOfCourses.get(i).getCodeOfCourse() == code_of_course) {
                                                for (int j = 0; j < users.databaseOfCourses.get(i).getPersonalCodes().size(); j++) {
                                                    System.out.println(YELLOW + "*. " + RESET + users.databaseOfCourses.get(i).getPersonalCodes().get(j));
                                                }
                                            }
                                        }
                                        System.out.println("If you want delete course, enter the personal code of student. Else enter 0.");
                                        int personalCode = sc2.nextInt();
                                        if (personalCode != 0) {
                                            int index2 = 0;
                                            for (int i = 0; i < users.databaseOfCourses.size(); i++) {
                                                for (int j = 0; j < users.databaseOfCourses.get(i).getPersonalCodes().size(); j++) {
                                                    if (users.databaseOfCourses.get(i).getPersonalCodes().get(j) == personalCode) {
                                                        users.databaseOfCourses.get(i).deleteOneCode(j);
                                                        for (int k = 0; k < users.getStudents().size(); k++) {
                                                            if (users.getStudents().get(k).getPersonal_code() == personalCode) {
                                                                index2 = k;
                                                            }
                                                        }
                                                        users.getStudents().get(index2).deleteCourse(code_of_course, groupNumber);
                                                        System.out.println("The course deleted Successfully.");
                                                    }
                                                }
                                            }
                                        }
                                        helperMethods.HatSector();
                                    }
                                    if (option == 6) {
                                        System.out.println("Enter the code of course:");
                                        int code = sc1.nextInt();
                                        for (int i = 0; i < users.coursesList.size(); i++) {
                                            if (users.coursesList.get(i).getCode_of_Course() == code) {
                                                System.out.println("The maximum capacity of course is: " + RED + users.coursesList.get(i).getMax_capacity() + RESET);
                                            }
                                        }
                                        System.out.println("Enter the amount which you want to add to maximum capacity:");
                                        int amount = sc2.nextInt();

                                        for (int i = 0; i < users.coursesList.size(); i++) {
                                            if (users.coursesList.get(i).getCode_of_Course() == code && amount > 0) {
                                                users.coursesList.get(i).setMax_capacity(users.coursesList.get(i).getMax_capacity() + amount);
                                                System.out.println(GREEN + "The amount added successfully!" + RESET);
                                            } else {
                                                boo6 = false;
                                            }
                                        }
                                        if (!boo6)
                                            System.out.println(RED + "Error: " + RESET + "Failed To Add. Try again!");
                                        helperMethods.HatSector();
                                    }
                                    if (option == 7) {
                                        System.out.println("Your full name is: " + users.getAdmins().get(index).getFull_name());
                                        System.out.println("Your personal code is: " + users.getAdmins().get(index).getPersonal_code());
                                        System.out.println("Your Username is: " + users.getAdmins().get(index).getUsername());
                                        System.out.println("Your Password is: " + users.getAdmins().get(index).getPassword());
                                        helperMethods.HatSector();
                                    }
                                    if (option == 8) {
                                        helperMethods.ContactUs();
                                        helperMethods.HatSector();
                                    }
                                    if (option == 9) {
                                        boo3 = false;
                                        System.out.println(YELLOW + "You logged out." + RESET + " Have a good time!");
                                        helperMethods.HatSector();
                                        break;

                                    }

                                }
                            } else {
                                System.out.println(RED + "Error: " + RESET + "Username or Passcode is wrong! Try Again!");
                                helperMethods.HatSector();
                            }
                        }
                        if (next.charAt(0) == 'S') {
                            if (users.isValidStudent(next, next1)) {
                                System.out.println(GREEN + "Log In Successful!" + RESET);
                                int index = 0;
                                for (int i = 0; i < users.getStudents().size(); i++) {
                                    if (users.getStudents().get(i).getUsername().equals(next)) {
                                        index = i;
                                    }
                                }
                                while (true) {
                                    System.out.println("Choose one option:");
                                    System.out.println("1. Menu of selected units"); // list of selected
                                    System.out.println("2. Menu of presented courses");
                                    System.out.println("3. Select the units");
                                    System.out.println("4. Delete the units");
                                    System.out.println("5. Show the personal information");
                                    System.out.println("6. Contact us");
                                    System.out.println("7. Log out");
                                    int option = sc.nextInt();
                                    if (option == 1) {
                                        if (users.getStudents().get(index).selected_courses.isEmpty()) {
                                            System.out.println(RED + "Error:" + RESET + "You have selected any course yet!");
                                        }
                                        users.getStudents().get(index).show_menu_of_SelectedCourses();
                                        helperMethods.HatSector();
                                    }
                                    if (option == 2) {
                                        listOfPresentedCourses();
                                    } else if (option == 3) {
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        boolean boo8 = false;
                                        for (int i = 0; i < users.getStudents().size(); i++) {
                                            if (!helperMethods.courseInterference(users.getStudents().get(i).getPersonal_code(), code_of_course, users)) {
                                                System.out.println(RED + "Error:" + RESET + " This course has time interference with other selected courses.");

                                            }
                                            if (!users.getStudents().get(i).isLessThan5General(users.getStudents().get(i).getPersonal_code())) {
                                                System.out.println(RED + "Error:" + RESET + " You have unit limit on general courses. Sum of these units most be less than 5.");
                                            }
                                            if (!users.getStudents().get(i).isLessThan20(users.getStudents().get(i).getPersonal_code())) {
                                                System.out.println(RED + "Error:" + RESET + " You have unit limit. Sum of units most be less than 20.");
                                            }
                                            if (users.coursesList.get(i).getCapacity() == users.coursesList.get(i).getMax_capacity()) {
                                                System.out.println(RED + "Error:" + RESET + " The capacity of course is fulled!");
                                            }
                                            if (users.coursesList.get(i).getCapacity() < users.coursesList.get(i).getMax_capacity() && users.getStudents().get(i).getUsername().equals(next) && users.getStudents().get(i).isLessThan20(users.getStudents().get(i).getPersonal_code()) && users.getStudents().get(i).isLessThan5General(users.getStudents().get(i).getPersonal_code()) && helperMethods.courseInterference(users.getStudents().get(i).getPersonal_code(), code_of_course, users)) {
                                                users.getStudents().get(i).addCourse(code_of_course, number_of_group, users.getStudents().get(index).getPersonal_code());
                                                users.databaseOfCourses.add(new DatabaseOfCourse(users.getStudents().get(i).getPersonal_code(), code_of_course));
                                                boo8 = true;
                                            }
                                        }
                                        if (!boo8) {
                                            System.out.println(RED + "Error: " + RESET + "The Entered Code Is Wrong. Try Again!");
                                        }
                                        helperMethods.HatSector();
                                    } else if (option == 4) {
                                        System.out.println("Enter the code of course: ");
                                        int code_of_course = sc.nextInt();
                                        System.out.println("Enter the number of group: ");
                                        int number_of_group = sc.nextInt();
                                        boolean boo7 = true;
                                        for (int i = 0; i < users.getStudents().get(index).selected_courses.size(); i++) {
                                            if (users.getStudents().get(index).selected_courses.get(i).getCode_of_Course() == code_of_course && users.getStudents().get(index).selected_courses.get(i).getNumber_of_group() == number_of_group) {
                                                boo7 = true;
                                            } else boo7 = false;
                                        }
                                        if (boo7)
                                            users.getStudents().get(index).deleteCourse(code_of_course, number_of_group);
                                        else System.out.println(RED + "Error: " + RESET + "The Course Is Not Found");
                                        helperMethods.HatSector();
                                    } else if (option == 5) {
                                        System.out.println("Your full name is: " + users.getStudents().get(index).getFull_name());
                                        System.out.println("Your personal code is: " + users.getStudents().get(index).getPersonal_code());
                                        System.out.println("Your Username is: " + users.getStudents().get(index).getUsername());
                                        System.out.print("Type of entrance: ");
                                        if (!users.getStudents().get(index).isOlympiad() && users.getStudents().get(index).isPardis()) {
                                            System.out.print("Pardis");
                                            System.out.println();
                                        } else if (!users.getStudents().get(index).isPardis() && users.getStudents().get(index).isOlympiad()) {
                                            System.out.print("Olympiad");
                                            System.out.println();
                                        } else if (users.getStudents().get(index).isOlympiad() && users.getStudents().get(index).isPardis()) {
                                            System.out.print("Olympiad + Pardis");
                                        } else System.out.print("Entrance exam");
                                        System.out.println();
                                        helperMethods.HatSector();
                                    } else if (option == 6) {
                                        helperMethods.ContactUs();
                                        helperMethods.HatSector();
                                    } else if (option == 7) {
                                        boo3 = false;
                                        System.out.println(YELLOW + "You logged out." + RESET + " Have a good time!");
                                        helperMethods.HatSector();
                                        break;
                                    }

                                }
                            } else {

                                System.out.println("Maybe your username or password is incorrect. Try again!");
                                helperMethods.HatSector();

                            }
                        }
                    }
                }

            } else {
                System.out.println(RED + "Try again!" + RESET);

            }

        }
    }

    public static void setDefaultCourses() {
        users.coursesList.add(0, new Course("Javad Ebrahimi", "Algebra 1", 22217, 4, false, "Sun-Tue$ 10:30 A.M. - 12:30 P.M.", "1403/03/22 - 09:00 A.M.", 10.5, 12.5, 9, 12, 31, 40, 1));
        users.coursesList.add(1, new Course("M.R. Pournaki", "Calculus 2", 22016, 4, false, "Sat-Mon$ 10:30 A.M. - 12:30 P.M.", "1403/03/24 - 09:00 A.M.", 10.5, 12.5, 9, 12, 255, 260, 1));
        users.coursesList.add(2, new Course("S.M. Gholamzadeh", "Calculus 1", 22015, 4, false, "Sun-Tue$ 3:00 P.M. - 5:00 P.M.", "1403/03/29 - 03:30 P.M.", 15, 17, 15.5, 18, 151, 250, 2));
        users.coursesList.add(3, new Course("M. Ardeshir", "Fundamental of Mathematics", 22142, 4, false, "Sun-Tue$ 10:30 P.M. - 12:30 P.M.", "1403/03/22 - 09:30 A.M.", 10.5, 12.5, 9, 12, 70, 70, 1));
        users.coursesList.add(4, new Course("S. Rahimi", "Persian literature", 31119, 3, true, "Sat-Mon$ 10:30 A.M. - 12:00 P.M.", "1403/03/30 - 1:30 P.M.", 10.5, 12, 13.5, 14.5, 55, 56, 2));

    }

    public static void courseSorter() {
        for (int i = 0; i < users.coursesList.size(); i++) {
            if (!users.coursesListMath.contains(users.coursesList.get(i)) && ((int) Math.floor(users.coursesList.get(i).getCode_of_Course())) / 1000 == 22) {
                users.coursesListMath.add(users.coursesList.get(i));
            } else if (!users.coursesListLan.contains(users.coursesList.get(i)) && ((int) Math.floor((double) users.coursesList.get(i).getCode_of_Course())) / 1000 == 31) {
                users.coursesListLan.add(users.coursesList.get(i));
            } else if (!users.coursesListCE.contains(users.coursesList.get(i)) && ((int) Math.floor((double) users.coursesList.get(i).getCode_of_Course())) / 1000 == 40)
                users.coursesListCE.add(users.coursesList.get(i));
            else if (!users.coursesListEE.contains(users.coursesList.get(i)) && ((int) Math.floor((double) users.coursesList.get(i).getCode_of_Course())) / 1000 == 25) {
                users.coursesListEE.add(users.coursesList.get(i));
            }
        }
    }

    public static void listOfPresentedCourses() {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\033[1;92m";
        String YELLOW = "\u001B[33m";
        String Magenta = "\033[47m";
        HelperMethods helperMethods = new HelperMethods();
        courseSorter();
        if (!users.coursesListCE.isEmpty()) {
            System.out.println("List of CE courses:");
            for (int i = 0; i < users.coursesListCE.size(); i++) {
                System.out.print(Magenta + users.coursesListCE.get(i).getCode_of_Course() + " - " + users.coursesListCE.get(i).getName_of_Course() + " -" + Magenta + " Group: " + users.coursesListCE.get(i).getNumber_of_group() + " - " + users.coursesListCE.get(i).getName_of_Lecturer() + " -" + Magenta + " Date of class: " + users.coursesListCE.get(i).getDate_of_class() + " -" + Magenta + " Date of final exam: " + users.coursesListCE.get(i).getDate_of_exam() + RESET);
                if (users.coursesListCE.get(i).getCapacity() == users.coursesListCE.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + RED + users.coursesListCE.get(i).getCapacity() + RESET);
                    System.out.println();
                } else if (users.coursesListCE.get(i).getCapacity() >= users.coursesListCE.get(i).getMax_capacity() - 5 && users.coursesListCE.get(i).getCapacity() <= users.coursesListCE.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + YELLOW + users.coursesListCE.get(i).getCapacity() + RESET);
                    System.out.println();
                } else {
                    System.out.print(" - Capacity: " + GREEN + users.coursesListCE.get(i).getCapacity() + RESET);
                    System.out.println();
                }
            }
            helperMethods.HatSector();
        }
        if (!users.coursesListMath.isEmpty()) {
            System.out.println("List of Math courses:");
            for (int i = 0; i < users.coursesListMath.size(); i++) {
                System.out.print(Magenta + users.coursesListMath.get(i).getCode_of_Course() + " - " + users.coursesListMath.get(i).getName_of_Course() + " -" + Magenta + " Group: " + users.coursesListMath.get(i).getNumber_of_group() + " - " + users.coursesListMath.get(i).getName_of_Lecturer() + " -" + Magenta + " Date of class: " + users.coursesListMath.get(i).getDate_of_class() + " -" + Magenta + " Date of final exam: " + users.coursesListMath.get(i).getDate_of_exam() + RESET);
                if (users.coursesListMath.get(i).getCapacity() == users.coursesListMath.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + RED + users.coursesListMath.get(i).getCapacity() + RESET);
                    System.out.println();
                } else if (users.coursesListMath.get(i).getCapacity() >= users.coursesListMath.get(i).getMax_capacity() - 5 && users.coursesListMath.get(i).getCapacity() <= users.coursesListMath.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + YELLOW + users.coursesListMath.get(i).getCapacity() + RESET);
                    System.out.println();
                } else {
                    System.out.print(" - Capacity: " + GREEN + users.coursesListMath.get(i).getCapacity() + RESET);
                    System.out.println();
                }
            }
            helperMethods.HatSector();
        }
        if (!users.coursesListEE.isEmpty()) {
            System.out.println("List of Electrical Engineering courses:");
            for (int i = 0; i < users.coursesListEE.size(); i++) {
                System.out.print(Magenta + users.coursesListEE.get(i).getCode_of_Course() + " - " + users.coursesListEE.get(i).getName_of_Course() + " -" + Magenta + " Group: " + users.coursesListEE.get(i).getNumber_of_group() + " - " + users.coursesListEE.get(i).getName_of_Lecturer() + " -" + Magenta + " Date of class: " + users.coursesListEE.get(i).getDate_of_class() + " -" + Magenta + " Date of final exam: " + users.coursesListEE.get(i).getDate_of_exam() + RESET);
                if (users.coursesListEE.get(i).getCapacity() == users.coursesListEE.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + RED + users.coursesListEE.get(i).getCapacity() + RESET);
                    System.out.println();
                } else if (users.coursesListEE.get(i).getCapacity() >= users.coursesListEE.get(i).getMax_capacity() - 5 && users.coursesListEE.get(i).getCapacity() <= users.coursesListEE.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + YELLOW + users.coursesListEE.get(i).getCapacity() + RESET);
                    System.out.println();
                } else {
                    System.out.print(" - Capacity: " + GREEN + users.coursesListEE.get(i).getCapacity() + RESET);
                    System.out.println();
                }
            }
            helperMethods.HatSector();
        }
        if (!users.coursesListLan.isEmpty()) {
            System.out.println("List of Language Center courses:");
            for (int i = 0; i < users.coursesListLan.size(); i++) {
                System.out.print(Magenta + users.coursesListLan.get(i).getCode_of_Course() + " - " + users.coursesListLan.get(i).getName_of_Course() + " -" + Magenta + " Group: " + users.coursesListLan.get(i).getNumber_of_group() + " - " + users.coursesListLan.get(i).getName_of_Lecturer() + " -" + Magenta + " Date of class: " + users.coursesListLan.get(i).getDate_of_class() + " -" + Magenta + " Date of final exam: " + users.coursesListLan.get(i).getDate_of_exam() + RESET);
                if (users.coursesListLan.get(i).getCapacity() == users.coursesListLan.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + RED + users.coursesListLan.get(i).getCapacity() + RESET);
                    System.out.println();
                } else if (users.coursesListLan.get(i).getCapacity() >= users.coursesListLan.get(i).getMax_capacity() - 5 && users.coursesListLan.get(i).getCapacity() <= users.coursesListLan.get(i).getMax_capacity()) {
                    System.out.print(" - Capacity: " + YELLOW + users.coursesListLan.get(i).getCapacity() + RESET);
                    System.out.println();
                } else {
                    System.out.print(" - Capacity: " + GREEN + users.coursesListLan.get(i).getCapacity() + RESET);
                    System.out.println();
                }
            }
            helperMethods.HatSector();
        }


//        for (int i = 0; i < users.coursesList.size(); i++) {
//            System.out.print(Magenta+users.coursesList.get(i).getCode_of_Course() + " - " + users.coursesList.get(i).getName_of_Course() + " -"+Magenta+" Group: " + users.coursesList.get(i).getNumber_of_group() + " - " + users.coursesList.get(i).getName_of_Lecturer() + " -"+Magenta+" Date of class: " + users.coursesList.get(i).getDate_of_class() + " -" + Magenta + " Date of final exam: " + users.coursesList.get(i).getDate_of_exam() +RESET);
////                                        if(users.coursesList.get(i).isGeneral()){
////                                            System.out.println(YELLOW +"This course is general"+RESET);
////                                        }
//            if (users.coursesList.get(i).getCapacity() == users.coursesList.get(i).getMax_capacity()) {
//                System.out.print(" - Capacity: " + RED + users.coursesList.get(i).getCapacity() + RESET);
//                System.out.println();
//            } else if (users.coursesList.get(i).getCapacity() >= users.coursesList.get(i).getMax_capacity() - 5 && users.coursesList.get(i).getCapacity() <= users.coursesList.get(i).getMax_capacity()) {
//                System.out.print(" - Capacity: " + YELLOW + users.coursesList.get(i).getCapacity() + RESET);
//                System.out.println();
//            } else {
//                System.out.print(" - Capacity: " + GREEN + users.coursesList.get(i).getCapacity() + RESET);
//                System.out.println();
//            }
//            helperMethods.HatSector();
//
//        }

    }

    public static void addDefaultCoursesToFile() {
        FileManager fileManager = new FileManager();
        for (int i = 0; i < users.coursesList.size(); i++) {
            fileManager.createCoursesLogs(users.coursesList.get(i).getName_of_Lecturer(), users.coursesList.get(i).getName_of_Course(), users.coursesList.get(i).getCode_of_Course(), users.coursesList.get(i).getNumber_of_units(),
                    users.coursesList.get(i).isGeneral(), users.coursesList.get(i).getDate_of_class(), users.coursesList.get(i).getDate_of_exam(), users.coursesList.get(i).getStarting_time_of_class(), users.coursesList.get(i).getFinishing_time_of_class()
                    , users.coursesList.get(i).getStarting_time_of_exam(), users.coursesList.get(i).getFinishing_time_of_exam(), users
                            .coursesList.get(i).getCapacity(), users.coursesList.get(i).getMax_capacity(), users.coursesList.get(i).getNumber_of_group());
        }
    }
}
