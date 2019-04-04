<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <h2 style="color:red;text-align: center">CRUD Operations</h2>
    
    <form action="user.htm" method="post">
   Cno:: <input type="text" name="cno"/><br>
   Cname:: <input type="text" name="cname"><br> 
    Cadd:: <input type="text" name="cadd"/><br>
    Desg::<input type="text" name="desg"><br><br><br><br>
    <input type="submit" value="insert" name="s1">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="update" name="s1"><br>
        <input type="submit" value="delete" name="s1">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="view" name="s1"><br>
    </form>
    <br><br><br><br><br>
    

   <c:if test="${!empty resMsg }">
       <h2 style="color:red;text-align: center">${resMsg}</h2>
   </c:if>