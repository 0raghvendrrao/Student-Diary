import java.util.*;
import java.io.*;

public class Course implements Serializable{
  String code;
  String name;
  int credit;
  Attendance attend;
  ArrayList<Faculty>f;
  Course(){
    code="";
    name="";
    credit=0;
  }

  Course(String cd,String nm,ArrayList<Faculty>ff){
    code=cd;
    name=nm;
    f.addAll(ff);
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
    System.out.print("Enter Course Name : ");
    name=s.nextLine();
    System.out.println();
    

  }

  public void setCourseCode(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
  }

  public String getCourseName(){
    return name;
  }
}
