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
		<c:param name="side">　　<a href="Test_entry.action">成績登録</a><br></c:param>
	<c:param name="content">
<form action="Test_list.action">
    <h2 class="toptitle">成績削除</h2>
    <p>削除が完了しました</p>
    <input class="btn" type="submit" value = "成績参照"><br>
    <a href="#" onclick="history.back()">戻る</a>
</form>

</c:param>
</c:import>