package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Test;
import dao.TestDAO;
import tool.Action;

public class Test_insertAction extends Action {

	public String execute (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException{

		try {
			String student_no=request.getParameter("student_no");
			String class_num=request.getParameter("class_num");
			String subject_cd=request.getParameter("subject_cd");
			int no=Integer.parseInt(request.getParameter("no"));
			int point=Integer.parseInt(request.getParameter("point"));
			System.out.println(student_no);
			TestDAO dao=new TestDAO();
			List<Test> list=dao.Test_Prymary(no, student_no, subject_cd);


			if(list.size() != 1){
				Test p = new Test();
				p.setStudent_no(student_no);
				p.setClass_num(class_num);
				p.setSubject_cd(subject_cd);
				p.setNo(no);
				p.setPoint1(point);

				int line=dao.Test_insert(p);
				return "test_entry_comp.jsp";
			}
			else{
				return "test_entry.jsp";
			}
		} catch (Exception e) {
			System.out.println("エラーshelf");
			e.printStackTrace();
			return "error.jsp";
		}
	}
}
