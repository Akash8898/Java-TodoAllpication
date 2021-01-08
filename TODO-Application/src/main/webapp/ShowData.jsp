

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="com.Todolist.web.model.DataModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type=checkbox]:checked + .strikethrough{
  text-decoration: line-through;
}
</style>
<script>
	function callDelete()
	{
		document.forms[0].action="update"
		document.forms[0].submit();
	}

</script>   
</head>
<body>
    

        <h1>To-Do list</h1>
     <form action="control" method="get">
            <input name="todoInput" placeholder="Enter data to add">
            <input type="submit" value="Add">
     </form>
     
<table border="1" align="center" cellpadding="10">
<thead>
<tr><td>Check</td><td>ID</td><td>TASK</td><td>Status</td><td>Action</td></tr>
</thead>
<tbody>



<%
	int id,check,i;
	String todo,stat;
	boolean status;
	DataModel datamod = new DataModel();
	List<DataModel> list = (List<DataModel>)request.getAttribute("data");
	check = list.size();
	for(i = 0; i<check ;i++)
	{
		datamod = list.get(i);
		id = datamod.getId();
		todo = datamod.getTodo();
		status = datamod.isStatus();
		if(status)
			stat = "Completed";
		else
			stat = "pending";
				
		out.println("<tr><td><input type=\"checkbox\" name =\"check\"id = \"status\"</td<td><label for=\"status\" class=\"strikethrough\">Mark as Done</label></td><td>" +
				id + "</td><td>" + todo + "</td><td>" + stat + 
				"</td><td><input type=\"submit\" name = \"button\"value=\"Delete-" +id+" \" onclick=\"callDelete()\">");
		
		
	}
   	
%>
</tbody>
</table>
 
</body>
</html>