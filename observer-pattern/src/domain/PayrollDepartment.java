package domain;

public class PayrollDepartment implements IDepartment {

	private final DepartmentType departmentType = DepartmentType.PAYROLL;
	
	@Override
	public void notifyMe() {
		System.out.println("	" + departmentType +" has been notified...");
	}

	@Override
	public String toString() {
		return "	Payroll Department [departmentType=" + departmentType + "]";
	}
	
}
