package client;
import java.util.Date;

import DAO.DepartmentDAO;
import DAO.EmployeeDAO;
import domain.DepartmentType;
import domain.Employee;
import domain.HRDepartment;
import domain.IDepartment;
import domain.PayrollDepartment;
import observable.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {

		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.generateEmployeeBase();
		empDAO.showEmployees();
		
		DepartmentDAO depDAO = new DepartmentDAO();
		IDepartment hr = new HRDepartment();
		IDepartment payroll = new PayrollDepartment();
		depDAO.addDepartment(hr);
		depDAO.addDepartment(payroll);
		depDAO.showDepartments();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem(empDAO, depDAO);
		
		ems.hireEmployee(new Employee("Samet", new Date(), DepartmentType.MANAGER));
		
		empDAO.showEmployees();
		
		ems.fireEmployee(9);
		ems.fireEmployee(2);
		
		empDAO.showEmployees();
	}

}
