package shelf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Test;
import dao.TestDAO;
import tool.Action;


public class Test_updateAction extends Action {
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String student_no=request.getParameter("student_no");
            String subject_cd=request.getParameter("subject_cd");
            String student_name=request.getParameter("student_name");
            String subject_name=request.getParameter("subject_name");
            String class_num=request.getParameter("class_num");

            String no=request.getParameter("no");
            String point=request.getParameter("point");

            System.out.println(subject_cd);
            System.out.println(point);

            TestDAO dao=new TestDAO();
            int line=dao.Test_Update(student_no,subject_cd,no,point);

            if (line == 0){
    			Test p = new Test();
    			p.setStudent_name(student_name);
    			p.setStudent_no(student_no);
    			p.setSubject_name(subject_name);
    			p.setSubject_cd(subject_cd);
    			p.setClass_num(class_num);

    			request.setAttribute("student",p);
            	return "test_update2.jsp";
            }
            else{
            	return "test_update_comp.jsp";
            }

        } catch (Exception e) {
            System.out.println("エラーshelf");
            e.printStackTrace();
            return "error.jsp";
        }
    }
}
