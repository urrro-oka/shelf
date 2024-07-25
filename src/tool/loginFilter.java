package tool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/shelf/*") // `shelf` パス以下の全てのリクエストにフィルターを適用
public class loginFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(false);

        // ログインページおよびログインアクションのURIを設定
        String loginPageURI = req.getContextPath() + "/login_logout/login.jsp";
        String loginActionURI = req.getContextPath() + "/login_logout/Login.action";
        String loginErrorURI = req.getContextPath() + "/login_logout/login-error.jsp";

        // デバッグ用ログ
        System.out.println("Request URI: " + req.getRequestURI());
        System.out.println("Login Page URI: " + loginPageURI);
        System.out.println("Login Action URI: " + loginActionURI);
        System.out.println("Login Error URI: " + loginErrorURI);

        // ログイン済みか、ログインページやログインアクションであればフィルターをスキップ
        boolean loggedIn = session != null && session.getAttribute("customer") != null;
        boolean loginPageRequest = req.getRequestURI().equals(loginPageURI);
        boolean loginActionRequest = req.getRequestURI().equals(loginActionURI);
        boolean loginErrorRequest = req.getRequestURI().equals(loginErrorURI);

        if (loggedIn || loginPageRequest || loginActionRequest || loginErrorRequest) {
            chain.doFilter(request, response);
        } else {
            res.sendRedirect(loginPageURI); // ログインページにリダイレクト
        }
    }

    public void destroy() {}
}

