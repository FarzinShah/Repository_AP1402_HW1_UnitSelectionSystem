import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users users = new Users();
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

        int alert_controller = 0;
        System.out.println("Hi! Welcome to the System of unit selection - Version 1.0.0");
        System.out.println("All rights reserved @c -2024");

        while (boo1) {

            System.out.println("Choose one option:");
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
                    if (users.getUsersList().containsKey(next)) {
                        System.out.println("Warning! Already this username was taken. Try again!");
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
                if (users.getUsersList().isEmpty()) {
                    System.out.println("Error: There is no user made!");
                } else {
                    while (true) {
                        System.out.println("Enter your Username: ");
                        String next = sc.next();
                        System.out.println("Enter your Password: ");
                        String next1 = sc.next();
                        if (next.charAt(0) != 'A' && next.charAt(0) != 'S') {
                            System.out.println(YELLOW + "Warning!" + RESET + RED + " This username is not exist." + RESET + YELLOW + " Try again!" + RESET);
                        }
                        if(next.charAt(0)=='S'){
                            if(users.isValidStudent(next,next1)){
                                System.out.println("Log In Successful!");
                                System.out.println("Choose one option:");
                                System.out.println("1. Menu of selected units"); // list of selected
                                System.out.println("2. Menu of presented courses");
                                System.out.println("3. Select the units");
                                System.out.println("4. Show the personal information");
                                System.out.println("5. Settings");
                                System.out.println("6. Contact us");
                                System.out.println("7. Log out");
                                int option = sc.nextInt();
                                if(option==2){
                                    for (int i = 0; i < users.coursesList.size(); i++) {
                                        System.out.print(users.coursesList.get(i).getCode_of_Course() + " - " + users.coursesList.get(i).getName_of_Course() + " - Group: "+users.coursesList.get(i).getNumber_of_group() + " - " + users.coursesList.get(i).getName_of_Lecturer() + " - Date of class: " + users.coursesList.get(i).getDate_of_class() + " - Date of final exam: " + users.coursesList.get(i).getDate_of_exam());
//                                        if(users.coursesList.get(i).isGeneral()){
//                                            System.out.println(YELLOW +"This course is general"+RESET);
//                                        }
                                        if (users.coursesList.get(i).getCapacity()==users.coursesList.get(i).getMax_capacity()){
                                            System.out.print( " - Capacity: "+ RED + users.coursesList.get(i).getCapacity() + RESET);
                                            System.out.println();
                                        }else if(users.coursesList.get(i).getCapacity()>=users.coursesList.get(i).getMax_capacity()-5 && users.coursesList.get(i).getCapacity()<=users.coursesList.get(i).getMax_capacity()) {
                                            System.out.print( " - Capacity: "+ YELLOW + users.coursesList.get(i).getCapacity() + RESET);
                                            System.out.println();
                                        } else {
                                            System.out.print( " - Capacity: "+ GREEN + users.coursesList.get(i).getCapacity() + RESET);
                                            System.out.println();
                                        }
                                    }

                                }else if(option==3){
                                    System.out.println("Enter the code of course: ");
                                    int code_of_course = sc.nextInt();
                                    System.out.println("Enter the number of group: ");
                                    int number_of_group = sc.nextInt();
                                    users.getStudent().addCourse(code_of_course,number_of_group);

                                }

                            }else {
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
}
