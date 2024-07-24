<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp" >

	<c:param name="title">
		<title>得点管理システム</title>
		<div id="title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>

		<c:param name="side">　　<a class="linkhover branchside" href="Test_entry.action">成績登録</a><br></c:param>
	<c:param name="content">

		<% String student_no = request.getParameter("student_no"); %>
		<% String student_name = request.getParameter("student_name"); %>
		<% String class_num = request.getParameter("class_num"); %>
		<% String subject_cd = request.getParameter("subject_cd"); %>
		<% String subject_name = request.getParameter("subject_name"); %>

	<h2 class="toptitle">成績変更</h2>
	<form action="Test_update.action" method="get">
		<table>

			<tr>
				<th>学生名</th>

				<td><%=student_name %></td>
			</tr>
			<tr>
				<th>クラス</th>

				<td><%=class_num %></td>
			</tr>
			<tr>
				<th>科目名</th>

				<td><%=subject_name %></td>
			</tr>
			<tr>
				<th>回数</th>

				<td><select name="no" required>
						<option value="1">1</option>
						<option value="2">2</option>
				</select></td>
			</tr>
			<tr>
				<th>得点</th>

				<td><input type="text" name="point" max="3" required
					placeholder="得点を入力してください"></td>
			</tr>
			<tr>

			<input type="hidden" name="student_no" value="<%=student_no %>">
			<input type="hidden" name="subject_cd" value="<%=subject_cd %>">
			<input type="hidden" name="student_name" value="<%=student_name%>">
			<input type="hidden" name="subject_name" value="<%=subject_name%>">
			<input type="hidden" name="class_num" value="<%=class_num%>">

				<td><input type="submit" class ="btn" value="変更"></td>
				<td><a class="linkhover" href="#" onclick="history.back()">戻る</a></td>
			</tr>
		</table>
	</form>
</c:param>
</c:import>
