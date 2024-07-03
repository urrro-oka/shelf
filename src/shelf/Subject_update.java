package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;

@WebServlet(urlPatterns={"/shelf/subject_update"})
public class Subject_update extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	try {
			String cd=request.getParameter("cd");
			String name=request.getParameter("name");

			Subject p = new Subject();
			p.setCd(cd);
			p.setName(name);

			System.out.println(cd);
			System.out.println(name);

            SubjectDAO dao=new SubjectDAO();
			int line=dao.Subject_Update(p);
			request.getRequestDispatcher("subject_update_comp.jsp").forward(request, response);


        } catch (Exception e) {
            // その他の例外に対するエラーハンドリング
            System.out.println("データベース更新エラー");
            e.printStackTrace();
            request.getRequestDispatcher("subject_update_comp.jsp").forward(request, response);
        }
    }
}
