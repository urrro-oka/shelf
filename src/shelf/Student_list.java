package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;

@WebServlet(urlPatterns={"/shelf/student_list"})
public class Student_list extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

		try {
			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.StudentAll();
			request.setAttribute("student", list);
			request.getRequestDispatcher("student_list.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		}
	}
}
