/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical;

/**
 *
 * @author Emilia
 */
public class nurse extends Staff{
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
	
	public int pay() {
		this.salary = this.basicSalary + this.overTime*10000;
		return this.salary;
	}
}
    
