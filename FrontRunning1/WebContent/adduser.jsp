<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<%
String message=(String)request.getAttribute("mymessage"); //downcasting
out.println(message+"<br>");

%>

Please fill up your Details:
<form action="registerme" method="post">
FullName:<input type="text" name="FullName"><br>
EmailId:<input type="text" name="EmailId"><br>
Password:<input type="password" name="Password"><br>
RetypePassword:<input type="password" name="RetypePassword"><br>
<br><input type="submit" value="Register Me">
</form>
</body>
</html>