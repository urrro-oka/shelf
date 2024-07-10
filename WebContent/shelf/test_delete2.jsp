<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-成績削除</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">

    <% String student_no = request.getParameter("student_no"); %>
    <% String ent_year = request.getParameter("ent_year"); %>
    <% String student_name = request.getParameter("student_name"); %>
    <% String class_num = request.getParameter("class_num"); %>

    <h2 class="toptitle">成績削除</h2>
    <p class="fontsize1">「削除してもよろしいですか？」</p>
<form action="test_delete2" method="get">
<table>
		<tr>
		    <th>学生番号</th>
		    <th>入学年度</th>
		    <th>学生名</th>
		    <th>クラス</th>
		</tr>
		<tr>
		    <td><%=student_no %></td>
		    <td><%=ent_year%></td>
		    <td><%=student_name %></td>
		    <td><%=class_num %></td>


		</tr>
	</table>
	<p>削除しますか？</p>

<input type="hidden" name="student_no" value="<%=student_no %>">
<input type="hidden" name="stundent" value="<%=student_name %>">

<input class="btnl" type="submit" value="削除する">

<p><a href="" onclick="history.back()">戻る</a></p>

</form>

</body>
</c:param>
</c:import>


