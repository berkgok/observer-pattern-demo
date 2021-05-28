package DAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.DepartmentType;
import domain.Employee;

public class EmployeeDAO {
	
	private List<Employee> employees;
	private int nextAvailableID;

	public EmployeeDAO() {
		this.employees = new ArrayList<Employee>();
		this.nextAvailableID = 0;
	}
	
	public void generateEmployeeBase() {
		Employee emp1 = new Employee("Ali", new Date(), DepartmentType.MANAGER);
		emp1.setId(nextAvailableID++);
		Employee emp2 = new Employee("Veli", new Date(), DepartmentType.HR);
		emp2.setId(nextAvailableID++);
		Employee emp3 = new Employee("Gizem", new Date(), DepartmentType.HR);
		emp3.setId(nextAvailableID++);
		Employee emp4 = new Employee("Yunus", new Date(), DepartmentType.PAYROLL);
		emp4.setId(nextAvailableID++);
		Employee emp5 = new Employee("Selma", new Date(), DepartmentType.PAYROLL);
		emp5.setId(nextAvailableID++);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}
	
	private Employee getEmployeeById(int id) throws Exception {
		for(int i=0;i<employees.size();i++) {
			if (employees.get(i).getId() == id) {
				return employees.get(i);
			}
		}
		throw new IOException("\nThere is no employee with the id: "+Integer.toString(id));
	}
	
	public void addEmployee(Employee employee) {
		employee.setId(nextAvailableID++);
		employees.add(employee);
	}
	
	public boolean removeEmployee(int id) {
		try {
			Employee e = getEmployeeById(id);
			employees.remove(e);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
			
	}
	
	public void showEmployees() {
		System.out.println("\nEmployee List: ");
		for (int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i).toString());
		}
	}
}
