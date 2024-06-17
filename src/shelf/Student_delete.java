package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
@WebServlet(urlPatterns={"/shelf/student_delete"})
public class Student_delete extends HttpServlet{
	public void doGet (
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {

			try {
				String no=request.getParameter("no");

				StudentDAO dao=new StudentDAO();
				int line=dao.Student_Delete(no);
				request.getRequestDispatcher("student_delete_comp.jsp").forward(request, response);

			} catch (Exception e) {
				System.out.println("エラーshelf");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				e.printStackTrace();
			}
		}
}
