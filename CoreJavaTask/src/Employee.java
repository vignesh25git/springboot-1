
public class Employee {
	
	private int empid;
	private String empname;
	private String empgender;
	private int empage;
	private int empsalary;
	private String dept;
	
	
	public Employee() {
		super();
	}


	public Employee(int empid, String empname, String empgender, int empage, int empsalary, String dept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empgender = empgender;
		this.empage = empage;
		this.empsalary = empsalary;
		this.dept = dept;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpgender() {
		return empgender;
	}

	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public int getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empgender=" + empgender + ", empage=" + empage
				+ ", empsalary=" + empsalary + "]";
	}
	
	
	
}
