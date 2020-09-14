<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>


<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<c:url value="/css/custom.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-expand-md navbar-dark fixed-top" style="background-color:olivedrab">
        <a class="navbar-brand " href="index.html">
            <h3>TransferMoney</h3>
        </a>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link active" href="/login">Sign In</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/register">Sign Up</a>
            </li>
        </ul>
    </nav>


        <div>
            <img src="/img/money.jpg" class="img-fluid" alt="Responsive image">
            <div class="carousel-caption ">

 <div class="inner-caption">
                <h3>Send Money anywhere in the world</h3>
               <h3>The TransferMoney&apos;s proprietary global transfer network includes its easy-to-use application,
                                  which makes the process of sending money faster, easier, more transparent and less costly by eliminating the
                                  forms, codes, agents, extra time and fees typical of the traditional, century-old money transfer process.  </h3></br>
                <a class="btn btn-success btn-xs" href="jsp/login.jsp" >Send Money</a>

                </div>
                 </div>


    <footer class="container">
        <p>&copy; TransferMoney-2020</p>
    </footer>



	<!-- <script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
</body>

</html>
