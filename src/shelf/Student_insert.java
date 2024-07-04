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

@WebServlet(urlPatterns={"/shelf/student_insert"})
public class Student_insert extends HttpServlet {

	public void doGet (
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
				request.getRequestDispatcher("student_entry_comp.jsp").forward(request, response);
			}
			else{
				request.getRequestDispatcher("student_entry2.jsp").forward(request, response);
			}
		} catch (Exception e) {
			System.out.println("エラーshelf");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
}

