import java.io.*;
import java.util.*;

public class AttendanceMenuStudent
{
        public static void AttendanceMenu (String code, Student s) throws ProfileNotReviewedException, CourseNotFoundException, Exception
        {
                Course c = s.searchCourse(code);

                while(true)
                {
                        System.out.println("1. View Attendance\n2. Check Minimum\n3. Exit");
                        Scanner sc = new Scanner(System.in);

                        int ch = sc.nextInt();
                        switch(ch)
                        {
                                case 1:
                                        s.printCourse(c);
                                        System.out.println(s.getAttendance(c));
                                        break;

                                case 2:
                                        s.printCourse(c);
                                        System.out.println(s.checkMinAttendance(c));
                                        break;

                                case 3:
                                        return;

                                default:
                                        break;
                        }
                }
        }
}
