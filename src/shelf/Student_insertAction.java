package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;
import tool.Action;


public class Student_insertAction extends Action {

	public String execute (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException{

		try {
			String name=request.getParameter("name");
			String no=request.getParameter("no");
			int ent_year=Integer.parseInt(request.getParameter("ent_year"));
			String class_num=request.getParameter("class_num");

			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.Student_Prymary(no);


			if(list.size() != 1){
				Student p = new Student();
				p.setName(name);
				p.setNo(no);
				p.setEnt_year(ent_year);
				p.setClass_num(class_num);

				int line=dao.Student_insert(p);
				return "student_entry_comp.jsp";
			}
			else{
				return "student_entry2.jsp";
			}
		} catch (Exception e) {
			System.out.println("エラーshelf");
			e.printStackTrace();
			return "error.jsp";
		}
	}
}

