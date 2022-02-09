  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>  
<body>
<p>Enter details:</p>  
<form:form action="silogic" method="POST">  
<label>Principal :</label>
<input type="number" name="p" />
<br>
<label>Rate :</label>
<input type="number" name="r" />
<br>
<label>Time :</label>
<input type="number" name="t" />
<br>
<input type="submit" value="Submit" >
</form:form>
</body>  
</html>



