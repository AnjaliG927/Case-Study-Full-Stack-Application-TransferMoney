<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title>Create an account</title>

<jsp:include page="header.jsp"/>

<div class="container center_div">
    <div class="row">
        <div class="col-sm-12">

            <form:form method="POST" action="save" modelAttribute="userForm" class="form-signin">
                <h2 class="form-signin-heading">Create your account</h2>

                <spring:bind path="firstName">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="firstName" class="form-control" placeholder="First name"
                                    autofocus="true"/>
                        <form:errors path="firstName"/>
                    </div>
                </spring:bind>
                <spring:bind path="lastName">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="lastName" class="form-control" placeholder="Last name"
                                    autofocus="true"/>
                        <form:errors path="lastName"/>
                    </div>
                </spring:bind>
                <spring:bind path="username">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="username" class="form-control" placeholder="Username"
                                    autofocus="true"/>
                        <form:errors path="username"/>
                    </div>
                </spring:bind>
                <spring:bind path="password">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="password" path="password" class="form-control" placeholder="Password"/>
                        <form:errors path="password"/>
                    </div>
                </spring:bind>

                <spring:bind path="passwordConfirm">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="password" path="passwordConfirm" class="form-control"
                                    placeholder="Confirm your password"/>
                        <form:errors path="passwordConfirm"/>
                    </div>
                </spring:bind>
                <spring:bind path="email">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="email" class="form-control" placeholder="Email Id"
                                    autofocus="true"/>
                        <form:errors path="email"/>
                    </div>
                </spring:bind>
                <spring:bind path="birthdate">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="date" path="birthdate" class="form-control" placeholder="birthdate"
                                    autofocus="true"/>
                        <form:errors path="birthdate"/>
                    </div>
                </spring:bind>

                <spring:bind path="gender">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" id="male" value="M">
                            <label class="form-check-label" for="male">
                                Male
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="gender" id="female" value="F">
                            <label class="form-check-label" for="female">
                                Female
                            </label>
                        </div>
                        <form:errors path="gender"/>
                    </div>
                </spring:bind>

                <button class="btn btn-primary btn-lg btn-block" type="submit">Register</button>
            </form:form>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>