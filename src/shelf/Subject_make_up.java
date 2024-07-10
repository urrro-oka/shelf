package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;

@WebServlet(urlPatterns={"/shelf/subject_make_up"})
public class Subject_make_up extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	try {
			String cd=request.getParameter("cd");
			String name=request.getParameter("name");
			int passed_point = Integer.parseInt(request.getParameter("passed_point"));


			Subject p = new Subject();
			p.setCd(cd);
			p.setName(name);
			p.setPassed_point(passed_point);

			System.out.println(cd);
			System.out.println(name);

            SubjectDAO dao=new SubjectDAO();
			int line=dao.Subject_Make_Up(p);
			request.getRequestDispatcher("subject_make_up_comp.jsp").forward(request, response);


        } catch (Exception e) {
            // その他の例外に対するエラーハンドリング
            System.out.println("データベース更新エラー");
            e.printStackTrace();
            request.getRequestDispatcher("subject_mke_up_comp.jsp").forward(request, response);
        }
    }
}
