<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp" />

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="../css/style.css">
<title>得点管理システム</title>
</head>

<body>
	<div id="title">得点管理システム</div>
	<h2 class="toptitle">成績新規登録</h2>
	<form action="Test_insert.action" method="get">
		<table>

			<tr>
				<th>学生番号</th>

				<td><select name="student_no">
						<option value="">-------</option>
						<c:forEach var="student" items="${student}">
							<option value="${student.no}">${student.no}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>クラス</th>

				<td><select name="class_num">
						<option value="">-------</option>
						<c:forEach var="student" items="${student}">
							<option value="${student.class_num}">${student.class_num}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>科目</th>

				<td><select name="subject_cd">
						<option value="">-------</option>
						<c:forEach var="subject" items="${subject}">
							<option value="${subject.cd}">${subject.name}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>回数</th>

				<td><select name="no">
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


				<td><input type="submit" value="登録"></td>
				<td><a href="#" onclick="history.back()">戻る</a></td>
			</tr>
		</table>
	</form>
</body>
</html>
