package components.working_with_file_and_folders;

import components.Admin;
import components.Student;
import components.Users;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private final String relativePath = "src/components/working_with_file_and_folders/logs_of_clients/";
    private final File usersTextFile = new File(relativePath + "logs_of_clients.txt");
    public void createUserFolderOnUserSignupIfAdmin(String username, String password, String full_name, Integer personal_code, String post, boolean isDepartmentChair) {
        try (FileWriter writer = new FileWriter(usersTextFile, true)) {
            if(isDepartmentChair) writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + post + ":" + "YES" + "\n");
            else writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + post + ":" + "NO" + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File userFolder = new File(relativePath + username);
        if (!userFolder.mkdir()) return;
        File file = new File(relativePath + username + "/" + "admins.txt");
        try (FileWriter writer = new FileWriter(file)) {
//            writer.write(username + ":" + password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void createUserFolderOnUserSignupIfStudent(String username, String password, String full_name, Integer personal_code, boolean isPardis, boolean isOlympiad) {
        try (FileWriter writer = new FileWriter(usersTextFile, true)) {
            if(isOlympiad && !isPardis) writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + "NO" + ":" + "YES" + "\n");
            else if(isOlympiad && isPardis) writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + "YES" + ":" + "YES" + "\n");
            else if(!isOlympiad && isPardis) writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + "YES" + ":" + "NO" + "\n");
            else writer.write(username + ":" + password + ":" + full_name + ":" + personal_code + ":" + "NO" + ":" + "NO" + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File userFolder = new File(relativePath + username);
        if (!userFolder.mkdir()) return;
        File file = new File(relativePath + username + "/" + "students.txt");
        try (FileWriter writer = new FileWriter(file)) {
//            writer.write(username + ":" + password);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readUserFromUsersText() {
        try {
            List<Users> users = new ArrayList<>();
            Users users1 = new Users();
            FileReader fileReader = new FileReader(usersTextFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(":");
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


}
