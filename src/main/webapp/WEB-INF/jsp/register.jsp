<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <title>Create an account</title>

<jsp:include page="header.jsp"/>
<div class="container center_div">
<div class="row">
<div class="col-sm-12">

    <form:form method="POST" modelAttribute="userForm" class="form-signin">
        <h2 class="form-signin-heading">Create your account</h2>

        <spring:bind path="firstName">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <form:input type="text" path="firstName" class="form-control" placeholder="First name" autofocus="true"></form:input>
                        <form:errors path="firstName"></form:errors>
                    </div>
                </spring:bind>
        <spring:bind path="lastName">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                 <form:input type="text" path="lastName" class="form-control" placeholder="Last name" autofocus="true"></form:input>
                 <form:errors path="lastName"></form:errors>
            </div>
         </spring:bind>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="username" class="form-control" placeholder="Username" autofocus="true"></form:input>
                <form:errors path="username"></form:errors>
            </div>
        </spring:bind>
        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                <form:errors path="password"></form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password" path="passwordConfirm" class="form-control" placeholder="Confirm your password"></form:input>
                <form:errors path="passwordConfirm"></form:errors>
            </div>
        </spring:bind>
        <spring:bind path="email">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                 <form:input type="text" path="email" class="form-control" placeholder="Email Id" autofocus="true"></form:input>
                 <form:errors path="email"></form:errors>
            </div>
        </spring:bind>
        <spring:bind path="birthdate">
             <div class="form-group ${status.error ? 'has-error' : ''}">
                  <form:input type="date" path="birthdate" class="form-control" placeholder="birthdate" autofocus="true" ></form:input>
                  <form:errors path="birthdate"></form:errors>
             </div>
        </spring:bind>

        <spring:bind path="gender">
              <div class="form-group ${status.error ? 'has-error' : ''}">
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="M" >
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
                  <form:errors path="gender"></form:errors>
               </div>
        </spring:bind>

        <button class="btn btn-primary btn-lg btn-block" type="submit">Register</button>
    </form:form>
<jsp:include page="footer.jsp"/>



