package bean;

public class Subject implements java.io.Serializable{
//	private
	private String school;
	private String cd;
	private String name;

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
}
