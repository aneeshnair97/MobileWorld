<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
    </head>
    <body>
   <jsp:include page="Header.jsp"></jsp:include>
        <h3 align="center">LogIn </h3>
        <form action="LoginController" method="get">
<table align="center" border="1">
<tr>
<td colspan="2">Username<input type="text" name="uname" required></td>
</tr>

<tr>
<td colspan="2">Password<input type="password" name="passwd" required></td>
</tr>
 <tr>
<td align="center" colspan="2"><input type="submit" value="SUBMIT"></td>
</tr>

</table>
            </form>
        

</body>
</html>
<jsp:include page="Footer.jsp"></jsp:include>