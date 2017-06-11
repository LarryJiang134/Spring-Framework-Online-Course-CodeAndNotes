<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registeration Form</title>
</head>

<body>

    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />
        
        <br><br>
        
        Country:
        
        <form:select path="country">

            <%--
            <form:option value="China" label="China" />
            <form:option value="USA" label="USA" />
            <form:option value="Russia" label="Russia" />
            <form:option value="UK" label="UK" />
            <form:option value="France" label="France" />
            --%>

            <form:options items="${student.countryOptions}" />
            
        </form:select>

        <br><br>

        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Jave" />
        C# <form:radiobutton path="favoriteLanguage" value="C" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br><br>

        <input type="submit" value="Submit" />

    </form:form>

</body>

</html>