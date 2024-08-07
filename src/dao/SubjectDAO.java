package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Subject;

public class SubjectDAO extends DAO{


//登録
public  int filter(Subject p)throws Exception{
	Connection con = getConnection();

	PreparedStatement st = con.prepareStatement(
			"insert into Subject(school_cd,cd,name) values('oom',?,?)");;
	st.setString(1,p.getCd());
	st.setString(2,p.getName());
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
public List<Subject> Subject_Prymary(String school) throws Exception {
	List<Subject> list=new ArrayList<>();

	Connection con = getConnection();

	PreparedStatement st = con.prepareStatement(
			"SELECT CD 件数 FROM subject WHERE cd=?");
	st.setString(1,school);
	ResultSet rs = st.executeQuery();


	while(rs.next()){
		Subject p = new Subject();
		p.setCd(rs.getString("件数"));
		list.add(p);
	}
	st.close();
	con.close();

	return list;
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
		p.setPassed_point(rs.getInt("make_up"));
		line.add(p);

	}
	st.close();
	con.close();

	return line;
}
public int Subject_Update(Subject subject) throws Exception {
	Connection con=getConnection();
	PreparedStatement st=con.prepareStatement(
			"update SUBJECT SET name = ? WHERE  cd = ? ");

	st.setString(1, subject.getName());
	st.setString(2, subject.getCd());
	int line=st.executeUpdate();

	st.close();
	con.close();
	return line;


}
public int Subject_Make_Up(Subject subject) throws Exception {
	Connection con=getConnection();
	PreparedStatement st=con.prepareStatement(
			"update SUBJECT SET make_up = ? WHERE  cd = ? ");

	st.setInt(1, subject.getPassed_point());
	st.setString(2, subject.getCd());
	int line=st.executeUpdate();

	st.close();
	con.close();
	return line;


}
}