<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/style.css">
    <title>得点管理システム</title>
</head>

<body>
<form action="subject_insert" method="get">
    <h2 id="heading">科目情報登録</h2>
    <p>
        <label>科目コード</label>
        <input type="text" name="cd" value="" maxlength="30" placeholder="科目コードを入力してください">
    </p>

    <p>
        <label>科目名</label>
        <input type="text" name="name" value="" maxlength="30" placeholder="科目名を入力してください">
    </p>


    <input class="btn" type="submit" value="登録">
    <p>
    <a href="#" onclick="history.back()">戻る</a>
    </p>
</form>
</body>
</html>
