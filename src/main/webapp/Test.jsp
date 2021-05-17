<%@ page errorPage="err.jsp" %>
<%@include file="Menu.jsp" %>
<% String Msg1 = (String)request.getAttribute("Msg");%>

<h1><%=  Msg1  %></h1>

<h1> <%= 5/0%>   </h1>

 


</body>
</html>