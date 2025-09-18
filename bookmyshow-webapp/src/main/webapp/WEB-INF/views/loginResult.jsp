<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Login Result</title></head>
<body>
<h2>Login Successful!</h2>
<p>Welcome back, User ID: ${resp.userId}</p>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
