package medical;

public class nurse extends staff {
	private int overTime;
	private int basicSalary;
	private int salary;
	
	public nurse() {
		super();
	}
	
	public nurse(int overTime) {
		super();
		this.overTime = overTime;
	}
	
	public int getOverTime() {
		return overTime;
	}
	
	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	
	@Override
	public int pay() {
		this.salary = this.basicSalary + this.overTime*10000;
		return this.salary;
	}
}
