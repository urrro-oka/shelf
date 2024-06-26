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

		<div class="toptitle">
			<h2 class="h3 mb-3 fw-norma bg-secondary big-opacity-10 py-2 px-4">学生管理</h2>
		</div>
			<div class="my-2 text-end px-4">
				<a href="./student_entry.jsp">新規登録</a>
			</div>
			<form action=student_search method="get">
				<div class= "row border mx-3 mb-3 py-2 align-items-center rounded " id="filter">
					<div class="col-4 col4-1 line">
						<label class="form-label" for="student-f1-select">入学年度</label>
						<select class="form-select" id="student-f1-select" name ="ent_year">
							<option value="">-----------------</option>
						 	<option value="2024">2024</option>
							<option value="2023">2023</option>
							<option value="2022">2022</option>
							<option value="2021">2021</option>
							<option value="2020">2020</option>
							<option value="2019">2019</option>
							<option value="2018">2018</option>
							<option value="2017">2017</option>
							<option value="2016">2016</option>
							<option value="2015">2015</option>
						</select>
					</div>
					<div class="col-4 col4-1 line">
						<label class="form-label" for="student-f2-select">クラス</label>
							<select class="form-select" id="student-f2-select" name="class_num">
								<option value="">-------------</option>
								<option value="101">101</option>
								<option value="102">102</option>
								<option value="103">103</option>
								<option value="104">104</option>
								<option value="105">105</option>
								<option value="123">123</option>
								<option value="131">131</option>
							</select>
					</div>
					<div class="col-2 form-check text-center line">
						<label class="form-check-label" for="student-f3-check">
						<%--パラメーター3が存在している場合checkedを追記--%>
						<input class="fore-check-input" type="checkbox"
						id="student-f3-check" name="attend" value="True">

						<span class="ECM_CheckboxInput-DummyInput"></span><span class="ECM_CheckboxInput-LabelText">在学中</span>

						<c:if test="${!empty f3}">checked</c:if>
					</label>
				</div>
				<div class="col-2 text-center line">
					<button class="btn btn-secondary" id="filter-button">絞込み</button>
				</div>
				<div class="st-2 text-warning">${errors.get("f1")}</div>
			</div>
		</form>
		<c:choose>
			<c:when test="${student.size()>0}">
				<div class = "fontsize1">検索結果:${student.size()}件</div>
				<table class="table table-hover">
				<tr>
					<th>入学年度</th>
					<th>学生番号</th>
					<th>氏名</th>
					<th>クラス</th>

					<th class="text-center">在学中</th>
					<th></th>
					<th></th>
				</tr>
	<c:forEach var="student" items="${student}">
		<tr>
			<td>${student.ent_year}</td>
			<td>${student.no}</td>
			<td>${student.name}</td>
			<td>${student.class_num}</td>
			<td class="text-center">
	<%--在学フラグがたっている場合 「○」 それ以外は「×」を表示 --%>
	<c:choose>
	<c:when test= "${student.is_attend}">
	〇
	</c:when>
	<c:otherwise>
	×
	</c:otherwise>
	</c:choose>
	</td>
	<td><a href="student_transfer.jsp?
	no=${student.no}&ent_year=${student.ent_year}<%--&name=${student.name}--%>&class_num=${student.class_num}">
	変更</a></td>

	<td><a href= "student_delete.jsp?
	no=${student.no}&ent_year=${student.ent_year}
	<%--&name=${student.name}--%>&class_num=${student.class_num}">削除</a></td>
	</tr>
	</c:forEach>
	</table>
	</c:when>
	<c:otherwise>
		<div>学生情報が存在しませんでした</div>
	</c:otherwise>
	</c:choose>
	</c:param>
</c:import>