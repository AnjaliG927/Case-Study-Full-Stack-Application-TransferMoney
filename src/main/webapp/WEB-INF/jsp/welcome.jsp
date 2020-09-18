<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="header.jsp"/>
<div>
    <img src="${pageContext.request.contextPath}/img/money.jpg" class="img-fluid" alt="Responsive image">
    <div class="carousel-caption ">

        <div class="inner-caption">
            <h3>Send Money anywhere in the world</h3>
            <h3>The TransferMoney&apos;s proprietary global transfer network includes its easy-to-use application,
                which makes the process of sending money faster, easier, more transparent and less costly by eliminating
                the
                forms, codes, agents, extra time and fees typical of the traditional, century-old money transfer
                process. </h3><br>
            <a class="btn btn-success btn-xs" href="login">Send Money</a>

        </div>
    </div>

</div>
    <jsp:include page="footer.jsp"/>



