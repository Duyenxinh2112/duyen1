package medical;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class staff {
	
	public class Staff{
		private String name, birthday, phoneNumber, email;
		private int age;
		protected int salary, basicSalary;
		Scanner scan = new Scanner(System.in);
		
		public Staff() {
			super();
		}
		
		public Staff(String name, String birthday, String phoneNumber, String email, int age, int salary, int basicSalary) {
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
		
	}

	
	public int pay() {
		return 0;
	}


	public List<staff> getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public static Collector toList() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
