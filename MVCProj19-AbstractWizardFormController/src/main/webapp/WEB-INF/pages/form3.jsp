<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h2 style="color:red;text-align: center">Form Page3</h2>
    <form:form commandName="regCmd">
    Preferred Location::<form:input path="preferredLocation"/><br>

     <input type="submit" value="previous" name="_target1">
      <input type="submit" value="finish" name="_finish">
    <input type="submit" value="cancel" name="_cancel">
    </form:form>
    