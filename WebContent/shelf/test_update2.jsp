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

	<h2 class="toptitle">成績変更</h2>
		<a><font color="red">２回目が登録されていません！</font></a>
	<form action="Test_update.action" method="get">
	<div class="table2">
		<table>

			<tr>
				<th>学生名</th>

				<td>${student.student_name}</td>
			</tr>
			<tr>
				<th>クラス</th>

				<td>${student.class_num}</td>
			</tr>
			<tr>
				<th>科目名</th>

				<td>${student.subject_cd}</td>
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

				<td><input type="text" name="point" min="0" max="100" required
					placeholder="得点を入力してください"></td>
			</tr>
			<tr>

			<input type="hidden" name="student_no" value="${student.student_no}">
			<input type="hidden" name="subject_cd" value="${student.subject_cd}">
			<input type="hidden" name="student_name" value="${student.student_name}">
			<input type="hidden" name="subject_name" value="${student.subject_name}">
			<input type="hidden" name="class_num" value="${student.class_num}">
				<td><a class="linkhover" href="#" onclick="history.back()">戻る</a></td>
				<td><input type="submit" class ="btn" value="変更"></td>
			</tr>
		</table>
	</div>
	</form>
</c:param>
</c:import>
