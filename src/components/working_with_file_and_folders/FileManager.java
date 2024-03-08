package components.working_with_file_and_folders;

import components.maincontent.*;

import java.io.*;
import java.util.LinkedList;

public class FileManager {
    private final String relativePath = "src/components/working_with_file_and_folders/logs_of_clients/";
    private final String relativePath2 = "src/components/working_with_file_and_folders/logs_of_courses/";
    private final String relativePath3 = "src/components/working_with_file_and_folders/logs_of_clients/admins/staticAdmin.txt";
    private final String relativePath4 = "src/components/working_with_file_and_folders/logs_of_clients/students/students_logs.txt";
    private LinkedList<File> usersFiles= new LinkedList<>();
    private final File usersTextFile = new File(relativePath + "logs_of_clients.txt");
    private final File mainCourseFile = new File(relativePath2 + "maincourses.txt");
    private final File mainCourseFile2 = new File(relativePath2 + "maincourses2.txt");
    private File usersTextFileAdmins;
    private final File usersTextFileStudents = new File(relativePath + "logs_of_clients.txt");


    public void createUserFolderOnUserSignupIfAdmin(String username, String password, String full_name, Integer personal_code, String post, boolean isDepartmentChair) {
        HelperMethods helperMethods = new HelperMethods();
        try (FileWriter writer = new FileWriter(usersTextFile, true);FileWriter writer2 = new FileWriter(adminsFileMaker(username),true)) {
            if(isDepartmentChair) {writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + post + "@" + "YES" +"@"+" ~ "+helperMethods.date1()+ "\n"); writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + post + "@" + "YES" +"@"+" ~ "+helperMethods.date1()+ "\n");}
            else writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + post + "@" + "NO" +"@"+" ~ "+helperMethods.date1()+ "\n");writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + post + "@" + "NO" +"@"+" ~ "+helperMethods.date1()+ "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createUserFolderOnUserSignupIfStudent(String username, String password, String full_name, Integer personal_code, boolean isPardis, boolean isOlympiad) {
        HelperMethods helperMethods = new HelperMethods();
        try (FileWriter writer = new FileWriter(usersTextFile, true);FileWriter writer2 = new FileWriter(studentFileMaker(username),true);FileWriter writer3 = new FileWriter(relativePath4,true)) {
            if(isOlympiad && !isPardis) {writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "NO" + "@" + "YES" + "\n");writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "NO" + "@" + "YES" + "\n");writer3.write(username + "@" + password + "@ ~ " + helperMethods.date1() +"\n");}
            else if(isOlympiad && isPardis) {writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "YES" + "@" + "YES" + "\n");writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "YES" + "@" + "YES" + "\n");writer3.write(username + "@" + password + "@ ~ " + helperMethods.date1() +"\n");}
            else if(!isOlympiad && isPardis) {writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "YES" + "@" + "NO" + "\n");writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "YES" + "@" + "NO" + "\n");writer3.write(username + "@" + password + "@ ~ " + helperMethods.date1() +"\n");}
            else {writer.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "NO" + "@" + "NO" + "\n");writer2.write(username + "@" + password + "@" + full_name + "@" + personal_code + "@" + "NO" + "@" + "NO" + "\n");writer3.write(username + "@" + password + "@ ~ " + helperMethods.date1() +"\n");}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readMainAdmin(Users users){
        try {
            FileReader fileReader = new FileReader(relativePath3);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("@");
                users.setDefaultAdminArgument(strings[0], strings[1]);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readCoursesFromCoursesText2(Users users1){

        try {
            FileReader fileReader = new FileReader(mainCourseFile2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("@");
                if (strings[13].charAt(0)=='Y')
                users1.coursesList.add(new Course(strings[2],strings[1],Integer.parseInt(strings[0]),Integer.parseInt(strings[4]),true,strings[7],strings[8],Double.parseDouble(strings[9]),Double.parseDouble(strings[10]),Double.parseDouble(strings[11]),Double.parseDouble(strings[12]),Integer.parseInt(strings[5]),Integer.parseInt(strings[6]),Integer.parseInt(strings[3])));
            if(strings[13].charAt(0)=='N'){
                    users1.coursesList.add(new Course(strings[2],strings[1],Integer.parseInt(strings[0]),Integer.parseInt(strings[4]),false,strings[7],strings[8],Double.parseDouble(strings[9]),Double.parseDouble(strings[10]),Double.parseDouble(strings[11]),Double.parseDouble(strings[12]),Integer.parseInt(strings[5]),Integer.parseInt(strings[6]),Integer.parseInt(strings[3])));}

            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readUserFromUsersText() {
        try {
            Users users1 = new Users();
            FileReader fileReader = new FileReader(usersTextFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split("@");
                if(strings[0].charAt(0)=='A'){
                    if(strings[strings.length-1].equals("YES")){
                        users1.setOneAdmin(new Admin(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),strings[4],true));
                    }else{
                        users1.setOneAdmin(new Admin(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),strings[4],false));
                    }
                }else if(strings[0].charAt(0)=='S'){
                    if(strings[strings.length-1].equals("YES") && strings[strings.length-2].equals("NO")){
                        users1.setOneStudent(new Student(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),true,false));
                    }else if(strings[strings.length-1].equals("YES") && strings[strings.length-2].equals("YES")){
                        users1.setOneStudent(new Student(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),true,true));
                    }else if(strings[strings.length-1].equals("NO") && strings[strings.length-2].equals("YES")){
                        users1.setOneStudent(new Student(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),false,true));
                    } else users1.setOneStudent(new Student(strings[0],strings[1],strings[2],Integer.getInteger(strings[3]),false,false));
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createCoursesLogs(String name_of_Lecturer, String name_of_Course, int code_of_Course, int number_of_units, boolean isGeneral, String date_of_class, String date_of_exam, double starting_time_of_class, double finishing_time_of_class, double starting_time_of_exam, double finishing_time_of_exam, int capacity, int max_capacity, int number_of_group){
        String isGeneral1 = "";
        HelperMethods helperMethods = new HelperMethods();
        try (FileWriter writer = new FileWriter(usersTextFile, true);FileWriter writer3 = new FileWriter(mainCourseFile,true);
        ) {
            if(isGeneral) isGeneral1 = "YES";
            else isGeneral1 = "NO";
            writer.write(code_of_Course+"@"+name_of_Course+"@"+name_of_Lecturer+"@"+number_of_group+"@"+number_of_units+"@"+capacity+"@"+max_capacity+"@"+date_of_class+"@"+date_of_exam+"@"+starting_time_of_class+"@"+finishing_time_of_class+"@"+starting_time_of_exam+"@"+finishing_time_of_exam+"@"+isGeneral1+" ~ "+helperMethods.date1()+ "\n");
//            writer2.write(code_of_Course+":"+name_of_Course+":"+name_of_Lecturer+":"+number_of_group+":"+number_of_units+":"+capacity+":"+max_capacity+":"+date_of_class+":"+date_of_exam+":"+starting_time_of_class+":"+finishing_time_of_class+":"+starting_time_of_exam+":"+finishing_time_of_exam+":"+isGeneral1+" ~ "+helperMethods.date1()+ "\n");
            writer3.write(code_of_Course+"@"+name_of_Course+"@"+name_of_Lecturer+"@"+number_of_group+"@"+number_of_units+"@"+capacity+"@"+max_capacity+"@"+date_of_class+"@"+date_of_exam+"@"+starting_time_of_class+"@"+finishing_time_of_class+"@"+starting_time_of_exam+"@"+finishing_time_of_exam+"@"+isGeneral1+" ~ "+helperMethods.date1()+ "\n");
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
//        File courseFolder = new File(relativePath2 + code_of_Course);
//        if (!courseFolder.mkdir()) return;
//        File file = new File(relativePath2 + name_of_Course + "/" + "course.txt");
//        try (FileWriter writer = new FileWriter(file)) {
////            writer.write(username + ":" + password);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    public File adminsFileMaker(String username){
        return new File(relativePath +"admins/"+username+ ".txt");
    }
    public File studentFileMaker(String username){
        return new File(relativePath +"students/"+username+ ".txt");
    }
    public File courseFileMaker(String username){
        return new File(relativePath2 +"courses/"+username+ ".txt");
    }
    public void adminLogSubmitter(String username,String function) throws FileNotFoundException {
        FileReader fileReader2 = new FileReader(adminsFileMaker(username));

        try (FileWriter writer2 = new FileWriter(adminsFileMaker(username),true)) {
             writer2.write(username + "@" + function);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void fileReader2(){

    }

}
