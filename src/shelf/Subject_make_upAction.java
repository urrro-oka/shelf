package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;
import tool.Action;


public class Subject_make_upAction extends Action {

    public String execute(HttpServletRequest request, HttpServletResponse response)
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
			return "subject_make_up_comp.jsp";


        } catch (Exception e) {
            // その他の例外に対するエラーハンドリング
            System.out.println("データベース更新エラー");
            e.printStackTrace();
            return "error.jsp";
        }
    }
}
