<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@include file="Menu.jsp" %>


<div class="w-50 h-50 p-3" style="background-color: #eee; margin-left: 25%; margin-top:40px">

<form action="Go" >
    <div class="form-group">
        <label for="login">Email</label>
        <input  class="form-control" id="login" name="login" placeholder="Email">
    </div>
    <div class="form-group">
        <label for="passwd">Password</label>
        <input type="password" class="form-control" id="passwd" name="passwd" placeholder="Password">
    </div>
    <div class="form-group">
        <label class="form-check-label"><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</div>
</body>
</html>