<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>ログイン画面</title>
</head>
<body>
    <h2>ログイン</h2>

    <form action="Login.action" method="post">
        <div>
            <label for="id">ログインＩＤ</label>
            <input type="text" id="id" name="id" maxlength="20" placeholder="半角でご入力ください" required>
        </div>

        <div>
            <label for="password">パスワード</label>
            <input type="password" id="password" name="password" maxlength="20" placeholder="20文字以内の半角英数字でご入力ください" required>
        </div>

        <div>
            <input type="checkbox" id="chk_d_ps">
            <label for="chps">パスワードを表示</label>
        </div>

        <div>
            <input type="submit" id="login" value="ログイン">
        </div>
    </form>

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

