package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import dao.StudentDAO;
import tool.Action;


public class Student_searchAction extends Action {

	public String execute (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {

		try {

//			入学年度の呼び出し
			StudentDAO dao_year=new StudentDAO();
			List<Student> list_year=dao_year.Ent_Year();

//			クラス番号の呼び出し
			StudentDAO dao_class=new StudentDAO();
			List<Student> list_class=dao_class.Class_num();

			String ent_year=request.getParameter("ent_year");
			String class_num=request.getParameter("class_num");
			String attend=request.getParameter("attend");
			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.Student_search(ent_year,class_num,attend);
			request.setAttribute("student", list);
			request.setAttribute("list_year", list_year);
			request.setAttribute("list_class", list_class);
			return "student_list.jsp";

		} catch (Exception e) {
			System.out.println("エラーshelf");
			e.printStackTrace();
			return "error.jsp";
		}
	}
}

