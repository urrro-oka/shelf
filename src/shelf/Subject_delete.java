package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SubjectDAO;

@WebServlet(urlPatterns={"/shelf/subject_delete"})
public class Subject_delete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String cd=request.getParameter("cd");

            SubjectDAO dao=new SubjectDAO();
            int line=dao.delete(cd);

            request.getRequestDispatcher("subject_delete_comp.jsp").forward(request, response);

        } catch (Exception e) {
            System.out.println("エラーshelf");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            e.printStackTrace();
        }
    }
}
