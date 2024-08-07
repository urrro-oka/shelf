<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp" >

	<c:param name="title">
		<title>-成績新規登録-</title>
		<div id="title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>

		<c:param name="side">　　<a class="linkhover branchside" href="Test_entry.action">成績登録</a><br></c:param>
	<c:param name="content">

	<h2 class="toptitle">成績新規登録</h2>
	<form action="Test_insert.action" method="get">
	<div class="table2">
		<table>

			<tr>
				<th>学生番号</th>

				<td><select class="puru" name="student_no" required>
						<option value="">-------</option>
						<c:forEach var="student" items="${student}">
							<option value="${student.no}">${student.no}：${student.name}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>クラス</th>

				<td><select class="puru" name="class_num" required>
						<option value="">-------</option>
						<c:forEach var="student" items="${class_num}">
							<option value="${student.class_num}">${student.class_num}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>科目</th>

				<td><select class="puru" name="subject_cd" required>
						<option value="">-------</option>
						<c:forEach var="subject" items="${subject}">
							<option value="${subject.cd}">${subject.name}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>回数</th>

				<td><select class="puru" name="no" required>
						<option value="1">1</option>
						<option value="2">2</option>
				</select></td>
			</tr>
			<tr>
				<th>得点</th>

				<td><input type="number" class="ef" name="point" min="0" max="100" required
					placeholder="得点を入力してください"></td>
			</tr>
			<tr>

				<td><a class="linkhover" href="#" onclick="history.back()">戻る</a></td>
				<td><input type="submit" class ="btn" value="登録"></td>
			</tr>
		</table>
	</div>
	</form>
</c:param>
</c:import>
