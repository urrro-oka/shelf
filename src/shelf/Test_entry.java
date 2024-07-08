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
import dao.StudentDAO;
import dao.SubjectDAO;

@WebServlet(urlPatterns = { "/shelf/test_entry" })
public class Test_entry extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	try {
//			TestDAO dao=new TestDAO();
//			List<Test> list=dao.TestAll();
//			request.setAttribute("test", list);

			StudentDAO stdao=new StudentDAO();
			List<Student> stlist=stdao.StudentAll();
			request.setAttribute("student", stlist);

			StudentDAO classdao=new StudentDAO();
			List<Student> classlist=classdao.Class_num();
			request.setAttribute("class", classlist);

			SubjectDAO sbdao=new SubjectDAO();
			List<Subject> subjectlist=sbdao.SubjectAll();
			request.setAttribute("subject", subjectlist);



			request.getRequestDispatcher("test_entry.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		}
    }
}

