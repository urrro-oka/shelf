<%@ page contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/style.css">
    <title>得点管理システム</title>
</head>
<body>
    <% String cd = request.getParameter("cd"); %>
    <% String name = request.getParameter("name"); %>

	<div id="title">得点管理システム</div>
    <h2 class="toptitle">科目情報削除</h2>
    <p class="fontsize1">「javaプログラミング基礎(FOZ)を削除してもよろしいですか？」</p>
<form action="subject_delete">
<table>
		<tr>
		    <th>科目コード</th>
		    <th>科目名</th>
		</tr>
		<tr>
		    <td><%=cd %></td>
		    <td><%=name %></td>
		</tr>
	</table>
	<p>削除しますか？</p>

<input type="hidden" name="cd" value="<%=cd %>">
<input class="btnl" type="submit" value="削除する">

<p><a href="" onclick="history.back()">戻る</a></p>

</form>

</body>
</html>


