import java.util.Date;
public class Achievement {
	private String name;
	private int rank;
	private String type;
	private Date date;
	private String proof;
	private boolean approved;
	private Faculty approvedBy;
	Achievement(String name, int rank, String type, String proof,Date date){
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
