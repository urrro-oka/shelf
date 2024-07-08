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

    <h2 class="toptitle">メインメニュー</h2>
    	<a href="student_list" class="menubox">学生一覧</a>
    	<a href="test_list" class="menubox">成績一覧</a>
		<a href="subject_list" class="menubox">科目一覧</a>


</c:param>
</c:import>