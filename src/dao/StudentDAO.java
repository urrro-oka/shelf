package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDAO extends DAO {

	/**
	 * Student表
	 * @return list<Student>
	 * @throws Exception
	 */
	public List<Student> StudentAll() throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from student ORDER BY No");
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Student p = new Student();
			p.setNo(rs.getString("no"));
			p.setName(rs.getString("name"));
			p.setEnt_year(rs.getInt("ent_year"));
			p.setClass_num(rs.getString("class_num"));
			p.setIs_attend(rs.getBoolean("is_attend"));
			p.setSchool_code(rs.getString("school_cd"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}

	public List<Student> Student_Prymary(String num) throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT NO 件数 FROM STUDENT WHERE NO=?");
		st.setString(1,num);
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Student p = new Student();
			p.setNo(rs.getString("件数"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}


	/**
	 * Student表からキーワードを検索し、該当する商品のListを返却する。
	 * @param keyword
	 * @return list<Student>
	 * @throws Exception
	 */
	public List<Student> Student_search(String ent_year,String class_num,String attend) throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con = getConnection();
		Boolean is_attend = Boolean.valueOf(attend);
		if(is_attend){
			PreparedStatement st = con.prepareStatement(
					"select * from Student "
					+ "where (ENT_YEAR like ?) AND (CLASS_NUM like ?)AND(IS_ATTEND like ?) ORDER BY No");
			st.setString(1,"%"+ent_year+"%");
			st.setString(2,"%"+class_num+"%");
			st.setBoolean(3,is_attend);
			ResultSet rs = st.executeQuery();


			while(rs.next()){
				Student p = new Student();
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setEnt_year(rs.getInt("ent_year"));
				p.setClass_num(rs.getString("class_num"));
				p.setIs_attend(rs.getBoolean("Is_attend"));
				p.setSchool_code(rs.getString("school_cd"));
				list.add(p);
			}
			st.close();
			con.close();

			return list;
		}
		else{
			PreparedStatement st = con.prepareStatement(
					"select * from Student "
					+ "where (ENT_YEAR like ?) AND (CLASS_NUM like ?) ORDER BY No");
			st.setString(1,"%"+ent_year+"%");
			st.setString(2,"%"+class_num+"%");
			ResultSet rs = st.executeQuery();


			while(rs.next()){
				Student p = new Student();
				p.setNo(rs.getString("no"));
				p.setName(rs.getString("name"));
				p.setEnt_year(rs.getInt("ent_year"));
				p.setClass_num(rs.getString("class_num"));
				p.setIs_attend(rs.getBoolean("Is_attend"));
				p.setSchool_code(rs.getString("school_cd"));
				list.add(p);
			}
			st.close();
			con.close();

			return list;
		}
	}

	/**
	 * Student表へデータを挿入する。
	 * @param Student
	 * @return
	 * @throws Exception
	 */
	public int Student_insert(Student Student) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"insert into Student values(?,?,?,?,'True','oom')");
		st.setString(1,Student.getNo());
		st.setString(2,Student.getName());
		st.setInt(3,Student.getEnt_year());
		st.setString(4,Student.getClass_num());
		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;
	}

	public int Student_Update(Student Student) throws Exception {
		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement(
				"update student set name = ?, class_num = ?, is_attend = ? WHERE No = ?");
		st.setString(1, Student.getName());
		st.setString(2, Student.getClass_num());
		st.setBoolean(3, Student.getIs_attend());
		st.setString(4, Student.getNo());
		int line=st.executeUpdate();


		st.close();
		con.close();
		return line;

	}
	public int Student_Delete(String no) throws Exception {
		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement(
				"delete student where no = ?");

		st.setString(1, no);

		int line=st.executeUpdate();


		st.close();
		con.close();
		return line;

	}

	public List<Student> Ent_Year() throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select DISTINCT ent_year from student ORDER BY ent_year");
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Student p = new Student();
			p.setEnt_year(rs.getInt("ent_year"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}

	public List<Student> Class_num() throws Exception {
		List<Student> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select DISTINCT Class_num from class_num ORDER BY Class_num");
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Student p = new Student();
			p.setClass_num(rs.getString("class_num"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}

}