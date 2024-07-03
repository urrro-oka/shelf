package shelf;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Subject;
import dao.SubjectDAO;

@WebServlet(urlPatterns={"/shelf/subject_insert"})
public class Subject_insert extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        try {
            // パラメータの取得
            String school = request.getParameter("school");
            String cd = request.getParameter("cd");
            String name = request.getParameter("name");


            // SubjectDAOのインスタンス作成
            SubjectDAO dao = new SubjectDAO();

            // Primaryキーに基づくチェック
            List<Subject> list = dao.Subject_Prymary(cd);
            System.out.println(list);
            if (list.size() != 1) {
                // 新しいSubjectオブジェクトの作成
                Subject p = new Subject();
                p.setSchool(school);
                p.setCd(cd);
                p.setName(name);

                // データベースにSubjectを挿入
                int line = dao.filter(p); // insertメソッドを使用すると仮定

                // 挿入成功時のフォワード先
                request.getRequestDispatcher("subject_entry_comp.jsp").forward(request, response);
            }else{
            	request.getRequestDispatcher("subject_entry2.jsp").forward(request, response);
            }
        } catch (Exception e) {
            // エラーハンドリング
            System.out.println("エラーshelf");
            e.printStackTrace();
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}

