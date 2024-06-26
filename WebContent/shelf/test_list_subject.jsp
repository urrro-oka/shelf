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
			<h2 class="h3 mb-3 fw-norma bg-secondary big-opacity-10 py-2 px-4">成績一覧(科目別)</h2>
		</div>
			<form action=test_search_subject method="get">
				<div class= "row border mx-3 mb-3 py-2 align-items-center rounded " id="filter">

				<%--科目ごとに検索--%>
				<div>科目情報</div>
					<div class="col-4 col4-1 line">
						<label class="form-label" for="student-f1-select">入学年度</label>
						<select class="form-select" id="student-f1-select" name ="ent_year" required>
							<option value="">-----------------</option>
								<c:forEach var="year" items="${year}">
								<option value="${year.ent_year}">${year.ent_year}</option>
								</c:forEach>
						</select>
					</div>
					<div class="col-4 col4-1 line">
						<label class="form-label" for="student-f2-select">クラス</label>
							<select class="form-select" id="student-f2-select" name="class_num" required>
								<option value="">-------------</option>
								<c:forEach var="num" items="${num}">
								<option value="${num.class_num}">${num.class_num}</option>
								</c:forEach>
							</select>
					</div>

					<div class="col-4 col4-1 line">
						<label class="form-label" for="student-f2-select">科目</label>
							<select class="form-select" id="student-f2-select" name="subject" required>
								<option value="">-------------</option>
								<c:forEach var="subject" items="${subject}">
								<option value="${subject.cd}">${subject.name}</option>
								</c:forEach>
							</select>
					</div>

					<div class="col-2 text-center line">
					<button class="btn btn-secondary" id="filter-button">検索</button>
				</div>

                </div>
		</form>
		<form action=test_search_student method="get">

                <div class= "row border mx-3 mb-3 py-2 align-items-center rounded " id="filter">
					<div>学生情報</div>
						<label>学生番号</label>
							<input type="text" placeholder="学生番号を入力してください" name="student_id" required>

				<div class="col-2 text-center line">
					<button class="btn btn-secondary" id="filter-button">検索</button>
				</div>
				<div class="st-2 text-warning">${errors.get("f1")}</div>
			</div>
		</form>
		<c:choose>
			<c:when test="${test.size()>0}">
				<div class = "fontsize1">検索科目:${test.get(0).subject_name}</div>
				<table class="table table-hover">
				<tr>
					<th>入学年度</th>
					<th>クラス</th>
					<th>学生番号</th>
					<th>氏名</th>
					<th>１回</th>
					<th>２回</th>
				</tr>
	<c:forEach var="test" items="${test}">
		<tr>
			<td>${test.ent_year}</td>
			<td>${test.class_num}</td>
			<td>${test.student_no}</td>
			<td>${test.student_name}</td>
			<td>${test.point1}</td>
			<td>${test.point2}</td>

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
		<div>成績情報が存在しませんでした</div>


	</c:otherwise>
	</c:choose>
	</c:param>
</c:import>