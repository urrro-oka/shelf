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
    <h2 class="toptitle">学生情報変更</h2>
    <p>変更が完了しました</p>
    <input class="btn" type="submit" value="学生一覧">
</form>
</c:param>
</c:import>
