package medical;

public class doctor extends staff {
	
	private int onCallDay;
	private int basicSalary;
	private int salary;
	
	public doctor() {
		super();
	}
	
	public doctor(int onCallDay) {
		super();
		this.onCallDay = onCallDay;
	}
	
	public int getOnCallDay() {
		return onCallDay;
	}
	
	public void setOnCallDay(int onCallDay) {
		this.onCallDay = onCallDay;
	}
	
	@Override
	public int pay() {
		this.salary = this.basicSalary + this.onCallDay * 200000;
		return this.salary;
	}
}
