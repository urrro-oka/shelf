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
		<c:param name="side_sub">　　<a class="linkhover branchside" href="subject_entry.jsp">科目登録</a><br></c:param>
	<c:param name="content">
<form action="Subject_insert.action" method="get">
    <h2 class="toptitle">科目情報登録</h2>
    <div class="table2">
    <table>
    <tr>
        <th>科目コード</th>
        <td><input type="text" name="cd" value="" maxlength="3" minlength="3" placeholder="科目コードを入力してください" required></td>
   	</tr>
    <tr>
        <th>科目名</th>
        <td><input type="text" name="name" value="" maxlength="30" placeholder="科目名を入力してください" required></td>
    </tr>
    <tr>
    	<td><a class="linkhover" href="Subject_list.action">戻る</a></td>
        <td><input class="btn" type="submit" value="登録"></td>
    </tr>
	</table>
	</div>

</form>
</body>
</c:param>

</c:import>
