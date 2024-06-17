package bean;

public class Student implements java.io.Serializable {
	private String no;
	private String name;
	private int ent_year;
	private String class_num;
	private boolean is_attend;
	private String school_code;

	public String getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public int getEnt_year(){
		return ent_year;
	}
	public String getClass_num(){
		return class_num;
	}
	public boolean getIs_attend(){
		return is_attend;
	}
	public String getSchool_code(){
		return school_code;
	}


	public void setNo(String no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEnt_year(int ent_year){
		this.ent_year = ent_year;
	}
	public void setClass_num(String class_num){
		this.class_num = class_num;
	}
	public void setIs_attend(boolean is_attend){
		this.is_attend = is_attend;
	}
	public void setSchool_code(String school_code){
		this.school_code = school_code;
	}


}
