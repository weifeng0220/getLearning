<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>消费记录查询</title>
</head>
<body>
<table border="1">
	<tr>
		<th colspan="7">消费记录查询 [<a href="getcategoryList.action" >录入消费信息</a>]</th>
	</tr>
	<tr>
		<td>编号</td>
		<td>商品名称</td>
		<td>价格（元）</td>
		<td>数量</td>
		<td>总金额</td>
		<td>消费类型</td>
		<td>日期</td>
	</tr>
	<c:forEach	items="${consumeinfos }" var="consumeinfo">
		<tr>
			<td>${consumeinfo.consumeId }</td>
			<td>${consumeinfo.consumeName }</td>
			<td>${consumeinfo.consumePrice }</td>
			<td>${consumeinfo.consumeCount }</td>
			<td>${consumeinfo.consumePrice * consumeinfo.consumeCount }</td>
			<td>${consumeinfo.consumeType }</td>
			<td>${consumeinfo.consumeDate }</td>
		</tr>
	</c:forEach>
</table>
<form action="getConsumeinfos.action" method="post">
	商品名称：<input type="text"  name="consumename"> 
	起始价格：<input type="text"  name="beginPrice">
	最大价格：<input type="text"  name="endPrice">
	<input type="submit">
</form>
</body>
</html>