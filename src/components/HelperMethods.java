package components;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelperMethods {
    public void ColorfulSector(){
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        System.out.println(RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"
                +RED+"0"+GREEN+"~"+RED+"0"+GREEN+"~"+RESET);
    }
    public void HatSector(){
        System.out.println("\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+"\u001B[35m"+"~^"+"\u001B[33m"+"~^"+
                "\u001B[35m"+"~^"+ "\u001B[0m");
    }
    public void ContactUs(){
        System.out.println("Department of Mathematical Sciences Sharif University of Technology,\n" +
                "P. O. Box 11155-9415, Tehran, Iran. ");
        System.out.println("Designer: "+"FarzinShah :)" + " - GMAIL: @ farzin.sh2016");

    }
    public void date(){
        LocalDateTime myDateObj = LocalDateTime.now();
//        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("\u001B[36m" + formattedDate + "\u001B[2m");
    }
    public String date1(){
        LocalDateTime myDateObj = LocalDateTime.now();
//        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        return (formattedDate);
    }

    public void defaultDatabase(Users users) {
        users.databaseOfCourses.add(new DatabaseOfCourse(401100025, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100036, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100047, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100058, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100069, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100071, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100082, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100093, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100109, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100111, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100122, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100133, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100144, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100155, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100166, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100177, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100188, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100199, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100206, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100217, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100228, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100239, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100241, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100252, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100263, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100274, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100285, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(401100296, 22015));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100023, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100034, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100045, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100056, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100067, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100078, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100089, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100101, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100112, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100123, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100131, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100142, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100153, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100164, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100175, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100186, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100197, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100204, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100215, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100226, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100237, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100248, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100259, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100261, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100272, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100283, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100294, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100305, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100316, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100317, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100328, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100339, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100341, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100352, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100363, 22016));
        users.databaseOfCourses.add(new DatabaseOfCourse(402100374, 22016));
    }

}
