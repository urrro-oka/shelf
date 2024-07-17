<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
		<title>-成績削除</title>
		<div id="title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">

		<% String student_no = request.getParameter("student_no"); %>
		<% String class_num = request.getParameter("class_num"); %>
		<% String subject_cd = request.getParameter("subject_cd"); %>
		<% String subject_name = request.getParameter("subject_name"); %>
		<% String point1 = request.getParameter("point1"); %>
		<% String point2 = request.getParameter("point2"); %>

		<h2 class="toptitle">成績削除</h2>
		<p class="fontsize1">「削除してもよろしいですか？」</p>
		<form action="Test_delete.action" method="get">
			<table>
				<tr>
					<th>学生番号</th>
					<th>クラス</th>
					<th>科目名</th>
					<th>1回</th>
					<th>2回</th>
				</tr>
				<tr>
					<td><%=student_no %></td>
					<td><%=class_num%></td>
					<td><%=subject_name%></td>
					<td><%=point1 %></td>
					<td><%=point2 %></td>



				</tr>
			</table>
			<p>削除しますか？</p>

			<input type="hidden" name="student_no" value="<%=student_no %>">
			<input type="hidden" name="subject_cd" value="<%=subject_cd %>">


			<input class="btnl" type="submit" value="削除する">

			<p>
				<a href="#" onclick="history.back()">戻る</a>
			</p>

		</form>

		</body>
	</c:param>
</c:import>


