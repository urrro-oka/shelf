<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目変更完了-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">


    <h2 class="toptitle">合格ライン登録完了</h2>
    <p>登録が完了しました</p>
    <a href="subject_list" onclick="history.back()">科目一覧</a><br>


</body>
</c:param>

</c:import>