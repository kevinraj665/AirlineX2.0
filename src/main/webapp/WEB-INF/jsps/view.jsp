<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Lead</title>
</head>
<body>
<h2>New Lead</h2>
<form action="savelead" method="post">

<pre>
     First name    =<input type="text" name="fname"/>
     
     Last name     =<input type="text" name="lname"/>
     
     Email        =<input type="text" name="email"/>
     
     Mobile       =<input type="text" name="mobile"/>
     
     
     <input type="submit" value="save lead"/>
    
</pre>
 </form>
</body>
</html>