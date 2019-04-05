<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
<c:when test="${!empty listDTO }">
<table border="1">
<tr>
<th>eid</th><th>ename</th><th>desg</th><th>salary</th><th>deptno</th><th>mgr</th>
</tr>
<c:forEach var="emp" items="${listDTO }">
<tr><td>${emp.eid }</td><td>${emp.ename }</td><td>${emp.desg }</td><td>${emp.salary }</td><td>${emp.deptno }</td><td>${emp.mgr }</td></tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">Invalid Inputs</h1>
</c:otherwise>
</c:choose>

<br><br>
<a href="home.htm">home</a>