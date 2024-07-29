<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>-学生新規登録-</title>
		<div id = "title">得点管理システム</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <% String ent_year = request.getParameter("ent_year");%>
    <% String no = request.getParameter("no");%>
        <% String name = request.getParameter("name");%>
                <% String class_num = request.getParameter("class_num");%>
    <h2 class="toptitle">学生情報変更</h2>

<form action="Student_update.action">
<table class="table2">

    <tr>
    <th><label>入学年度</label></th><td><%=ent_year %></td></tr>
    <input placeholder="入学年度" type="hidden" name="ent_year" value="<%=ent_year %>">



        <tr>
    <th><label>学生番号</label></th><td><%=no %></td></tr>
    <input placeholder="学生番号" type="hidden" name="no" value="<%=no %>">



        <tr>
    <th><label>氏名</label></th><td>
    <input placeholder="氏名" type="text" id="name" name="name" value="<%=name %>" required></td></tr>



                <tr>
    <th><label>クラス</label></th><td>
        <select name="class_num">
        	<option value="<%=class_num %>"><%=class_num %></option>
        </select></td></tr>

    <tr>
    <th>在学中</t>
    <td><div class="pos1">
			<label class="form-check-label" for="student-f3-check">
						<%--パラメーター3が存在している場合checkedを追記--%>
						<input class="fore-check-input" type="checkbox"
						id="student-f3-check" name="is_attend" value="True">

						<span class="ECM_CheckboxInput-DummyInput"></span><span class="ECM_CheckboxInput-LabelText"></span>
			</label>
	</div></td>
	</tr>
	<tr>
	<td>    <a class="linkhover" href="#" onclick="history.back()">戻る</a></td>
	<td>   <input class="btn" type="submit" value="変更"></input></td>
    </tr>
</table>


</form>

</c:param>
</c:import>