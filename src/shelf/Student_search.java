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

@WebServlet(urlPatterns={"/shelf/student_search"})
public class Student_search extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

		try {
			String ent_year=request.getParameter("ent_year");
			String class_num=request.getParameter("class_num");
			String attend=request.getParameter("attend");
			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.Student_search(ent_year,class_num,attend);
			request.setAttribute("student", list);
			request.getRequestDispatcher("student_list.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラーshelf");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
}

