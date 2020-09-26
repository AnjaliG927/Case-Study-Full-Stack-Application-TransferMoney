<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="header_user.jsp"/>

<div>
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">From country</th>
            <th scope="col">To country</th>
            <th scope="col">Recipient Name</th>
            <th scope="col">Amount</th>
            <th scope="col">Status</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="transacList">
            <tr>
                <th scope="row">${(list.indexOf(transacList))+1}</th>
                <td>${transacList.fromCountry}</td>
                <td>${transacList.toCountry}</td>
                <td>${transacList.recipientDetails.recipientname}</td>
                <td>${transacList.amount}</td>
                <td>${transacList.status}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<jsp:include page="footer.jsp"/>