<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <h1 style="color:red;text-align: center">Student registration</h1>
    <form:form commandName="stuCmd">
    Student No::<form:input path="sno"/><form:errors path="sno"/><br>
    Student Name::<form:input path="sname"/><form:errors path="sname"/><br>
    Student DOB::<form:input path="dob"/><form:errors path="dob"/><br>
    Student DOJ::<form:input path="doj"/><form:errors path="doj"/><br>
    Student DOM::<form:input path="dom"/><form:errors path="dom"/><br>
    <input type="submit" value="Register"/>
    </form:form>
