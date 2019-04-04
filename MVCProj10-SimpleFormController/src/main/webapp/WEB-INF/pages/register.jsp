<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <table border="1" bgcolor="cyan" align="center">
    <form:form method="POST" commandName="custCmd">
   Customer Name:: <form:input path="cname"/><br>
    Customer Address::<form:input path="cadd"/><br>
   Customer Number:: <form:input path="mobileno"/><br>
  Customer BillAmt::  <form:input path="billamt"/>
    <br>
    <input type="submit" value="Register"/>
    </table>
    </form:form>