<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">


<c:url value="/css/custom.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-expand-md navbar-dark fixed-top" style="background-color:olivedrab">
        <a class="navbar-brand " href="welcome.jsp">
            <h3>TransferMoney</h3>
        </a>
        <ul class="navbar-nav ml-auto">
        <li class="nav-item">
             <a class="nav-link active" href="${pageContext.servletContext.contextPath}/sendMoney" >Send Money</a>
        </li>
        <li class="nav-item">
             <a class="nav-link active" href="${pageContext.servletContext.contextPath}/transferHistory">Transfer History</a>
        </li>
         <li class="nav-item">
                     <a class="nav-link active" href="${pageContext.servletContext.contextPath}/userProfile" >Profile</a>
                </li>
        <li class="nav-item">
              <a class="nav-link active" href="${pageContext.servletContext.contextPath}/logout">Sign out</a>
        </li>

        </ul>
    </nav>
