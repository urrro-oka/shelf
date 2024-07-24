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
	<div class="login">
		<a>様</a>
		<a href = "#" class="linkhover">ログアウト</a>
	</div>
			<br><a href="menu.jsp" class="linkhover">メニュー</a><br>
			<a href="Student_list.action" class="linkhover">学生管理</a><br>
			<a href="Test_list.action" class="linkhover">成績管理</a><br>
			${param.side }
			<a href="Subject_list.action" class="linkhover">科目管理</a><br>
			${param.side_sub }
		</div>
			<div class="body">
${param.content}
</div>
	</div>
	</section>
			<footer>
    <p>大原学園</p>
  <p class="copyright">
    &copy; 2024 TIC
    </p>
    </footer>
</body>

</html>
