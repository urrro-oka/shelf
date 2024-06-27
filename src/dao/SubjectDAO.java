package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO{

//	一覧
	public List<Subject> SubjectAll() throws Exception {
		List<Subject> line=new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st=con.prepareStatement(
				"select * from subject") ;
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

//登録
public  int filter(Subject school)throws Exception{
	Connection con = getConnection();

	PreparedStatement st = con.prepareStatement(
			"insert into Subject(school,cd,name) values('oom',?,?)");;
	st.setString(1,school.getCd());
	st.setString(2,school.getName());
	int line = st.executeUpdate();

	st.close();
	con.close();

	return line ;
	}
//変更
public int save (Subject subject)throws Exception{
	Connection con = getConnection();
	PreparedStatement st = con.prepareStatement(
			"update subject SET name = ? where cd = ?");
    st.setString(1, subject.getName());
    st.setString(2, subject.getCd());
	int line=st.executeUpdate();


	st.close();
	con.close();
	return line;

	}

//削除
public int delete(String cd) throws Exception {
	Connection con=getConnection();
	PreparedStatement st=con.prepareStatement(
			"delete subject where cd = ?");
	st.setString(1, cd);

	int line=st.executeUpdate();

	st.close();
	con.close();
	return line;
	}

}