package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TestDAO;
import tool.Action;

public class Test_delete2Action extends Action {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String student_no=request.getParameter("student_no");
            String subject_cd=request.getParameter("subject_cd");
            String no=request.getParameter("no");

            System.out.println(student_no);

            TestDAO dao=new TestDAO();
            int line=dao.student_delete(student_no, subject_cd, no);

            return "test_delete_comp.jsp";

        } catch (Exception e) {
            System.out.println("エラーshelf");
            e.printStackTrace();
            return "error.jsp";
        }
    }
}
