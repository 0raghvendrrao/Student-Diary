import java.util.Date;
public class Fee {
	float amount;
	String name;
	Date due;
	int delay;
	Fee(String nam,float amt, Date due){
		name = nam;
		amount = amt;
		this.due = due;
	}
}
