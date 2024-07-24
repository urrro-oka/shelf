<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
<c:param name="title">
			<title>-科目一覧-</title>
		<div id = "title">得点管理システム</div>
	</c:param>

	<c:param name="side_sub">　　<a class="linkhover branchside" href="subject_entry.jsp">科目登録</a><br></c:param>

	<c:param name="scripts"></c:param>
	<c:param name="content">
    <h2 class="toptitle">科目管理</h2>
    <a class="linkhover" href="subject_entry.jsp">新規登録</a>

    <c:choose>
    <c:when test="${subject.size() > 0}">
    <table>
            <tr>
                <th>科目コード</th>
                <th>科目名</th>
                <th>合格ライン</th>
                <th></th>
                <th></th>
            </tr>
        	<c:forEach var="subject" items="${subject}">
            <tr>
                <td>${subject.cd}</td>
                <td>${subject.name}</td>
                <td>${subject.passed_point}</td>


                <td><a class="linkhover" href="subject_make_up.jsp?cd=${subject.cd}&name=${subject.name}">合格ライン</a></td>
                <td><a class="linkhover" href="subject_update.jsp?cd=${subject.cd}&name=${subject.name}">変更</a>・
               <a class="linkhover" href="subject_delete.jsp?cd=${subject.cd}&name=${subject.name}">削除</a></td>
            </tr>

            </c:forEach>
      </table>
            </c:when>
            <c:otherwise>
                <h1>科目データが存在しませんでした</h1>
            </c:otherwise>
           </c:choose>

</body>
</c:param>
</c:import>
