<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp"/>

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

    <table>
        <thead>
            <tr>
                <th>学生番号</th>
                <th>クラス</th>
                <th>科目</th>
                <th>回数</th>
                <th>得点</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="test" items="${test}">
                <tr>
                    <td>${test.student_no}</td>
                    <td>${test.class_num}</td>
                    <td>${test.subject_cd}</td>
                    <td>
                        <select>
                            <option value="1">1</option>
                            <option value="2">2</option>
                        </select>
                    </td>
                    <td>
                        <input type="text" name="point" max="3" required
                            placeholder="得点を入力してください">
                    </td>
                    <td>
                        <a href="test_insert">登録</a>
                    </td>
                    <td>
                        <a href="" onclick="history.back()">戻る</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
