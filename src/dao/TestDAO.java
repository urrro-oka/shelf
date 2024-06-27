package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Test;

public class TestDAO extends DAO {

	/**
	 * Student表
	 * @return list<Product>
	 * @throws Exception
	 */
	public List<Test> TestAll() throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select * from test");
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			p.setStudent_no(rs.getString("student_no"));
			p.setSubject_cd(rs.getString("subject_cd"));
			p.setSchool_cd(rs.getString("school_cd"));
			p.setNo(rs.getInt("no"));
			p.setPoint1(rs.getInt("point"));
			p.setClass_num(rs.getString("class_num"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}

	public List<Test> Test_search_subject(String ent_year,Test test) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT student.ent_year,test.class_num,Student_no,student.name,point,"
				+ "COALESCE(cast(("
				+ "select point from test where no='2' "
				+ "AND subject_cd=? "
				+ "AND ent_year=? "
				+ "AND test.class_num=?) AS VARCHAR),'-') AS point2 "
				+ "FROM test "
				+ "join student "
				+ "on student.no=test.Student_no "
				+ "WHERE subject_cd=? "
				+ "AND ent_year=? "
				+ "AND test.class_num=? "
				+ "AND test.No = '1'");
		st.setString(1,test.getSubject_cd());
		st.setString(2,ent_year);
		st.setString(3,test.getClass_num());
		st.setString(4,test.getSubject_cd());
		st.setString(5,ent_year);
		st.setString(6,test.getClass_num());
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			p.setEnt_year(rs.getInt("student.ent_year"));
			p.setClass_num(rs.getString("test.class_num"));
			p.setStudent_no(rs.getString("Student_no"));
			p.setStudent_name(rs.getString("student.name"));
			p.setPoint1(rs.getInt("point"));
			p.setPoint2(rs.getString("point2"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}
	}