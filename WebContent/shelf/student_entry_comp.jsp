<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>-学生新規登録完了-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
<form action="Student_list.action">
    <h2 class="toptitle">学生情報登録</h2>
    <p>登録が完了しました</p>
    <input class="btn" type="submit" value = "学生一覧"><br>
    <a class="linkhover" href="#" onclick="history.back()">戻る</a><br>

</form>

</c:param>
</c:import>
<%---base.jsp使えてない ---%>
<%---イベント分からない ---%>
