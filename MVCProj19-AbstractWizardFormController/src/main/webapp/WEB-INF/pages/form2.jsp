<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h2 style="color:red;text-align: center">Form Page2</h2>
    <form:form commandName="regCmd">
    Expected Salary::<form:input path="expectedSalary"/><br>
    Experience::<form:input path="experience"/><br>
     <input type="submit" value="previous" name="_target0">
    <input type="submit" value="next" name="_target2">
    <input type="submit" value="cancel" name="_cancel">
    </form:form>
    
    
