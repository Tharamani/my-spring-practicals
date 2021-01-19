<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<br>
		<br>
		Last name: <form:input path="lastName" />

		<br>
		<br>
				
		Country: <form:select path="country">

			<!-- Read country options from java class student  -->
			<form:options items="${student.countryOptions}" />

			<!-- when options are populated from view page use below code  -->
			<%-- 
					<form:option value="Brazil" label="Brazil" />
					<form:option value="France" label="France" />
					<form:option value="Germany" label="Germany" />
					<form:option value="India" label="India" />
					<form:option value="Japan" label="Japan" />
					 --%>
		</form:select>

		<br>
		<br>
				
					Favorite Language :
					<!-- Read Language options from java class student  -->
					<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
					
					<%-- Java <form:radiobutton path="favoriteLanguage" value="Java" />
					C <form:radiobutton path="favoriteLanguage" value="C" />
					C# <form:radiobutton path="favoriteLanguage" value="C#" />
					PHP <form:radiobutton path="favoriteLanguage" value="PHP" /> --%>

		<br>
		<br>
				
					Operating Systems:
					Linux <form:checkbox path="operatingSystems" value="Linux" />
					Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
					Windows <form:checkbox path="operatingSystems" value="Windows" />

		<br>
		<br>
		<input type="Submit" value="Submit">

	</form:form>
</body>
</html>