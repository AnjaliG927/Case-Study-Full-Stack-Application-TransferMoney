<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>User Dashboard</title>

<jsp:include page="header_user.jsp"/>
<div class="container">
<form:form method="POST" action="sendMoney" >
<h2 style="left:50px;">Welcome! ${sessionScope.currentUser}</h2>
<h3 style="text-align:center">Send Money Online</h3>

    <div class="container">
    <h4>Your receiver&apos;s country and send amount</h4>
         <div class="form-group">
           <label><b>From</b></label>
           <input class="form-control mb-3" type="text" placeholder="United States (USD)" readonly>
           <label for="toCountry"><b>Send to</b></label>
             <spring:bind path="toCountry">
           <select class="form-control" id="toCountry" path="toCountry" name="dropdown" onchange="currencyConverter();" size="width:300px;">
             <option value="">Select a country</option>
             <option value="AUD">Australian dollar(AUD)</option>
             <option value="CNY">China (CNY)</option>
             <option value="INR">India (INR)</option>
             <option value="CAD">Canadian dollar (CAD)</option>
             <option value="EUR">Europe (EUR)</option>
             <option value="AED">UAE (AED)</option>
             <option value="PHP">Philippines (PHP)</option>
           </select>
             </spring:bind>
         </div>
       </div>

       <div class="container">
         <div><b>$1 = <span id="display"></span></b></div>
       </div>

       <div class="container">
         <div class="row">
           <div class="col">
             <div class="input-group mb-3">
                 <spring:bind path="fromAmount">
               <input type="text" class="form-control" path="fromAmount" id="sendAmount" onkeyup="calculate();" placeholder="Send amount"
                 aria-label="Send amount" aria-describedby="basic-addon2">
                 </spring:bind>
             </div>
           </div>
           <div class="col">
               <spring:bind path="toAmount">
             <input type="text" class="form-control" path="toAmount" placeholder="receive amount" id="receiveAmount">
               </spring:bind>
           </div>

         </div>
         <div class="text-center">
           <input class="btn btn-primary" type="submit" value="Send Money">
         </div>
       </div>



     </form:form>



 <script src="js/currency.js"></script>
<jsp:include page="footer.jsp"/>