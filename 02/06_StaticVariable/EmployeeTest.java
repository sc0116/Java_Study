package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		System.out.println("�ʱ�ȭ�� �ø��� �ѹ��� " + Employee.getSerialNum() + "�Դϴ�.");
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("Lee");
		
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId() + "�Դϴ�.");
		
		Employee employeeShin = new Employee();
		employeeShin.setEmployeeName("Shin");
		
		System.out.println(employeeShin.getEmployeeName() + "���� ����� " + employeeShin.getEmployeeId() + "�Դϴ�.");
	}

}
