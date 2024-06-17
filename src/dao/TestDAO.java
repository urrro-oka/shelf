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
			p.setPoint(rs.getInt("point"));
			p.setClass_num(rs.getString("class_num"));
			list.add(p);
		}
		st.close();
		con.close();

		return list;
	}
}