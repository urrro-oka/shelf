<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>-学生情報削除-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">


    <% String ent_year = request.getParameter("ent_year"); %>
    <% String no = request.getParameter("no"); %>
    <% String name = request.getParameter("name"); %>
    <% String class_num = request.getParameter("class_num"); %>

    <h2 class="toptitle">学生情報削除</h2>
    <p class="fontsize1">削除したい学生情報</p>
<form action="Student_delete.action">
	<table>
		<tr>
		    <th>入学年度</th>
		    <th>学生番号</th>
		    <th>名前</th>
		    <th>クラス</th>
		</tr>
		<tr>
		    <td><%=ent_year %></td>
		    <td><%=no %></td>
		    <td><%=name %></td>
		    <td><%=class_num %></td>
		</tr>
	</table>
	<p>削除しますか？</p>

	<input type="hidden" name="no" value="<%=no %>">
<input class="btnl" type="submit" value="削除する">

</form>
<form action="Student_list.action">
    <input class="btnl" type="submit" value="学生一覧">
</form>
    <a class="linkhover" href="#" onclick="history.back()">戻る</a><br>

</c:param>
</c:import>