<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-default navbar-static-top navbar-bg-darkblue" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <img class="brand" alt="Mentor Marketplace" src="<c:url value="/resources/img/Nav_Bar_Logo.png" />"
                 id="navBarLogo" />
        </div>

        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/"/>">Mentor Marketplace</a>
        </div>

        <div class="navbar-right">
            <c:url value="/logout" var="logoutUrl" /> 
            <form:form action="${logoutUrl}" method="POST">
                <button type="submit" class="btn btn-success" id="navBarLogOutButton">LOG OUT</button>
            </form:form>
        </div>

        <div class="navbar-right" id="navBarProfileButton">
            <a href="<c:url value="/user/profile"/>">
                <button class="btn btn-success">MY PROFILE</button>
            </a>
        </div>

        <div class="navbar-right">
            <sec:authorize access="hasRole('ROLE_MENTOR')">
                <a href="<c:url value="/explore/founders"/>">
                    <button type="button" class="btn btn-success" id="navBarExploreButton">EXPLORE FOUNDERS</button>
                </a>
            </sec:authorize>
            <sec:authorize access="hasRole('ROLE_FOUNDER')">
                <a href="<c:url value="/explore/mentors"/>">
                    <button type="button" class="btn btn-success" id="navBarExploreButton">EXPLORE MENTORS</button>
                </a>
            </sec:authorize>
        </div>
    </div>
</nav>