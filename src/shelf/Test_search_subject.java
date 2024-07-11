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

@WebServlet(urlPatterns={"/shelf/test_search_subject"})
public class Test_search_subject extends HttpServlet {

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

			String ent_year=request.getParameter("ent_year");
			String class_num=request.getParameter("class_num");
			String subject=request.getParameter("subject");

			Test p =new Test();
			p.setClass_num(class_num);
			p.setSubject_cd(subject);

			System.out.println(ent_year);
			System.out.println(p.getClass_num());
			System.out.println(p.getSubject_cd());

			TestDAO dao=new TestDAO();
			List<Test> list=dao.Test_search_subject(ent_year,p);
			List<Test> list_AVG=dao.Test_Avg(subject);

			System.out.println(list);
			request.setAttribute("test", list);
			request.setAttribute("avg", list_AVG);
			request.getRequestDispatcher("test_list_subject.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラーshelf");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
}
