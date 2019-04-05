<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h2 style="color:red;text-align: center">Form Page1</h2>
    <form:form commandName="regCmd">
    Name::<form:input path="name"/><br>
    Addrs::<form:input path="addrs"/><br>
    Desg::<form:input path="desg"/><br>
    Salary::<form:input path="salary"/><br>
    <input type="submit" value="next" name="_target1">
    <input type="submit" value="cancel" name="_cancel">
    </form:form>