<%-- 共通部分JSP --%>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="../css/style.css">
</head>

<body>

${param.title}
${param.scripts}
		<section class= "me-4">
		<div class = "all">
		<div class="sidebar">
			<p>メニュー</p>
			<a href="student_list">学生管理</a><br><br>
			<a href="test_list">成績管理</a><br><br>
			${param.side }
			<a href="subject_list">科目管理</a><br><br>
		</div>
			<div class="body">
${param.content}
</div>
	</div>
	</section>
</body>
</html>
