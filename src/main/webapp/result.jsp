<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Result</title>
</head>
<body style="background-color: #d9d91d;">
<h1>Submitted Data</h1>
<table border="1">
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>Email</td>
        <td><%= request.getParameter("email") %></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><%= request.getParameter("password") %></td>
    </tr>
    <tr>
        <td>Birthday</td>
        <td><%= request.getParameter("birthday") %></td>
    </tr>
    <tr>
        <td>New Student</td>
        <td><%= request.getParameter("newStudent") %></td>
    </tr>
    <tr>
        <td>College</td>
        <td><%= request.getParameter("college") %></td>
    </tr>
    <tr>
        <td>Major</td>
        <td><%= request.getParameter("major") %></td>
    </tr>
    <tr>
        <td>Favorite Color</td>
        <td><%= request.getParameter("color") %></td>
    </tr>
    <tr>
        <td>Terms and Conditions</td>
        <td><%= request.getParameter("terms") != null ? "yes" : "no" %></td>
    </tr>
</table>
</body>
</html>
