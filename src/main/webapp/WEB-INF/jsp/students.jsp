<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ include file="header.jsp" %>
<div class="min-h-screen bg-gray-100 p-6">

    <div class="max-w-2xl mx-auto bg-white shadow-lg rounded-2xl p-6">

        <h1 class="text-2xl font-bold mb-4 text-center">Students</h1>

        <c:if test="${empty students}">
            <div class="bg-yellow-100 text-yellow-800 p-3 rounded-lg mb-4">
                No students found
            </div>
        </c:if>

        <c:if test="${not empty students}">
            <ul class="space-y-2 mb-6">
                <c:forEach var="s" items="${students}">
                    <li class="bg-gray-50 p-3 rounded-lg shadow-sm hover:bg-gray-100 transition">
                        ${s.name}
                    </li>
                </c:forEach>
            </ul>
        </c:if>

        <h2 class="text-xl font-semibold mb-3">Add Student</h2>

        <form method="post" action="students/add" class="flex gap-2">
            <input 
                type="text" 
                name="name"
                placeholder="Enter name"
                class="flex-1 border border-gray-300 rounded-lg px-3 py-2 focus:outline-none focus:ring-0 focus:ring-blue-400"
                />

            <button 
                type="submit"
                class="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600 transition"
                >
                Save
            </button>
        </form>

    </div>
    <div class="mt-10">
        <div class="text-center">
            <a href="<c:url value='/' />" 
               class="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600">
                Torna alla home
            </a>
        </div>
    </div>

</div>

<%@ include file="footer.jsp" %>