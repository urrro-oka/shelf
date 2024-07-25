package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TestDAO;
import tool.Action;


public class Test_deleteAction extends Action {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String student_no=request.getParameter("student_no");
            String subject_cd=request.getParameter("subject_cd");

            System.out.println(student_no);
            System.out.println(student_no);

            TestDAO dao=new TestDAO();
            int line=dao.Test_Delete(student_no,subject_cd);


            return "test_delete_comp.jsp";

        } catch (Exception e) {
            System.out.println("エラーshelf");
            e.printStackTrace();
            return "error.jsp";
        }
    }
}
