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

		<c:param name="side_sub">　　<a class="linkhover branchside" href="subject_entry.jsp">科目登録</a><br></c:param>
	<c:param name="content">
    <% String cd = request.getParameter("cd"); %>
    <% String name = request.getParameter("name"); %>
		<h2 class="toptitle">科目情報変更</h2>

<form action="Subject_update.action" method="get">
<table>
	<tr>
		<th>科目コード</th>
		<td><input type="text" name="cd" value="<%=cd %>" readonly style="border: none;" /></td>
	</tr>

	<tr>
		<th>科目名:</th>
		<td><input type="text" name="name" value="<%=name %>" maxlength="20" required /></td>
	</tr>
</table>
<input class="btn" type="submit" value="変更">
</form>
<a class="linkhover" href="Subject_list.action">戻る</a>
</body>
</c:param>

</c:import>