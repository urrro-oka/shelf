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
//			入学年度の呼び出し
			StudentDAO dao_year=new StudentDAO();
			List<Student> list_year=dao_year.Ent_Year();

//			クラス番号の呼び出し
			StudentDAO dao_class=new StudentDAO();
			List<Student> list_class=dao_class.Class_num();

			StudentDAO dao=new StudentDAO();
			List<Student> list=dao.StudentAll();
			request.setAttribute("list_year", list_year);
			request.setAttribute("list_class", list_class);
			request.setAttribute("student", list);
			request.getRequestDispatcher("student_list.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("エラー");
			e.printStackTrace();
		}
	}
}
