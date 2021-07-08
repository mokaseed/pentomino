<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- <link rel= "stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/login.css"> --%>
<title>ピザ・ペントミノ - ログイン</title>
</head>
<body>
<h1>ピザ・ペントミノへようこそ！</h1>
<div align="center">
<form action="item_list.jsp" method="post" class="login">
	<table class="login">
		<tbody>
			<tr>
				<td>ユーザー名</td>
				<td><input type="text" name="user"></td>
			</tr>
			<tr>
				<td>パスワード</td>
				<td><input type="password" name="pass"></td>
			</tr>
		</tbody>
	</table>
	<input type="submit" value="ログイン">
</form>
</div>
</body>
</html>