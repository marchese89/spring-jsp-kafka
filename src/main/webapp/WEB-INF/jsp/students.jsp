<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Students</h1>

<ul>
    <c:forEach var="s" items="${students}">
        <li>${s.name}</li>
    </c:forEach>
</ul>

<hr/>

<h2>Add Student</h2>

<form method="post" action="students/add">
    Name: <input type="text" name="name"/>
    <button type="submit">Save</button>
</form>