<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目情報削除-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <% String cd = request.getParameter("cd"); %>
    <% String name = request.getParameter("name"); %>

    <h2 class="toptitle">科目情報削除</h2>
    <p class="fontsize1">「<%=name %>を削除してもよろしいですか？」</p>
<form action="subject_delete" method="get">
<table>
		<tr>
		    <th>科目コード</th>
		    <th>科目名</th>
		</tr>
		<tr>
		    <td><%=cd %></td>
		    <td><%=name %></td>
		</tr>
	</table>
	<p>削除しますか？</p>

<input type="hidden" name="cd" value="<%=cd %>">
<input class="btnl" type="submit" value="削除する">

<p><a href="#" onclick="history.back()">戻る</a></p>

</form>

</body>
</c:param>
</c:import>


