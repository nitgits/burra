<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h2 style="color:green;text-align: center">Registration</h2>
    
    <form:form commandName="regCmd">
   CNo:: <form:input path="cno"/><br>
   CName:: <form:input path="cname"/><br>
  Gender::  <form:radiobuttons path="gender" items="${gendersList }" /><br> 
   Hobbies:: <form:checkboxes items="${hobbiesList }" path="hobbies"/><br>
    Courses::<form:select path="courses" multiple="true">
    <form:options items="${coursesList }"/>
    </form:select><br>
   Countries:: <form:select path="countries">
    <form:options items="${countriesList }"/>
    </form:select><br>
    
    <input type="submit" value="Register"/>
    </form:form>
<br>
<h2 style="color:green;text-align: center">${resMsg }</h2>