<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>得点管理システム</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
<form action="student_list">
    <h2 class="toptitle">学生情報登録</h2>
    <p>登録が完了しました</p>
    <a href="#" onclick="history.back()">戻る</a><br>
    <input class="btn" type="submit" value = "学生一覧">
</form>

</c:param>
</c:import>
<%---base.jsp使えてない ---%>
<%---イベント分からない ---%>
