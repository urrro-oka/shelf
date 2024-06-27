package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import bean.Subject;
import bean.Test;
import dao.StudentDAO;
import dao.SubjectDAO;
import dao.TestDAO;

@WebServlet(urlPatterns={"/shelf/test_list"})
public class Test_list extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
		try {
//			入学年度の呼び出し
			StudentDAO dao_year=new StudentDAO();
			List<Student> list_year=dao_year.Ent_Year();

//			クラス番号の呼び出し
			StudentDAO dao_class=new StudentDAO();
			List<Student> list_class=dao_class.Class_num();

//			科目の呼び出し
			SubjectDAO dao_sub=new SubjectDAO();
			List<Subject> list_sub=dao_sub.SubjectAll();

//			成績呼び出し
			TestDAO dao=new TestDAO();
			List<Test> list=dao.TestAll();

			request.setAttribute("test", list);
			request.setAttribute("subject", list_sub);
			request.setAttribute("year", list_year);
			request.setAttribute("num", list_class);

			request.getRequestDispatcher("test_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
