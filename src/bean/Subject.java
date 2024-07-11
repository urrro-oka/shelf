package bean;

public class Subject implements java.io.Serializable{
//	private
	private String school;
	private String cd;
	private String name;
	private int passed_point;

//	get
	public String getSchool() {
		return school;
	}

	public String getCd() {
		return cd;
	}

	public String getName() {
		return name;
	}
	public int getPassed_point() {
		return passed_point;
	}

//	set
	public void setSchool(String school){
		this.school = school;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setPassed_point(int passed_point){
		this.passed_point = passed_point;
	}
}

