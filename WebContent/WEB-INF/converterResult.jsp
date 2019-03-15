<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Wynik konwersji:
	<%=(Double) request.getAttribute("conversionResult")%>
	<p><a href="<%=request.getContextPath()%>/TempConvServlet">Powrót do konwertera</a></p>
</body>
</html>