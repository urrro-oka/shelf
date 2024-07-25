package login_logout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;

public class LoginAction extends Action {
    public String execute(
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();

        String login = request.getParameter("id");
        String password = request.getParameter("password");

        // DAOから顧客情報を取得
        CustomerDAO dao = new CustomerDAO();
        Customer customer = dao.search(login, password);

        if (customer != null) {
            // ログイン成功
            session.setAttribute("customer", customer);
            response.sendRedirect("../shelf/menu.jsp"); // メニューページにリダイレクト
            return null; // メソッドがリダイレクトを行ったためnullを返す
        } else {
            // ログイン失敗
            request.setAttribute("errorMessage", "ログインIDまたはパスワードが正しくありません。");
            response.sendRedirect("login-error.jsp"); // ログインページにエラーメッセージを表示してリダイレクト
            return null; // メソッドがリダイレクトを行ったためnullを返す
        }
    }
}
