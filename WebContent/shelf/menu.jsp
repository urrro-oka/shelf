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
    	<a href="Student_list.action" class="menubox">学生一覧</a>
    	<a href="Test_list.action" class="menubox">成績一覧</a>
		<a href="Subject_list.action" class="menubox">科目一覧</a>


</c:param>
</c:import>