<%-- 共通部分JSP --%>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="../css/style.css">
	<link rel="icon" href="../css/hand.ico">
</head>

<body>

${param.title}
	<div class="login">
		<a>${customer.name }様</a>
		<a href = "../login_logout/Logout.action" class="linkhover">ログアウト</a>
	</div>
${param.scripts}
		<section class= "me-4">
		<div class = "all">
		<div class="sidebar">
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
