/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medical;

/**
 *
 * @author Emilia
 */
public class nursing extends Staff{
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
