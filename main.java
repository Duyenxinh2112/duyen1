package medical;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int totalSalary = 0;
		Scanner scan = new Scanner(System.in);
		staff staff = new staff();
		while(true) {
			System.out.println("Enter 1: To insert staff:");
			System.out.println("Enter 2: To search staff by name: ");
			System.out.println("Enter 3: To show information staffs");
			System.out.println("Enter 4: To exit");
			String line = scan.nextLine();
			switch(line) {
			case "1": {
				System.out.println("Enter a: to insert Doctor");
				System.out.println("Enter b: to insert Nurse");
				System.out.println("Enter c: to insert Nursing");
				String type = scan.nextLine();
				switch(type) {
				case "a": {
					System.out.print("Enter name: ");
					String name = scan.nextLine();
					System.out.print("\nEnter age: ");
					int age = scan.nextInt();
					System.out.print("\nEnter number phone: ");
					String numberPhone = scan.nextLine();
					System.out.print("\nEnter email: ");
					String email = scan.nextLine();
					staff doctor = new doctor();
					manager.addStaff(doctor);
					System.out.println(doctor.toString());
					break;
				}
				case "b": {
				
					System.out.print("Enter name: ");
					String name = scan.nextLine();
					System.out.print("\nEnter age: ");
					int age = scan.nextInt();
					System.out.print("\nEnter number phone: ");
					String numberPhone = scan.nextLine();
					System.out.print("\nEnter email: ");
					String email = scan.nextLine();
					staff nurse = new nurse();
					manager.addStaff(nurse);
					System.out.println(staff.toString());
					break;
					}
				
				case "c": {
					System.out.print("Enter name: ");
					String name = scan.nextLine();
					System.out.print("\nEnter age: ");
					int age = scan.nextInt();
					System.out.print("\nEnter number phone: ");
					String numberPhone = scan.nextLine();
					System.out.print("\nEnter email: ");
					String email = scan.nextLine();
					staff nursing = new nursing();
					manager.addStaff(nursing);
					System.out.println(staff.toString());
					break;
				}
				
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}
			case "2": {
				System.out.print("enter name to search: ");
				String name = scan.nextLine();
				manager.searchStaffByName(name).forEach(staff -> {System.out.println(staff.toString())});
				break;
			}
			case "3": {
				manager.showListInforStaff();
				break;
			}
			case "4":{
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}
		}
		
		
			


	}
}


