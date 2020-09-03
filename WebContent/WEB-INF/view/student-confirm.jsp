<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Lang: ${student.favLang}
	<br>
	<br> Operating System: 
		<ul>
			<c:forEach var="ops" items="${student.opSys}">
				<li>${ops}</li>
			</c:forEach>
		</ul>
</body>
</html>