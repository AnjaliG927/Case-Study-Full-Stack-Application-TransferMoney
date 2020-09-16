<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <title>User Dashboard</title>

<jsp:include page="header_user.jsp"/>

<h1>Welcome! ${userFirstName}</h1>

<jsp:include page="footer.jsp"/>