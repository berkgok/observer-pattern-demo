package DAO;
import java.util.ArrayList;
import java.util.List;

import domain.IDepartment;

public class DepartmentDAO {
	
	private List<IDepartment> departments;
	
	public DepartmentDAO() {
		this.departments = new ArrayList<IDepartment>();
	}

	public void addDepartment(IDepartment department) {
		this.departments.add(department);
	}
	
	public void removeDepartment(IDepartment department) {
		this.departments.remove(department);
	}
	
	public List<IDepartment> getDepartments() {
		return this.departments;
	}
	
	public void showDepartments() {
		System.out.println("\nAvailable departments:");
		for (int i=0;i<departments.size();i++) {
			System.out.println(departments.get(i).toString());
		}
	}
	
}
