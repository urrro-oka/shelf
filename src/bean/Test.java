package bean;

public class Test implements java.io.Serializable {
	private String student_no;
	private String student_name;
	private String subject_cd;
	private String subject_name;
	private int ent_year;
	private String school_cd;
	private int no;
	private int point1;
	private String point2;
	private String class_num;

	public String getStudent_no(){
		return student_no;
	}
	public String getStudent_name(){
		return student_name;
	}
	public String getSubject_cd(){
		return subject_cd;
	}
	public String getSubject_name(){
		return subject_name;
	}
	public int getEnt_year(){
		return ent_year;
	}
	public String getSchool_cd(){
		return school_cd;
	}
	public int getNo(){
		return no;
	}
	public int getPoint1(){
		return point1;
	}
	public String getPoint2(){
		return point2;
	}
	public String getClass_num(){
		return class_num;
	}


	public void setStudent_no(String student_no){
		this.student_no = student_no;
	}
	public void setStudent_name(String student_name){
		this.student_name = student_name;
	}
	public void setSubject_cd(String subject_cd){
		this.subject_cd = subject_cd;
	}
	public void setSubject_name(String subject_name){
		this.subject_name = subject_name;
	}
	public void setEnt_year(int ent_year){
		this.ent_year = ent_year;
	}

	public void setSchool_cd(String school_cd){
		this.school_cd = school_cd;
	}
	public void setNo(int no){
		this.no = no;
	}
	public void setPoint1(int point1){
		this.point1 = point1;
	}
	public void setPoint2(String point2){
		this.point2 = point2;
	}
	public void setClass_num(String class_num){
		this.class_num = class_num;
	}


}

