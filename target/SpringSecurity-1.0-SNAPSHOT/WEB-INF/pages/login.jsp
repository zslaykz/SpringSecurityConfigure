<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tmp/header.jsp"%>

login
<br>
<br>
<form action="/login" method="post">
    <input type="text" name="username" id="username">
    <input type="password" name="password" id="password">
    <input type="submit" value="login">
    <input type="hidden"
           name="${_csrf.parameterName}"
           value="${_csrf.token}"/>

</form>


<%@include file="tmp/footer.jsp"%>