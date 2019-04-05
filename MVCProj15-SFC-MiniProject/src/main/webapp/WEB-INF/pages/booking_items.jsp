<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    <h1 style="color:cyan;text-align: center">Book Items</h1>
    <div align="center">
    <table border="1" bgcolor="lightcyan" width="300" height="300"> 
    <form:form commandName="custCmd">
    Customer Id:: <form:input path="cid"/><form:errors path="cid"/><br>
    Customer Name:: <form:input path="cname"/><form:errors path="cname"/><br>
    Gender:: <form:radiobuttons path="gender" items="${gendersList}"/><br>
    Date Of Booking:: <form:input path="dob"/><form:errors path="dob"/><br>
    Items::<form:select path="items">
    <form:options items="${booksList}"/>
    </form:select><br>
    Deliver Type:: <form:radiobuttons path="deliver" items="${deliverList}"/><br>
    Country:: <form:select path="country">
    <form:options items="${countriesList}"/>
    </form:select><form:errors path="country"/><br>
   State:: <form:input path="state"/><form:errors path="state"/><br>
   Address:: <form:input path="address"/><form:errors path="address"/><br>
	<input type="submit" value="Book"/>

    </form:form>
    </table>
</div>
 