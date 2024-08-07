<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<c:import url="/common/base.jsp">
	<c:param name="title">
		<title>-成績一覧(生徒別)-</title>
		<div id="title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>

		<c:param name="side">　　<a class="linkhover branchside" href="Test_entry.action">成績登録</a><br></c:param>
	<c:param name="content">

		<div class="toptitle">
			<h2 class="h3 mb-3 fw-norma bg-secondary big-opacity-10 py-2 px-4">成績一覧(学生別)</h2>
		</div>
		<form action="Test_search_subject.action" method="get">
			<div class="row border mx-3 mb-3 py-2 align-items-center rounded "
				id="filter">

				<%--科目ごとに検索--%>
				<div>科目情報</div>
				<div class="col-4 col4-1 line">
					<label class="form-label" for="student-f1-select">入学年度</label> <select
						class="form-select" id="student-f1-select" name="ent_year"
						required>
						<option value="">-----------------</option>
						<c:forEach var="year" items="${year}">
							<option value="${year.ent_year}">${year.ent_year}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-4 col4-1 line">
					<label class="form-label" for="student-f2-select">クラス</label> <select
						class="form-select" id="student-f2-select" name="class_num"
						required>
						<option value="">-------------</option>
						<c:forEach var="num" items="${num}">
							<option value="${num.class_num}">${num.class_num}</option>
						</c:forEach>
					</select>
				</div>

				<div class="col-4 col4-1 line">
					<label class="form-label" for="student-f2-select">科目</label> <select
						class="form-select" id="student-f2-select" name="subject" required>
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
		<form action="Test_search_student.action" method="get">

			<div class="row border mx-3 mb-3 py-2 align-items-center rounded "
				id="filter">
				<div>学生情報</div>
				<label>学生番号</label> <input type="text" class ="ef2"  placeholder="半角を入力してください"
					name="student_id" required>

				<div class="col-2 text-center line">
					<button class="btn btn-secondary" id="filter-button">検索</button>
				</div>
				<div class="st-2 text-warning">${errors.get("f1")}</div>
			</div>
		</form>
		<c:choose>
<c:when test="${test.size()>0}">
<div class = "fontsize1"><a>学生名:${test.get(0).student_name}</a></div>
<table class="table table-hover">
<tr>
<th>科目名</th>
<th>科目コード</th>
<th>回数</th>
<th>点数</th>
<th>合格ライン</th>
<th>追試</th>
<th></th>
<th></th>
</tr>
<c:forEach var="test" items="${test}">
<tr>
<td>${test.subject_name}</td>
<td>${test.subject_cd}</td>
<td>${test.no}</td>
<td>${test.point1}</td>
<td>${test.make_up}</td>
<td>
<c:choose>
<c:when test="${test.point1>test.make_up}">
				なし
</c:when>
<c:otherwise>
				あり
</c:otherwise>
</c:choose>
<td><a class="linkhover" href="test_update.jsp?student_name=${test.student_name}&student_no=${test.student_no}&class_num=${test.class_num}&subject_name=${test.subject_name}
                                &subject_cd=${test.subject_cd}&point1=${test.point1}&point2=${test.point2}">変更</a></td>
	<td><a class="linkhover" href= "test_delete2.jsp?
	student_name=${test.student_name}&subject_cd=${test.subject_cd}&subject_name=${test.subject_name}
	&no=${test.no}&point1=${test.point1}&point2=${test.point2}&student_no=${test.student_no}">削除</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1>成績情報が存在しませんでした</h1>


	</c:otherwise>
</c:choose>
	</c:param>
</c:import>