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
		<h2 class="toptitle">合格ライン登録</h2>

<form action="subject_make_up" method="get">
<table>
	<tr>
		<th>科目コード</th>
		<td><input type="text" name="cd" value="<%=cd %>" readonly style="border: none;" /></td>
	</tr>

	<tr>
		<th>科目名:</th>
		<td><input type="text" name="name" value="<%=name %>" readonly style="border: none;" /></td>
	</tr>
	<tr>
		<th>合格ライン:</th>
		<td><input type="number" name="passed_point"/></td>
	</tr>
</table>
<input class="btn" type="submit" value="変更">
</form>
<a href="subject_list">戻る</a>
</body>
</c:param>

</c:import>