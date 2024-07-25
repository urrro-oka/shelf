package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import tool.Action;
public class Student_deleteAction extends Action{
	public String execute (
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {

			try {
				String no=request.getParameter("no");

				StudentDAO dao=new StudentDAO();
				int line=dao.Student_Delete(no);
				return "student_delete_comp.jsp";

			} catch (Exception e) {
				System.out.println("エラーshelf");
				e.printStackTrace();
				return "error.jsp";
			}
		}
}

