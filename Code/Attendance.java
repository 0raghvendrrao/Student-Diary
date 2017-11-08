import java.util.*;
import java.util.Scanner;

public class Attendance {
     Date lastUpdated;
    static int minAttendance;
     int classesAttended;
     int totalClasses;
     int percentage;
    public Attendance(int minAttendance){
        this.minAttendance = minAttendance;
        lastUpdated = new Date();
        classesAttended = 0;
        totalClasses = 0;
        percentage = 100;
    }
    public void addAttendance(boolean r){
        lastUpdated = new Date();
        totalClasses++;
        if(r)
        classesAttended++;
        percentage = (classesAttended*100)/totalClasses;
        if(percentage<minAttendance) System.out.println("Attendance shortage");
    }
    public String toString(){
        return "Last Updated: " + lastUpdated + " Percentage: " + percentage + " Shortage: "+(percentage<minAttendance)+"\n";
    }
    public void print(){
        System.out.println(this.toString());
    }
}
