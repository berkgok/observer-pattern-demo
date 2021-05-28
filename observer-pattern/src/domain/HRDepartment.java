package domain;

public class HRDepartment implements IDepartment {
	
	private final DepartmentType departmentType = DepartmentType.HR;
	
	@Override
	public void notifyMe() {
		System.out.println("	" + departmentType +" has been notified...");
	}

	@Override
	public String toString() {
		return "	HR Department [departmentType=" + departmentType + "]";
	}
	
}
