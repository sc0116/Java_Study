package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("초기화된 시리얼 넘버는 " + Employee.getSerialNum() + "입니다.");
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("Lee");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다.");
		
		Employee employeeShin = new Employee();
		employeeShin.setEmployeeName("Shin");
		
		System.out.println(employeeShin.getEmployeeName() + "님의 사번은 " + employeeShin.getEmployeeId() + "입니다.");
	}

}
