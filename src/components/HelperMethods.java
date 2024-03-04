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
    public void defaultCourses(){

    }

}
