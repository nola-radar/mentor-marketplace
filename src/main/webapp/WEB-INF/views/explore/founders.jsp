<!-- Header -->
<%@include file="../header.jsp" %>

<!-- Navigation Bar -->
<%@include file="../shared/navigationBar.jsp" %>

<div class="container" id="exploreMainContainer">

    <!-- Top Row -->
    <div class="row">

        <div class="col-sm-12 profileHeader" id="searchHeader">
            <form:form modelAttribute="exploreForm" cssClass="form-inline">
                <div id="browseText" class="col-md-2">BROWSE</div>

                <div class="col-md-3">
                    <form:select cssClass="selectpicker" title="No Industries Selected" multiple="multiple"
                                 items="${industryList}" itemValue="id" itemLabel="industry" path="industryList">                                   
                    </form:select>
                    <form:errors class="help-block" path="industryList" cssClass="help-inline" />
                </div>

                <div class="col-md-4">
                    <form:select cssClass="selectpicker" title="No Areas of Expertise Selected" multiple="multiple"
                                 items="${expertiseList}" itemValue="id" itemLabel="expertise" path="expertiseList">                                   
                    </form:select>
                    <form:errors class="help-block" path="expertiseList" cssClass="help-inline" />
                </div>

                <div class="pull-right">
                    <button class="btn btn-success" type="submit">SEARCH</button>
                </div>
            </form:form>
        </div>

        <div class="col-md-12 body-content">
            <ul class="explore-list">
                <c:choose>
                    <c:when test="${founders.size() == 0}">
                        <h1>No records matched your selection</h1>
                    </c:when>
                    <c:otherwise>
                        <c:forEach var="founder" items="${founders}">
                            <li class="row">
                                <a href="<c:url value="/user/profile/${founder.mmuser.id}/"/>">
                                    <div class="col-md-3">
                                        <img class="exploreProfilePic" alt="${founder.firstName} ${founder.lastName}" src="<c:out value="${founder.linkedInPictureUrl}"/>" />
                                    </div>
                                    <div class="col-md-9">
                                        <span class="exploreDislpayName">${founder.firstName} ${founder.lastName}</span>
                                    </div>
                                </a>
                            </li>
                        </c:forEach>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</div>

<!-- Footer -->
<%@include file="../footer.jsp" %>

<script type="text/javascript">
    require(['dropdown']);
</script>