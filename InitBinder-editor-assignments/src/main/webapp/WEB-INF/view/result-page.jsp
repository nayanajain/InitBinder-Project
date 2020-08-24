<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1 align="center">Bill</h1>
  <hr/>

    Bill against the credit card number <span style="color: blue"> ${billDTO.creditCard} </span>
    towards amount <span style="color: blue"> ${billDTO.amount} ${billDTO.currency} </span>
    generated dated (on) <span style="color: blue"> ${billDTO.date} </span>
    
</body>
</html>