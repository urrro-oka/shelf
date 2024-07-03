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
				"SELECT subject.name,student.ent_year,test.class_num,Student_no,student.name,point,"
				+ "COALESCE(cast(("
				+ "select point from test where no='2' "
				+ "AND subject_cd=? "
				+ "AND ent_year=? "
				+ "AND test.class_num=? "
				+ "AND STUDENT_NO=STUDENT.no) AS VARCHAR),'-') AS point2 "
				+ "FROM test "
				+ "join student "
				+ "on student.no=test.Student_no "
				+ "join subject "
				+ "on test.subject_cd=subject.cd "
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
			p.setSubject_name(rs.getString("subject.name"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}
	public List<Test> Test_search_student(Test test) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select student.no,student.name ,subject.name,subject.cd,test.no,point "
				+ "from test "
				+ "join subject "
				+ "ON subject.cd = test.subject_cd "
				+ "join student "
				+ "on student.no=test.student_no "
				+ "WHERE student.no=? "
				+ "ORDER BY subject.cd,test.no");
		st.setString(1,test.getStudent_no());

		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			p.setStudent_name(rs.getString("student.name"));
			p.setSubject_name(rs.getString("subject.name"));
			p.setSubject_cd(rs.getString("subject.cd"));
			p.setNo(rs.getInt("test.no"));
			p.setPoint1(rs.getInt("point"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}

	public List<Test> Test_Ave(String ent_year,Test test) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select "
				+ "(SELECT AVG(point) FROM test where no =1 ) AS 一回目,"
				+ "(SELECT AVG(point) FROM test WHERE no=2 ) AS 二回目 "
				+ "FROM test "
				+ "where subject_cd='A02'");
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
			p.setSubject_name(rs.getString("subject.name"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}
	}