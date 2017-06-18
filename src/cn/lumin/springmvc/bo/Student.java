package cn.lumin.springmvc.bo;

public class Student {

	private String stuId;
	private String stuName;
	private Integer stuAge;
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	public Student(String stuId, String stuName, Integer stuAge)
	{
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	public Student()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
