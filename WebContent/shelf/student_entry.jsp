<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>得点管理システム</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <h2 class="toptitle">学生情報登録</h2>
    <form action="Student_insert.action">
    <p>
        <label>入学年度</label>
        <input name="ent_year" type="text" required>
    </p>

    <p>
        <label>学生番号</label>
        <input type="text" name="no" max="10" required placeholder="学生番号を入力してください"></input>
    </p>

    <p>
        <label>氏名</label>
        <input type="text" name="name" required placeholder="氏名を入力してください">
    </p>

    <p>
        <label>クラス</label>
        <select name="class_num">
            <option value="131">131</option>
        </select>
    </p>
    <input class="btn" type="submit" value="登録">
    <p>
        <a href="#" onclick="history.back()">戻る</a>
    </p>
</form>
</c:param>
</c:import>