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

    <h1 class="toptitle1">学生管理</h1>
    <div class = "iti">
    	<a href="Student_list.action" class="menubox">学生一覧</a>
    	<a href="student_entry.jsp" class="menubox1">学生の新規登録</a>
	</div>
	<h1 class="toptitle1">成績管理</h1>
	<div class = "iti">
    	<a href="Test_list.action" class="menubox">成績一覧</a>
		<a href="Test_entry.action" class="menubox1">成績の新規登録</a>
	</div>
	<h1 class="toptitle1">科目管理</h1>
	<div class = "iti">
		<a href="Subject_list.action" class="menubox">科目一覧</a>
		<a href="subject_entry.jsp" class="menubox1">科目の新規登録</a>
	</div>
</c:param>
</c:import>