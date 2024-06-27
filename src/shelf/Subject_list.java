package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;

@WebServlet(urlPatterns={"/shelf/subject_list"})
public class Subject_list extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

		try {
			SubjectDAO dao=new SubjectDAO();
			List<Subject> list=dao.SubjectAll();
			request.setAttribute("subject", list);
			request.getRequestDispatcher("subject_list.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		}
	}
}
