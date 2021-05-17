<%@ page import="web.model.Book" %>


<% Book book=(Book)request.getAttribute("book");
   if(book==null) book = new Book();
%>


 <%@include file="Menu.jsp" %>
 
 


<div class="w-50 h-50 p-3" style="background-color: #eee; margin-left: 25%; margin-top:40px">

<form action="book?action=insert" method="post" >
    <div class="form-group">
        <label for="id">Book Id</label>
        <input  class="form-control" id="id" name="id"  value="<%= book.getId()==null?"":book.getId() %>" disabled="disabled">
    </div>
    
     <div class="form-group">
        <label for="bookTitle">Book Title</label>
        <input  class="form-control" id="bookTitle" name="bookTitle"  value="<%=book.getTitle()==null?"":book.getTitle() %>">
    </div>
    
      <div class="form-group">
        <label for="bookAuthor">Book Author</label>
        <input  class="form-control" id="bookAuthor" name="bookAuthor"  value="<%=book.getAuthor()==null?"":book.getAuthor()%>">
    </div>
    
     <div class="form-group">
        <label for="bookPrice">Book Price</label>
        <input  class="form-control" id="bookPrice" name="bookPrice"  value="<%=book.getPrice()==null?"":book.getPrice()%>">
    </div>
    
    
   
    <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</div>
</body>
</html>