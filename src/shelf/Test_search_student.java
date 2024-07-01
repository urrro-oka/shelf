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

@WebServlet(urlPatterns={"/shelf/test_search_student"})
public class Test_search_student extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

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

			request.setAttribute("subject", list_sub);
			request.setAttribute("year", list_year);
			request.setAttribute("num", list_class);

			String id=request.getParameter("student_id");

			Test p =new Test();
			p.setStudent_no(id);


			TestDAO dao=new TestDAO();
			List<Test> list=dao.Test_search_student(p);
			request.setAttribute("test", list);
			request.getRequestDispatcher("test_list_student.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラーshelf");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
}
