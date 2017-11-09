import java.util.*;
import java.io.*;

public class Course implements Serializable{
  String code;
  String name;
  double sgpa;
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
  public static void printCourses(){
    ArrayList<Branch> arr=BranchFH.get();
    for(Branch b: arr){
      for(Course c: b.branchSubjects){
        System.out.println(c.name);
      }
    }
  }
}
