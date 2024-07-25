package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;
import tool.Action;

public class Student_updateAction extends Action{
	public String execute (
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
				return "student_transfer_comp.jsp";

			} catch (Exception e) {
				System.out.println("エラーshelf");
				e.printStackTrace();
				return "error.jsp";
			}
		}
}

