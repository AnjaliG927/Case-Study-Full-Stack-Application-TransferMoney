<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>User Dashboard</title>

<jsp:include page="header_user.jsp"/>
<form:form method="POST" action="send" >
<h2 style="left:50px;">Welcome!${sessionScope.currentUser}</h2>
    <div id="box" >
        <h2 style="text-align: center">Send Money</h2>
        <table style="margin: 0px auto">
            <tr>
                <td>
                    <label>From</label>
                    <input id="fromAmount" type="text" size="15" placeholder="USD" value="USD">
                </td>
                <td>
                    <select  id="from" onchange="currencyConverter();">
                        <label>To</label>
                        <option value="AUD">Australian Dollar(AUD)</option>
                    </select>
                </td>
                <td></td>
            </tr>
            <tr> <td>
                <input id="toAmount" type="text" size="15" placeholder="USD" disabled>
            </td>
                <td>
                    <select id="to" onchange="currencyConverter();">
                        <option value="AUD">Australian Dollar(AUD)</option>
                    </select>
                </td></tr>
            <tr>
            <input type="submit" value="Send">
            </tr>
        </table>
    </div>
</form:form>


<jsp:include page="footer.jsp"/>