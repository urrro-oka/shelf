<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
    <c:param name="title">
        <title>得点登録システム</title>
        <div id="title">得点登録システム</div>
    </c:param>
    <c:param name="scripts"></c:param>
    <c:param name="content">

        <% String student_no = request.getParameter("student_no"); %>
        <% String subject = request.getParameter("subject"); %>
        <% String score = request.getParameter("score"); %>

        <div class="toptitle">
            <h2 class="h3 mb-3 fw-norma bg-secondary big-opacity-10 py-2 px-4">成績削除</h2>
        </div>
        <p class="fontsize1">削除したい成績情報</p>
        <form action="<%= request.getContextPath() %>/shelf/test_delete" method="post">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>学生番号</th>
                        <th>科目</th>
                        <th>得点</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><%= student_no %></td>
                        <td><%= subject %></td>
                        <td><%= score %></td>
                    </tr>
                </tbody>
            </table>
            <p>削除しますか？</p>
            <input type="hidden" name="student_no" value="<%= student_no %>">
            <input type="hidden" name="subject" value="<%= subject %>">
            <input type="hidden" name="score" value="<%= score %>">
            <div class="text-center">
                <input class="btn btn-danger" type="submit" value="削除する">
                <a href="#" onclick="history.back()" class="btn btn-secondary">戻る</a>
            </div>
        </form>

        <form action="test_list" method="get">
            <div class="text-center mt-3">
                <input class="btn btn-primary" type="submit" value="成績一覧">
            </div>
        </form>

    </c:param>
</c:import>
