package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;
@WebServlet(urlPatterns={"/shelf/student_update"})
public class Student_update extends HttpServlet{
	public void doGet (
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {

			try {
				String no=request.getParameter("no");
				String name=request.getParameter("name");
				String class_num=request.getParameter("class_num");
				Boolean is_attend = Boolean.valueOf(request.getParameter("is_attend"));

				Student p = new Student();
				p.setNo(no);
				p.setName(name);
				p.setClass_num(class_num);
				p.setIs_attend(is_attend);

				System.out.println(p.getNo());

				StudentDAO dao=new StudentDAO();
				int line=dao.Student_Update(p);
				request.getRequestDispatcher("student_transfer_comp.jsp").forward(request, response);

			} catch (Exception e) {
				System.out.println("エラーshelf");
				request.getRequestDispatcher("error.jsp").forward(request, response);
				e.printStackTrace();
			}
		}
}
