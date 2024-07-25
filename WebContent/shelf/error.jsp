<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>エラー</title>
		<div id = "title">得点管理システム</div>

	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">

    <h1>予期せぬエラーが発生しました。</h1>
    <h1>メニュー画面に戻ります。</h1>
    <a href="manu.jsp">メニュー画面に戻ります。</a>
</c:param>
</c:import>