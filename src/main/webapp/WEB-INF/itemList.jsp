<!-- 商品一覧ページを表示するJSP -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 	<link rel="stylesheet" type="text/css" href="../pentomino.css"> -->
<title>ピザ・ペントミノ - 商品一覧</title>
</head>
<body>

<h1>ピザ・ペントミノ - 商品一覧</h1>

<div align="center">
	<h2><c:out value="${user.name}"/> さん、お好きなピザを選んでください</h2>

	<form action="/pentomino/Main" method="post">
<!-- 		<table class="menu" border="0" cellspacing="1"> -->
		<table class="menu">
			<tbody>
				<tr>
					<th>商品</th>
					<th>価格</th>
				</tr>
				<c:forEach var="productItem" items="${productItemList}">
				<tr>
					<td><input type="checkbox" name="buyItemId" value="${productItem.itemId}">
						<c:out value="${productItem.itemName}"/></td>
					<td><c:out value="${productItem.price}"/></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="submit" value="カートへ追加して内容確認へ">
	</form>
	
	<form action="login.jsp">
		<input type="submit" value="ログアウト">
	</form>
</div>

</body>
</html>