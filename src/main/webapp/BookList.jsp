<%@page import="java.util.ArrayList" %>
<%@page import="web.model.Book, java.util.List" %>


 <%@include file="Menu.jsp" %>
 
 
 <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Title</th>
      <th scope="col">Author</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <%  List <Book> books=(List<Book>)request.getAttribute("book_list");
      if(books == null) books = new ArrayList<Book>();
      for(Book book : books)
      {
  %>
    <tr>
      <th scope="row"><%=book.getTitle() %></th>
      <td><%=book.getAuthor() %></td>
      <td><%=book.getPrice()%></td>
     
      <td></td>
    </tr>
   <%} %>
  </tbody>
</table>
 

	</body>
</html>