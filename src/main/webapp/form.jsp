<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>School Form</title>
</head>
<body style="background-color: #46abe1;">
<h1>School Form</h1>
<form action="register" method="post">

    <label for="email">Email:</label><br/>
    <input type="email" name="email" id="email" required/><br/><br/>


    <label for="password">Password:</label><br/>
    <input type="password" name="password" id="password" required/><br/><br/>


    <label for="birthday">Birthday:</label><br/>
    <input type="date" name="birthday" id="birthday"/><br/><br/>


    <label>New Student?</label><br/>
    <input type="radio" name="newStudent" value="yes" checked/> Yes
    <input type="radio" name="newStudent" value="no"/> No<br/><br/>


    <label for="college">College:</label><br/>
    <input type="text" name="college" id="college"/><br/><br/>


    <label for="major">Major:</label><br/>
    <select name="major" id="major">
        <option value="Computer Science">Computer Science</option>
        <option value="Math">Math</option>
        <option value="Business">Business</option>
        <option value="English">English</option>
    </select><br/><br/>

    <label for="color">Favorite Color:</label><br/>
    <input type="color" name="color" id="color" value="#ffffff"/><br/><br/>

    <!-- Terms and Conditions -->
    <label for="terms">Agree to Terms and Conditions:</label>
    <input type="checkbox" name="terms" id="terms" value="yes"/><br/><br/>


    <button type="reset">Reset Form</button>
    <button type="submit">Submit Form</button>
</form>
</body>
</html>
