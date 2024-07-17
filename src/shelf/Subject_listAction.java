package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;
import tool.Action;


public class Subject_listAction extends Action {

	public String execute (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

		try {
			SubjectDAO dao=new SubjectDAO();
			List<Subject> list=dao.SubjectAll();
			request.setAttribute("subject", list);
			return "subject_list.jsp";

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
			return "error.jsp";
		}
	}
}
