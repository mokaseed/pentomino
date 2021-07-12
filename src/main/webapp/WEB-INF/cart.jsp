<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h2>satou さんのカート内の商品は以下の通りです</h2>

	<form action="complete.jsp">
<!-- 		<table class="menu" border="0" cellspacing="1"> -->
	<table class="menu">
		<tbody><tr>
			<th>品名</th>
			<th>単価</th>
			<th>注文数</th>
			<th>金額</th>
		</tr>
		<tr>
			<td>商品A</td>
			<td class="price">¥1,000</td>
			<td class="price">1個</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td>商品C</td>
			<td class="price">¥1,000</td>
			<td class="price">2個</td>
			<td class="price">¥2,000</td>
		</tr>
		<tr>
			<td>商品D</td>
			<td class="price">¥1,000</td>
			<td class="price">1個</td>
			<td class="price">¥1,000</td>
		</tr>
		<tr>
			<td colspan="3" align="right">合計金額</td>
			<td class="price">¥4,000</td>
		</tr>
		</tbody></table>
		<input type="submit" value="この内容で注文する">
	</form>
	
	<form action="item_list.jsp">
		<input type="submit" value="注文をやりなおす">
	</form>
</div>

</body>
</html>