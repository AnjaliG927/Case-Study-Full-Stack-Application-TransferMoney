<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>User profile</title>

<jsp:include page="header_user.jsp"/>

<div class="container center_div">
    <div class="row">
        <div class="col-sm-12">
            <span style="color:#0000FF; text-align: center">${message}</span>
            <form:form method="POST" action="editForm/${sessionScope.currentUser}" modelAttribute="edit" class="form-signin">
                <h2 class="form-signin-heading">Edit your profile</h2>
                <h5 class="form-signin-heading">Reset Password</h5>
                <spring:bind path="password">
                    <label for="pass" style="margin-top: 2px;">New Password</label>
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="password" path="password" class="form-control" id="pass"
                                    placeholder="Password"/>
                        <form:errors path="password"/>
                    </div>
                </spring:bind>

                <spring:bind path="passwordConfirm">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <label for="confirm" style="margin-outside: 2px;">Confirm Password</label>
                        <form:input type="password" path="passwordConfirm" id="confirm" class="form-control"
                                    placeholder="Confirm your password"/>
                        <form:errors path="passwordConfirm"/>
                    </div>
                </spring:bind>
                <spring:bind path="email">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <label for="email" style="margin-outside: 2px;">Email</label>
                        <form:input type="text" path="email" class="form-control" id="email" placeholder="Email Id"
                                    autofocus="true"/>
                        <form:errors path="email"/>
                    </div>
                </spring:bind>
                <button class="btn btn-primary btn-lg btn-block" type="submit">Save</button>

            </form:form>

        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>