<%-- 共通部分JSP --%>
    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

        <!DOCTYPE html>
        <html lang="ja">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="../css/style.css">
            <title>得点管理システム</title>
        </head>

        <body>
            <div id="title">得点管理システム</div>
            <h2 class="toptitle">成績新規登録</h2>
            <form action="test_insert">
                <p>
                    <label>入学年度</label>
                    <select name="ent_year" required>
                        <option value="">--------</option>
                        <option value="2015">2015</option>
                        <option value="2016">2016</option>
                        <option value="2017">2017</option>
                        <option value="2018">2018</option>
                        <option value="2019">2019</option>
                        <option value="2020">2020</option>
                        <option value="2021">2021</option>
                        <option value="2022">2022</option>
                        <option value="2023">2023</option>
                        <option value="2024">2024</option>
                    </select>
                </p>

                <p>
                    <label>学生番号</label>
                    <select name="student_no" required>
                        <option value="">--------</option>
                         <option value="100">100</option>
                          <option value="101">101</option>
                           <option value="102">102</option>
                    </select>
                </p>

                <p>
                    <label>科目</label>
                    <select name="subject_cd" required>
                        <option value="">--------</option>
                        <option value="A02">国語</option>
                        <option value="B02">数学</option>
                        <option value="C02">理科</option>
                        <option value="D02">論理</option>
                    </select>
                </p>

                <p>
                    <label>回数</label>
                    <select name="no">
                        <option value="1">1</option>
                        <option value="2">2</option>
                    </select>
                </p>

                <p>
                    <label>得点</label>
                    <input type="text" name="point" max="3" required placeholder="得点を入力してください"></input>
                </p>

                <input class="btn" type="submit" value="登録">
                <p>
                    <a href="" onclick="history.back()">戻る</a>
                </p>
            </form>
        </body>

        </html>
