
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header_user.jsp"/>

<div class="container">
    <div class="py-5 text-center">
        <h2>Checkout form</h2>
    </div>
 <form class="needs-validation"  action="payment" noValidate>
    <div class="row">
        <div class="col-md-4 order-md-2 mb-4">
            <h4 class="d-flex justify-content-between align-items-center mb-3">
                <span class="text-muted">Summary</span>
                <span class="badge badge-secondary badge-pill">3</span>
            </h4>
            <ul class="list-group mb-3">
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">From Country</h6>
                        <small class="text-muted">USA</small>
                    </div>
                    <span class="text-muted">${amount}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between lh-condensed">
                    <div>
                        <h6 class="my-0">To Country</h6>
                        <small class="text-muted">${toCountry}</small>
                    </div>
                    <span class="text-muted">${amount*exchangeRate}</span>
                </li>

                <li class="list-group-item d-flex justify-content-between bg-light">
                    <div class="text-success">
                        <h6 class="my-0">Service Tax</h6>
                        <small>2%</small>
                    </div>
                    <span class="text-success">+${amount*exchangeRate/10}</span>
                </li>
                <li class="list-group-item d-flex justify-content-between">
                    <span>Total (USD)</span>
                    <span id="totalAmount"><strong>${amount*exchangeRate+amount*exchangeRate/10}</strong></span>
                </li>
            </ul>


        </div>
        <div class="col-md-8 order-md-1">
            <h4 class="mb-3">Billing address</h4>

                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="firstName">First name</label>
                        <input type="text" class="form-control" id="firstName" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            Valid first name is required.
                        </div>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="lastName">Last name</label>
                        <input type="text" class="form-control" id="lastName" placeholder="" value="" required>
                        <div class="invalid-feedback">
                            Valid last name is required.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="username">Username</label>
                    <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text">@</span>
                        </div>
                        <input type="text" class="form-control" id="username" placeholder="Username" required>
                        <div class="invalid-feedback" style="width: 100%;">
                            Your username is required.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="email">Email <span class="text-muted">(Optional)</span></label>
                    <input type="email" class="form-control" id="email" placeholder="you@example.com">
                    <div class="invalid-feedback">
                        Please enter a valid email address.
                    </div>
                </div>


                <hr class="mb-4">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Continue to checkout</button>
            </form>
        </div>
    </div>


    <script src="form-validation.js"></script>




<jsp:include page="footer.jsp"/>


