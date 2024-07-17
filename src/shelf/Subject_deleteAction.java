package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SubjectDAO;
import tool.Action;


public class Subject_deleteAction extends Action {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String cd=request.getParameter("cd");

            SubjectDAO dao=new SubjectDAO();
            int line=dao.delete(cd);

			return "subject_delete_comp.jsp";

        } catch (Exception e) {
            System.out.println("エラーshelf");
            e.printStackTrace();
			return "error.jsp";
        }
    }
}
