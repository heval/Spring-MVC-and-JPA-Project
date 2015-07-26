<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Uye Ol</title>
    <meta charset="utf-8"/>
</head>
<body>
<h1>Uyelik Formu</h1>

<form:form method="POST" action="/register" modelAttribute="user" commandName="register">
    <table>
        <form:hidden path="id"/>
        <tr>
            <td><form:label path="userName">Name</form:label></td>
            <td><form:input path="userName" /></td>
            <td style="color:red"><form:errors path="userName" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email</form:label></td>
            <td><form:input path="email" /></td>
            <td style="color:red"><form:errors path="email" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="password">password</form:label></td>
            <td><form:password path="password" /></td>
            <td style="color:red"><form:errors path="password" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age" /></td>
            <td><form:errors path="age" delimiter=" ,"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>