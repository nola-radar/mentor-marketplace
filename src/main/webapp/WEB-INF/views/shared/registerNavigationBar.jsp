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
    </div>
</nav>