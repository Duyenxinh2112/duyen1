/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medical;

import java.util.Scanner;

/**
 *
 * @author Emilia
 */

    /**
     * @param args the command line arguments
     */
   public class Staff {
	
	public abstract class staff{
		private String name, birthday, phoneNumber, email;
		private int age;
		protected int salary, basicSalary;
		Scanner scan = new Scanner(System.in);
		
		public staff() {
			super();
		}
		
		public staff(String name, String birthday, String phoneNumber, String email, int age, int salary, int basicSalary) {
			super();
			this.name = name;
			this.birthday = birthday;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.age = age;
			this.salary = salary;
			this.basicSalary = basicSalary;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName() {
			this.name = name;
		}
		
		public String getBirthday() {
			return birthday;
		}
		
		public void setBirthday() {
			this.birthday = birthday;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber() {
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail() {
			this.email = email;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getSalary() {
			return salary;
		}
		
		public void setSalary() {
			this.salary = salary;
		}
		
		public int getBasicSalary() {
			return basicSalary;
		}
		
		public void setBasicSalary() {
			this.basicSalary = basicSalary;
		}
                public abstract void tinhLuong();
		
	}
}
	
    
