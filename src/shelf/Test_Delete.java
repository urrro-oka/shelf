package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TestDAO;

@WebServlet(urlPatterns={"/shelf/test_delete"})
public class Test_Delete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String student_no=request.getParameter("student_no");
            String subject_cd=request.getParameter("subject_cd");

            System.out.println(student_no);
            System.out.println(student_no);

            TestDAO dao=new TestDAO();
            int line=dao.Test_Delete(student_no,subject_cd);


            request.getRequestDispatcher("test_delete_comp.jsp").forward(request, response);

        } catch (Exception e) {
            System.out.println("エラーshelf");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            e.printStackTrace();
        }
    }
}
