<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
<c:when test="${!empty prodList }">
<table>
<tr>
<th>Product Id</th><th>Product Name</th><th>Price</th><th>Stock Quantity</th><th>Manufacture Date</th><th>Expiry Date</th>
<c:forEach var="prod" items="${prodList }">
<tr>
<td>${prod.pid }</td>
<td>${prod.pname }</td>
<td>${prod.price }</td>
<td>${prod.stockQty }</td>
<td>${prod.mfgDate }</td>
<td>${prod.expDate }</td>


</c:forEach>
</table>
</c:when>

<c:otherwise>
<h1 style="color:red;text-align: center">Records Not Found</h1>
</c:otherwise>
</c:choose>



