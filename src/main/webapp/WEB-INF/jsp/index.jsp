<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: MehmetEfe
  Date: 12.12.2021
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Lokumcu Baba Franchise Application Form</title>
</head>
<body>
<h1>Lokumcu Baba Franchise Application Form</h1>
<form action="posted" method="post">
    <table style="with: 50%">
        <tr>
            <td>Name&Surname</td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>Identity Number</td>
            <td><input type="text" name="IdentityNum" /></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" /></td>
        </tr>
        <tr>
            <td>Phone Number</td>
            <td><input type="text" name="phone" /></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address" /></td>
        </tr>
        <tr>
            <td>Date of Birth</td>
            <td><input type="date" name="dob" value="${dob}"></td>
        </tr>
        <tr>
            <td>Were you ever involved with retail trade?</td>
            <td><textarea rows="5" name="q1"></textarea></td>
        </tr>
        <tr>
            <td>What is your reason for preferring Lokumcu Baba?</td>
            <td><textarea rows="5" name="q2"></textarea> </td>
        </tr>
        <tr>
            <td>Which City/district are you considering a franchise for?</td>
            <td><textarea rows="5" name="q3"></textarea></td>
        </tr>
        <tr>
            <td>What is your sum of investment?</td>
            <td><textarea rows="5" name="q4"></textarea></td>
        </tr>
        <tr>
            <td>Anything you would like to add?</td>
            <td><textarea rows="5"  name="q5"></textarea></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
