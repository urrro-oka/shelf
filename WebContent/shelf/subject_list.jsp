<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目一覧-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <h2 class="toptitle">科目管理</h2>
    <a href="subject_entry.jsp">新規登録</a>
    <table>
        <thead>
            <tr>
                <th>科目コード</th>
                <th>科目名</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach var="subject" items="${subject}">
            <tr>
                <td>${subject.cd}</td>
                <td>${subject.name}</td>
                <td>${subject.passed_point}</td>


                <td><a href="subject_make_up.jsp?cd=${subject.cd}&name=${subject.name}">合格ライン</a></td>
                <td><a href="subject_update.jsp?cd=${subject.cd}&name=${subject.name}">変更</a>・
               <a href="subject_delete.jsp?cd=${subject.cd}&name=${subject.name}">削除</a></td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</c:param>
</c:import>
