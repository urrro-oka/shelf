<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目登録-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
<form action="subject_insert" method="get">
    <h2 class="toptitle">科目情報登録</h2>
    <a><font color="red">同じ科目コードが存在しています！</font></a>
  <table>
    <tr>
        <th>科目コード</th>
        <td><input type="text" name="cd" value="" maxlength="30" placeholder="科目コードを入力してください" required></td>
   	</tr>
    <tr>
        <th>科目名</th>
        <td><input type="text" name="name" value="" maxlength="30" placeholder="科目名を入力してください" required></td>
    </tr>
	</table>

    <input class="btn" type="submit" value="登録">
    <p>
    <a href="#" onclick="history.back()">戻る</a>
    </p>
</form>
</body>
</c:param>

</c:import>