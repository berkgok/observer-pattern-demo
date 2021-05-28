package domain;
import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private Date hiredDate;
	private DepartmentType departmentType;

	public Employee(String name, Date hiredDate, DepartmentType departmentType) {
		this.name = name;
		this.hiredDate = hiredDate;
		this.departmentType = departmentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public DepartmentType getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(DepartmentType departmentType) {
		this.departmentType = departmentType;
	}

	@Override
	public String toString() {
		return "	Employee [id=" + id + ", name=" + name + ", hiredDate=" + hiredDate + ", departmentType="
				+ departmentType + "]";
	}
	
	
}
