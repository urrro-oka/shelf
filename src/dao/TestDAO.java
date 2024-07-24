package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;
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
				"SELECT subject.name,subject.cd,student.ent_year,test.class_num,Student_no,student.name,point, "
				+ "COALESCE(cast(("
				+ "select point from test where no='2' "
				+ "AND STUDENT_NO=STUDENT.no AND test.subject_cd=subject.cd) AS VARCHAR),'-') AS point2 "
				+ "FROM test "
				+ "join student "
				+ "on student.no=test.Student_no "
				+ "join subject "
				+ "on test.subject_cd=subject.cd "
				+ "WHERE "
				+ " test.No = '1'"
				+ "ORDER BY subject.cd ,student_no");
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
			p.setSubject_cd(rs.getString("subject.cd"));
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
				"SELECT subject.name,subject.cd,student.ent_year,test.class_num,Student_no,student.name,point,"
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
				+ "AND test.No = '1'"
				+ "ORDER BY student_no");
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
			p.setSubject_cd(rs.getString("subject.cd"));
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
				"select student.no,student.name ,subject.name,test.class_num,subject.cd,test.no,point, "
				+ "subject.make_up "
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
			p.setClass_num(rs.getString("test.class_num"));
			p.setStudent_no(rs.getString("student.no"));
			p.setSubject_cd(rs.getString("subject.cd"));
			p.setNo(rs.getInt("test.no"));
			p.setPoint1(rs.getInt("point"));
			p.setMake_up(rs.getInt("make_up"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}

	public List<Test> Test_Avg(String subject_cd,String ent_year) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"select "
				+ "(SELECT AVG(point) FROM test join student on test.student_no  = student.no where test.no =1 AND subject_cd=? AND ent_year=?) AS 一回目,"
				+ "(SELECT AVG(point) FROM test join student on test.student_no  = student.no WHERE test.no =2 AND subject_cd=? AND ent_year=?) AS 二回目 "
				+ "FROM test ");
		st.setString(1,subject_cd);
		st.setString(2,ent_year);
		st.setString(3,subject_cd);
		st.setString(4,ent_year);
		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			System.out.println(rs.getInt("一回目"));
			p.setAvg_point1(rs.getInt("一回目"));
			p.setAvg_point2(rs.getInt("二回目"));
			list.add(p);
		}


			st.close();
			con.close();

			return list;
		}

	public List<Test> Test_Prymary(int num, String no, String cd) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT NO 回数 FROM TEST WHERE NO=? "
				+ "and student_no=? "
				+ "and subject_cd=? ");
		st.setInt(1,num);
		st.setString(2,no);
		st.setString(3,cd);

		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			p.setNo(rs.getInt("回数"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}
	public List<Test> Test_Prymary2(String no, String cd) throws Exception {
		List<Test> list=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT NO 回数 FROM TEST WHERE NO=1 "
				+ "and student_no=? "
				+ "and subject_cd=? ");
		st.setString(1,no);
		st.setString(2,cd);

		ResultSet rs = st.executeQuery();


		while(rs.next()){
			Test p = new Test();
			p.setNo(rs.getInt("回数"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}

	public int Test_insert(Test Test) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"insert into Test(student_no, class_num, subject_cd, no, point, school_cd) values(?,?,?,?,?, 'oom')");

		st.setString(1,Test.getStudent_no()); //学生番号
		st.setString(2,Test.getClass_num()); //クラス
		st.setString(3,Test.getSubject_cd()); //科目名
		st.setInt(4,Test.getNo()); //回数
		st.setInt(5,Test.getPoint1()); //点数

		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;
	}

	public int Test_Delete(String student_no,String subject_cd) throws Exception {
		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement(
				"delete test where student_no = ? AND subject_cd = ?");

		st.setString(1, student_no);
		st.setString(2, subject_cd);

		int line=st.executeUpdate();


		st.close();
		con.close();
		return line;

	}


	public List<Subject> SubjectAll() throws Exception {
		List<Subject> line=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st=con.prepareStatement(
				"select * from subject ORDER BY cd") ;
		ResultSet rs = st.executeQuery();

		while(rs.next()) {
			Subject p = new Subject();
			p.setSchool(rs.getString("school_cd"));
			p.setCd(rs.getString("cd"));
			p.setName(rs.getString("name"));
			line.add(p);

		}
		st.close();
		con.close();

		return line;
	}


	public int student_delete(String student_no, String subject_cd, String no) throws Exception {
		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement(
				"delete TEST where student_no = ? and subject_cd = ? and no =?");
		st.setString(1, student_no);
		st.setString(2, subject_cd);
		st.setString(3, no);

		int line=st.executeUpdate();

		st.close();
		con.close();
		return line;
		}

	public int Test_Update(String student_no,String subject_cd,String no ,String point) throws Exception {
		Connection con=getConnection();
		PreparedStatement st=con.prepareStatement(
				"UPDATE test SET point=? "
				+ "WHERE SUBJECT_CD = ? "
				+ "AND student_no=? "
				+ "AND NO=?;");
		st.setString(1, point);
		st.setString(2, subject_cd);
		st.setString(3, student_no);
		st.setString(4, no);

		int line=st.executeUpdate();


		st.close();
		con.close();
		return line;

	}


	}