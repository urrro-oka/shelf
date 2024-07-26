<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目変更完了-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
		<c:param name="side_sub">　　<a class="linkhover branchside" href="subject_entry.jsp">科目登録</a><br></c:param>
	<c:param name="content">


    <h2 class="toptitle">科目情報・変更完了</h2>
    <p>登録が完了しました</p>
    <a class="linkhover" href="Subject_list.action">科目一覧</a><br>
        <a class="linkhover" href="#" onclick="history.back()">戻る</a><br>


</body>
</c:param>

</c:import>