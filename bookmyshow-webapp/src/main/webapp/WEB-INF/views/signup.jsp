<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Signup</title></head>
<body>
<h2>Signup</h2>
<form:form method="post" modelAttribute="signupRequest">
    Name: <form:input path="name"/><br/><br/>
    Email: <form:input path="email"/><br/><br/>
    Password: <form:password path="password"/><br/><br/>
    <input type="submit" value="Signup"/>
</form:form>
</body>
</html>
