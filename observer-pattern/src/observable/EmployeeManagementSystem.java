package observable;

import DAO.DepartmentDAO;
import DAO.EmployeeDAO;
import domain.Employee;

public class EmployeeManagementSystem {
	
	private EmployeeDAO employeeDAO;
	private DepartmentDAO departmentDAO;
	
	public EmployeeManagementSystem(EmployeeDAO employeeDAO, DepartmentDAO departmentDAO) {
		this.employeeDAO = employeeDAO;
		this.departmentDAO = departmentDAO;
	}
	
	public void hireEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);
		System.out.println("\nNew employee has been added...\nSending notification to departments");
		notifyDepartments();
	}
	
	public void fireEmployee(int id) {
		if (employeeDAO.removeEmployee(id)) {
			System.out.println("\nAn employee has been fired...\nSending notification to departments");
			notifyDepartments();
		}
	}

	public void notifyDepartments() {
		System.out.println("\nAll available departments are getting notified...");
		for (int i=0;i<departmentDAO.getDepartments().size();i++) {
			departmentDAO.getDepartments().get(i).notifyMe();
		}
	}
}
