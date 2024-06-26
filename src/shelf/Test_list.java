package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Test;
import dao.TestDAO;

@WebServlet(urlPatterns={"/shelf/shelf"})
public class Test_list extends HttpServlet {

	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
		try {
			TestDAO dao=new TestDAO();
			List<Test> list=dao.TestAll();

			request.setAttribute("list", list);

			request.getRequestDispatcher("test_list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
