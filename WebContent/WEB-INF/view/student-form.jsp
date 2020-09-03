<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration From</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name:	<form:input path="firstName" />
		<br>
		<br>
	Last Name:	<form:input path="lastName" />
		<br>
		<br>
	Country:	<form:select path="country">
					<form:options items="${student.countryOptions}"/>
				</form:select>
		<br>
		<br>
	Favorite Language: 
		<form:radiobuttons items="${student.favLangOptions}" path="favLang"/>
		<br>
		<br>
	Operating System:
		<form:checkboxes items="${student.opSysOptions}" path="opSys"/>
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>