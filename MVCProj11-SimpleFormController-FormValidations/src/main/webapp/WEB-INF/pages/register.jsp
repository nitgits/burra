<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <script type="text/javascript" src="validation.js">
<!--

//-->
</script>
   <style>
span {
	color:red;
	font-size:15px;
	font-family: vardhana;
}
</style>
    <table border="1" bgcolor="cyan" align="center">
    <form:form method="POST" commandName="custCmd" onSubmit="return validate(this)">
   Customer Name:: <form:input path="cname"/><form:errors path="cname"/><span id="nameErr"></span><br>
    Customer Address::<form:input path="cadd"/><form:errors path="cadd"/><span id="addErr"></span><br>
   Customer Number:: <form:input path="mobileno"/><form:errors path="mobileno"/><span id="numberErr"></span><br>
  Customer BillAmt::  <form:input path="billamt"/><form:errors path="billamt"/><span id="amtErr"></span>
  <form:hidden path="vflag"/>
    <br>
    <input type="submit" value="Register"/>
  
    </form:form>
      </table>