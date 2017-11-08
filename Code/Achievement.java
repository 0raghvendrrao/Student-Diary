import java.util.Date;
public class Achievement {
	 String name;
	 Student std;
	 int rank;
	 String type;
	 Date date;
	 String proof;
	 boolean approved;
	 Faculty approvedBy;
	Achievement(Student std,String name, int rank, String type, String proof,Date date){
		this.std = std;
		this.name = name;
		this.rank = rank;
		this.type = type;
		this.proof = proof;
		this.date = date;
		this.approved = false;
	}
	public void approve(Faculty fac){
		this.approved = true;
		this.approvedBy = fac;
	}
	public String toString(){
		return String.format("%29s|%29s|%29s|%29s",this.name,this.type,this.date,this.approvedBy.name);
	}
}
