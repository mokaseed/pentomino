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

<form action="/pentomino/Login" method="post">
	<table>
		<tr>
			<td>ユーザー名</td>
			<td><input type="text" name="user" size="16"></td>
		</tr>
		<tr>
			<td>パスワード</td>
			<td><input type="password" name="password" size="16"></td>
		</tr>
	</table>
	<input type="submit" value="ログイン">
</form>
</body>
</html>