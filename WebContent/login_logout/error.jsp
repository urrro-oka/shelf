<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<c:import url="/common/base.jsp">
	<c:param name="title">
			<title>エラー</title>
		<div id = "title">得点管理システム</div>

	</c:param>
	<c:param name="scripts"></c:param>
	<c:param name="content">

    <h1 class="toptitle">予期せぬエラーが発生しました。</h1>
    <div class="error">
    <h2>予期せぬエラーが発生しました。<br>
    	ログイン画面に戻ります。</h2>

    <p>繰り返しエラーが発生する場合は、<br>下記電話番号またはメールアドレスにお問い合わせを願い致します。</p>
    <a>【お問い合わせ】<br>
    ☏：0120-XXXX-XXXX<br>
    ✉：karanakusi2004@gmail.com</a>
    </div>
    <a href="../login_logout/login.jsp" class="linkhover">ログイン画面に戻る</a>
</c:param>
</c:import>