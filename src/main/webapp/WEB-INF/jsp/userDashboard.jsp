<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>User Dashboard</title>

<jsp:include page="header_user.jsp"/>

<h1>Welcome! ${userFirstName}</h1>

<form:form method="POST" action="send" >
    <div id="box">
        <h2>Send Money</h2>
        <table>
            <tr>
                <td>
                    <input id="fromAmount" type="text" size="15" placeholder="USD" value="1">
                </td>
                <td>
                    <select  id="from" onchange="currencyCoverter();">
                        <option value="AUD">Australian Dollar(AUD)</option>
                    </select>
                </td>
            </tr>
            <tr> <td>
                <input id="toAmount" type="text" size="15" placeholder="USD" disabled>
            </td>
                <td>
                    <select id="to" onchange="currencyCoverter();">
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