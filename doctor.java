/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical;

/**
 *
 * @author Emilia
 */
public class doctor extends Staff{
    
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
	
	public int pay() {
		this.salary = this.basicSalary + this.onCallDay * 200000;
		return this.salary;
	}
    
}
