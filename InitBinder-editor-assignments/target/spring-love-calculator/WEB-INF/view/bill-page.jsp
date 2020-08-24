<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>testing</title>

<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

</head>
<body>


	<h1 align="center">Bill</h1>
	<hr />

	<form:form action="process-bill" modelAttribute="billDTO">
		<div align="center">
           
           	<p>
				<label>Credit Card</label>
				<form:input path="creditCard" />
				<form:errors path="creditCard" cssClass="error"/>
			</p>
       
			<p>
				<label>Amount</label>
				<form:input path="amount" />
				<form:errors path="amount" cssClass="error"/>
			</p>

			<p>
				<label for=cn>Currency </label>
				<form:input id="cn" path="currency" />
				<form:errors path="currency" cssClass="error"/>
			</p>

            <p>
				<label for=dt>Date </label>
				<form:input id="dt" path="date" />
				<form:errors path="date" cssClass="error"/>
			</p>
			
			<input type="submit" value="pay bill">

		</div>
	</form:form>

<div align="left">
<label style="color: red;">Assignment</label>
<ol>
 <li>Write a credit card editor/converter to replace the credit card formatter</li>
 <li>Accept the amount in this format ##,###.00. Example 20,000.00</li>
 <li>Users should able to enter the currency in lower cases. Example aud,inr,jpy,usd </li>
 <li>Allow the user to enter the date in the dd-MM-yyyy pattern. Example 01-01-2020</li>
</ol>
</div>

</body>
</html>