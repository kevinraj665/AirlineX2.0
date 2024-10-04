<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Lead</title>
</head>
<body bg color="blue">
<h2>New Lead</h2>
<form action="updateleaddata" method="post">
<pre>


             ID    =<input type="text" name="id" value="${lead1.id}"/>
             
     First name    =<input type="text" name="fname" value="${lead1.fname}"/>
     
     Last name     =<input type="text" name="lname" value="${lead1.lname}"/>
     
     Email         =<input type="text" name="email" value="${lead1.email}"/>
     
     Mobile        =<input type="text" name="mobile" value="${lead1.mobile}"/>
     
     
     <input type="submit" value="save lead"/>
    
</pre>
 </form>
</body>
</html>