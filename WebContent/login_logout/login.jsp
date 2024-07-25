<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>
	<link rel="stylesheet" href="../css/style.css">
	<link rel="icon" href="../css/hand.ico">
</head>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ログイン</title>
</head>
<body>
<div class="login_page">

    <div class = "toptitle"><h1>ログイン</h1></div>
	<a><font color="red">${errorMessage}</font></a>
    <form action="Login.action" method="post">
    <table>
        <tr>
            <th><label for="id">ログインＩＤ</label></th>
            <td><input type="text" id="id" name="id" maxlength="20" placeholder="半角でご入力ください" required></td>
        </tr>

        <tr>
            <th><label for="password">パスワード</label></th>
            <td><input type="password" id="password" name="password" maxlength="20" placeholder="20文字以内の半角英数字でご入力ください" required></td>
		</tr>

		<tr>

            <td><input type="checkbox" id="chk_d_ps">
          	<label for="chps">パスワードを表示</label></td>
          	<td><input type="submit" id="login" value="ログイン"></td>
		</tr>

    </table>
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

