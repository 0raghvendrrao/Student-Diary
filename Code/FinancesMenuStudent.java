import java.io.*;
import java.util.*;

public class FinancesMenuStudent
{
        public static void FinancesMenu (Student s) throws Exception
        {
                while(true)
                {
                        System.out.println("1. Print Details\n2. Exit");
                        Scanner sc = new Scanner(System.in);

                        int ch = sc.nextInt();
                        switch(ch)
                        {
                                case 1:
                                        s.f.printDetails();
                                        break;

                                case 2:
                                        return;

                                default:
                                        break;
                        }
                }
        }
}
