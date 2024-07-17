<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">

<c:param name="title">
			<title>科目情報削除完了</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <h2 class="toptitle">科目情報削除完了</h2>
    <p class="fontsize2">科目情報の削除が完了しました。</p>
</body>
<form action="Subject_list.action">
    <a href="#" onclick="history.back()">戻る</a><br>
    <input class="btnl" type="submit" value="科目一覧">
</form>
</c:param>
</c:import>