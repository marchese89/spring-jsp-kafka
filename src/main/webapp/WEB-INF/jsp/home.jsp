<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<h1 class="text-2xl text-center mb-10">Spring MVC funzionante</h1>
<div class="text-center">
    <a href="<c:url value='/students' />" 
       class="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600">
        Vai agli studenti
    </a>
</div>
<%@ include file="footer.jsp" %>