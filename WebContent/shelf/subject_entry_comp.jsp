<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目登録完了-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
		<c:param name="side_sub">　　<a class="linkhover branchside" href="subject_entry.jsp">科目登録</a><br></c:param>
	<c:param name="content">
<form action="Subject_list.action">

    <h2 class="toptitle">科目情報登録・完了</h2>
    <p>登録が完了しました</p>

    <input class="btn" type="submit" value = "科目一覧"><br>
        <a class="linkhover" href="#" onclick="history.back()">戻る</a><br>
</form>
</body>
</c:param>

</c:import>