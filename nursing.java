package medical;

public class nursing extends staff{

	private int extraPatiens;
	private int basicSalary;
	private int salary;
	
	public nursing() {
		super();
	}
	
	public nursing(int extraPtiens) {
		super();
		this.extraPatiens = extraPatiens;
	}
	
	public int getExtraPatiens() {
		return extraPatiens;
	}
	
	public void setExtraPatiens(int extraPatiens) {
		this.extraPatiens = extraPatiens;
	}
	
	public int pay() {
		this.salary = this.basicSalary + this.extraPatiens * 300000;
		return this.salary;
	}
}
