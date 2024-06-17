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
    	<a><font color="red">同じ学生番号が存在しています！</font></a>
    <form action="student_insert">
    <p>
        <label>入学年度</label>
        <select name="ent_year" required>
            <option value="">--------</option>
            <option value="2015">2015</option>
            <option value="2016">2016</option>
            <option value="2017">2017</option>
            <option value="2018">2018</option>
            <option value="2019">2019</option>
            <option value="2020">2020</option>
            <option value="2021">2021</option>
            <option value="2022">2022</option>
            <option value="2023">2023</option>
            <option value="2024">2024</option>
        </select>
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
            <option value="101">101</option>
            <option value="102">102</option>
            <option value="103">103</option>
            <option value="104">104</option>
            <option value="105">105</option>
            <option value="123">123</option>
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