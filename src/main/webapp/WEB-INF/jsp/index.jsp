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
    <style type="text/css">
        label{ display: flex; margin-right:20px; margin-top: 10px;}
        input{ display: flex; margin-top:5px; width: 95%; border-radius: 5px;}
        textarea{ display: flex; margin-top:5px; width: 95%;border-radius: 5px;}
        form{display: flex; flex-direction: column; justify-content: center; margin: 0px 30%;background-color: #f7f5f5;padding: 20px;}

    </style>
</head>
<body>

    <form action="posted" method="post">
        <h1>Lokumcu Baba Franchise Application Form</h1>
        <div style="justify-content: center;align-items: center">

            <label >Name&Surname</label>
            <input type="text" name="name" /> <br/>
            <label >Identity Number</label>
            <input type="text" name="IdentityNum" /> <br/>
            <label >Email</label>
            <input type="text" name="email" /> <br/>
            <label >Phone Number</label>
            <input type="text" name="phone" /><br/>
            <label >Address</label>
            <input type="text" name="address" /><br/>
            <label >Date of Birth</label>
            <input  type="date" name="dob" /><br/>
            <label >Were you ever involved with retail trade?</label>
            <textarea rows="5" name="q1"></textarea><br/>
            <label >What is your reason for preferring Lokumcu Baba?</label>
            <textarea rows="5" name="q2"></textarea><br/>
            <label >Which City/district are you considering a franchise for?</label>
            <textarea rows="5" name="q3"></textarea><br/>
            <label >What is your sum of investment?</label>
            <textarea rows="5" name="q4"></textarea><br/>
            <label >Anything you would like to add?</label>
            <textarea rows="5"  name="q5"></textarea><br/>
            <input style="margin: 20px;height: 40px;width: 80px;border-radius: 5px;background-color: #2d7ff9;border:none;color: #fff;font-weight: 700;font-size: 16px;cursor: pointer;" type="submit" value="submit">
        </div>

    </form>
</body>
</html>
