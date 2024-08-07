package login_logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tool.Action;

public class LogoutAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {
		try{
		HttpSession session= request.getSession();

			if (session.getAttribute("customer") != null){
				session.removeAttribute("customer");
				return "logout-out.jsp";
			}

			return "logout-error.jsp";
		} catch (Exception e) {
			System.out.println("ログアウトエラー");
			e.printStackTrace();
			return "../shelf/error.jsp";
		}
	}

}
