package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import bean.Subject;
import dao.StudentDAO;
import dao.SubjectDAO;
import tool.Action;

public class Test_entryAction extends Action {

    public String execute(HttpServletRequest request, HttpServletResponse response)
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



			return "test_entry.jsp";

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
			return "error.jsp";
		}
    }
}

