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
			Boolean is_attend = Boolean.valueOf(attend);
			StudentDAO dao=new StudentDAO();

			request.setAttribute("ent_year", ent_year);
			request.setAttribute("class_num", class_num);
			request.setAttribute("attend", attend);
			request.setAttribute("list_year", list_year);
			request.setAttribute("list_class", list_class);

			System.out.println(attend);
			System.out.println(class_num);
			System.out.println(ent_year);

			if(ent_year==""&&class_num==""&&attend==null){
				List<Student> list=dao.StudentAll();
				request.setAttribute("student", list);
				return "student_list.jsp";
			}
			else if (is_attend){
				List<Student> list=dao.Student_search1(ent_year,class_num);
				request.setAttribute("student", list);
				return "student_list.jsp";
			}
			else{
				List<Student> list=dao.Student_search2(ent_year,class_num);
				request.setAttribute("student", list);
				return "student_list.jsp";
			}

		} catch (Exception e) {
			System.out.println("エラーshelf");
			e.printStackTrace();
			return "error.jsp";
		}
	}
}

