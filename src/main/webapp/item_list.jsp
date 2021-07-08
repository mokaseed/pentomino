<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>satou さん、お好きなピザを選んでください</h2>

	<form action="item_list.jsp">
<!-- 		<table class="menu" border="0" cellspacing="1"> -->
		<table class="menu">
		<tbody><tr>
			<th>商品</th>
			<th>価格</th>
		</tr>
		<tr>
			<td><input type="checkbox">商品A</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td><input type="checkbox">商品B</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td><input type="checkbox">商品C</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td><input type="checkbox">商品D</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td><input type="checkbox">商品E</td>
			<td class="price">¥1,000</td>
		</tr>
		</tbody></table>
		<input type="submit" value="チェックした商品をカートに入れる">
	</form>
	
	<form action="cart.jsp">
		<input type="submit" value="カートの内容を確認して注文へ進む">
	</form>
	
	<form action="login.jsp">
		<input type="submit" value="ログアウト">
	</form>
</div>

</body>
</html>