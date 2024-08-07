<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title></title>
		<div id = "title">-学生新規登録-</div>
	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">
    <h2 class="toptitle">学生情報登録</h2>
    	<a><font color="red">同じ学生番号が存在しています！</font></a>
    <form action="Student_insert.action">
    <div class="table2">
    <table>
    <tr>
        <th>入学年度</th>
        <td><input name="ent_year" type="text" class ="ef"  required placeholder="入学年度を入力してください"></td>
	</tr>
	<tr>
        <th>学生番号</th>
        <td><input type="text" class ="ef"  name="no" maxlength="7" minlength="7"" required placeholder="学生番号を入力してください"></input></td>
	</tr>
	<tr>
        <th>氏名</th>
        <td><input type="text" class ="ef"  name="name" required placeholder="氏名を入力してください"></td>
	</tr>
	<tr>
        <th>クラス</th>
        <td><select class="puru" name="class_num">
            <option value="131">131</option>
        </select></td>
	</tr>
	<tr>

        <td><a class="linkhover" href="#" onclick="history.back()">戻る</a></td>
        <td><input class="btn" type="submit" value="登録"></td>
	</tr>
    </table>
    </div>
</form>
</c:param>
</c:import>