<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Login</title></head>
<body>
<h2>Login</h2>
<form:form method="post" modelAttribute="loginRequest">
    Email: <form:input path="email"/><br/><br/>
    Password: <form:password path="password"/><br/><br/>
    <input type="submit" value="Login"/>
</form:form>
</body>
</html>
