<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ログイン</title>
    <link rel="stylesheet" href="../css/style.css">
	<link rel="icon" href="../css/hand.ico">
</head>
<body>
		<div id = "title">得点管理システム</div>
<div class="login_page">

    <h1 class = "toptitle1">ログイン</h1>
    <c:choose><c:when test="${errorMessage == null}"></c:when>
	<c:otherwise><a><font color="red">${errorMessage}</font></a></c:otherwise></c:choose>
    <form action="Login.action" method="post">
    <div class="table2">
    <table>
        <tr>
            <th><label for="id">ログインＩＤ</label></th>
            <td>
            <div class="cp_iptxt">
            <input type="text" class ="ef" name="id" maxlength="20" placeholder="半角でご入力ください" required>
            <span class="focus_line"><i></i></span>
            </div></td>

        </tr>

        <tr>
            <th><label for="password">パスワード</label></th>
            <td><input type="password" class ="ef" id="password" name="password" maxlength="20" placeholder="20文字以内の半角英数字でご入力ください" required></td>
		</tr>

		<tr>
            <td><label for="chps">パスワードを表示</label>
            <input type="checkbox" id="chk_d_ps"></td>
          	<td><input type="submit" id="login" class="btn" value="ログイン"></td>
		</tr>

    </table>
    </div>
    </form>
</div>
    <script>
        // パスワード表示/非表示のスクリプト
        const passwordField = document.getElementById('password');
        const chkDisplayPassword = document.getElementById('chk_d_ps');

        chkDisplayPassword.addEventListener('change', function () {
            if (this.checked) {
                passwordField.type = 'text';
            } else {
                passwordField.type = 'password';
            }
        });
    </script>
</body>
</html>

