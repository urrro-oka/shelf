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
			<br><a href="menu.jsp">メニュー</a><br>
			<a href="Student_list.action">学生管理</a><br>
			<a href="Test_list.action">成績管理</a><br>
			${param.side }
			<a href="Subject_list.action">科目管理</a><br>
			${param.side_sub }
		</div>
			<div class="body">
${param.content}
</div>
		<div class="footer02">
    <p>大原学園</p>
  <p class="copyright">
    &copy; 2024 TIC
    </p>
    </div>
	</div>
	</section>
</body>

</html>
