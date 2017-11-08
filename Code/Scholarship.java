package Student;

import java.util.Scanner;

public class Scholarship extends Fee{
    
    int percentage;
    Scholarship(String name, int percentage) {
        super();

        super.name = name;
        this.percentage = percentage;
        super.amount = (percentage*(super.amount))/100;
        
    }

    
}
