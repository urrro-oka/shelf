<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目情報変更-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <% String cd = request.getParameter("cd"); %>
    <% String name = request.getParameter("name"); %>
		<h2 class="toptitle">科目情報変更</h2>

<form action="subject_update" method="get">
<label>科目コード:</label>

<input type="text" name="cd" value="<%=cd %>" readonly style="border: none;" /><br>
<label>科目名:</label>
<input type="text" name="name" value="<%=name %>" maxlength="20" required /><br>

<input type="submit" value="変更">
</form>
<a href="subject_list">戻る</a>
</body>
</c:param>

</c:import>