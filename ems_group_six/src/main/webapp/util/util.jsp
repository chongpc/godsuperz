<%@page pageEncoding="UTF-8" contentType="text/html; utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set value="${pageContext.request.contextPath}" var="path"/>

<script src="${path}/js/jquery-3.3.1.min.js"></script>
<script>
    function showtime() {
        var time=new Date();
        $("#showtime").html(time);
        setTimeout("showtime()",1000);
    }
</script>