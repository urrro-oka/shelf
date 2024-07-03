<%-- 共通部分JSP --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>科目管理画面</title>
</head>
<body>
    <h2>科目管理</h2>
    <a href="subject_entry.jsp">新規登録</a>
    <table>
        <thead>
            <tr>
                <th>科目コード</th>
                <th>科目名</th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="subject" items="${subject}">
            <tr>
                <td>${subject.cd}</td>
                <td>${subject.name}</td>


                <td><a href="subject_change.jsp">変更</a></td>
               <td><a href="subject_delete.jsp?cd=${subject.cd}&name=${subject.name}">削除</a></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
