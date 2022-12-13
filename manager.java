package medical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class manager {

	private List<staff> staffs;
	
	public manager() {
		this.staffs = new ArrayList<>();
	}
	
	public static void addStaff(staff staff) {
		this.staffs.add(staff);
	}
	
	public List<staff> searchStaffByName(String name){
		return (List<staff>) this.staffs.stream().filter(o -> o.getName().
				contains(name)).collect(Collectors.toList());
	}
	
	public void showListInforStaff() {
		this.staffs.forEach(o -> System.out.println(o.toString()));
	}
}
