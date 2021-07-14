<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" type="text/css" href="../pentomino.css"> -->
<title>ピザ・ペントミノ - カート一覧</title>
</head>
<body>

<h1>ピザ・ペントミノ - カート一覧</h1>

<div align="center">
	<h2><c:out value="${user.name}"/> さんのカート内の商品は以下の通りです</h2>

	<form action="/pentomino/Complete">
<!-- 		<table class="menu" border="0" cellspacing="1"> -->
	<table class="menu">
		<tbody><tr>
			<th>品名</th>
			<th>単価</th>
			<th>注文数</th>
			<th>金額</th>
		</tr>
		<tr>
			<c:forEach var="productItem" items="${buyItemList}">
				<c:if test="${productItem.quantity != 0}">
				<tr>
					<td><c:out value="${productItem.itemName}"/></td>
					<td><c:out value="${productItem.price}"/>円</td>
					<td><c:out value="${productItem.quantity}"/>枚</td>
					<td>${productItem.price * productItem.quantity}円</td>
				</tr>
				</c:if>
				</c:forEach>
		</tr>
		<tr>
			<td colspan="3" align="right">合計金額</td>
			<td class="price"><c:out value="${totalAmount}"/>円</td>
		</tr>
		</tbody></table>
		<input type="submit" value="この内容で注文する">
	</form>
	
	<form action="/pentomino/Main">
		<input type="submit" value="注文をやりなおす">
	</form>
</div>

</body>
</html>