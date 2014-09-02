<!-- Incudes File must be included in Header. Important Reads are needed on both ends -->


<!-- BOOTSTRAP! -->
<link rel="stylesheet" href="<c:url value="/resources/components/bootstrap-3.2.0/css/bootstrap.min.css" />" />
<link rel="stylesheet" href="<c:url value="/resources/components/bootstrap-multiselect/bootstrap-select.css" />" />

<!-- CSS -->
<link rel="stylesheet" href="<c:url value="/resources/css/mentormarketplace.css" />" type="text/css" />

<!-- Java Script Plug-Ins -->
<script src="<c:url value="/resources/components/requirejs/require.js" />" > </script>
<script src="<c:url value="/resources/js/require.config.js" />" > </script>
<script type="text/javascript">
    require.config({
        baseUrl: '${pageContext.request.contextPath}/resources/'
    });
    require(['jquery','bootstrap'], function($) {
    });
</script>