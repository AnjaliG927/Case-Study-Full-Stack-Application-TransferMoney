<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header_user.jsp"/>

<form action="/charge" method="post"  id="payment-form">
   <input type="hidden" name="token" />
       <div class="group">
         <label>
           <span>Card number</span>
           <div id="card-number-element" class="field"></div>
           <span class="brand"><i class="pf pf-credit-card" id="brand-icon"></i></span>
         </label>
         <label>
           <span>Expiry date</span>
           <div id="card-expiry-element" class="field"></div>
         </label>
         <label>
           <span>CVC</span>
           <div id="card-cvc-element" class="field"></div>
         </label>
         <label>
           <span>Postal code</span>
           <input id="postal-code" name="postal_code" class="field" placeholder="90210" />
         </label>
       </div>
       <button id="pay" type="submit">Pay $25</button>
       <div class="outcome">
         <div class="error"></div>
         <div class="success">
           Success! Your Stripe token is <span class="token"></span>
         </div>
       </div>
</form>
<jsp:include page="footer.jsp"/>