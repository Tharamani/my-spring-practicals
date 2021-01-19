<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>

<html>

	<head>
	 <title>Customer Confirmation</title>
	</head>
	
	<body>
	
		Customer is confirmed : ${customer.firstName} ${customer.lastName}
		<br>
		Free passes: ${customer.freePasses}
		<br>
		Postal Code: ${customer.postalCode}
		<br>
		Course code: ${customer.courseCode}
	</body>
</html>