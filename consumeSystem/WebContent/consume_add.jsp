<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>录入消费信息</title>
</head>
<body>
<b>消费管理系统</b>
<hr>
	<form action="add.action" method="post">
		<table>
		<tr>
			<th colspan="2">
				<span>请录入消费信息</span>
			</th>
		</tr>
		<tr>
			<td>
				商品名称：
			</td>
			<td>
				<input type="text" name="consumename">
			</td>
		</tr>
		<tr>
			<td>
				价格：
			</td>
			<td>
				<input type="text" name="consumeprice" id="consumePrice" onblur="checkPrice(this)"> （单位：元）
				<div id="hint"></div>
			</td>
		</tr>
		<tr>
			<td>
				数量：
			</td>
			<td>
				<input type="text" name="consumecount" id="consumeCount" onblur="checkCount(this)">
				<div id="hintc"></div>
			</td>
		</tr>
		<tr>
			<td>
				消费类型：
			</td>
			<td>
				<select name="consumetype">
					<c:forEach items="${categoryinfos }" var="categoryinfo">
						<option value="${categoryinfo.categoryid }">
							${categoryinfo.categoryname }
						</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>
				消费日期：
			</td>
			<td>
				<input type="text" name="consumedate">
			</td>
		</tr>
		<tr>
			<td>
				备注信息：
			</td>
			<td>
				<textarea rows="1" cols="10" name="remark"></textarea>
				<!-- <input type="text" name="remark"> -->
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="录入" onclick="return checkall()">
			</td>
			<td>
				<input type="reset" value="重填">
			</td>
		</tr>
	</table>
	</form>
</body>
<script type="text/javascript">
function checkall(){
	return checkPrice()&&checkCount();
}
//验证数量正则
function checkCount() {
    var value = document.getElementById("consumeCount").value;
    console.log(value);
    var reg = /^[1-9]\d*$/;
    var div = document.getElementById("hintc");
    if(reg.test(value)) {
        div.innerHTML="正确";
        return true;
    } else {
        div.innerHTML="错误";
        return false;
    }
}
//验证价钱
function checkPrice() {
    var value = document.getElementById("consumePrice").value;
    console.log(value);
    var reg = /(^[1-9]\d*(\.\d{1,2})?$)|(^0(\.\d{1,2})?$)/;
    var div = document.getElementById("hint");
    if(reg.test(value)) {
        div.innerHTML="正确";
        return true;
    } else {
        div.innerHTML="错误";
        return false;
    }
}
</script>
</html>