<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Konwerter : Fahrenheit z/do Celsius</h1>
	<!-- action - @WebServlet("/TempConvServlet") -->
	<!-- method - protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException -->
	<form action="TempConvServlet" method="post">
		<p>
			<label>Wybierz konwersję: </label> <select name="conversionOptions">
				<option value="celsius">na stopnie Celcjusza</option>
				<option value="fahrenheit">na stopnie Fahrenheita</option>
			</select>
		</p>
		<p>
			<label>Podaj wartość : </label> <input type="text"
				name="conversionValue" />
		</p>
		<!-- Wyślij dane formularza -->
		<input type="submit" />
	</form>
</body>
</html>