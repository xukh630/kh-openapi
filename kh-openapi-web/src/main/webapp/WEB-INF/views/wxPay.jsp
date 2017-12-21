<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String url = request.getAttribute("url").toString();


%>
<html>
<body>
<p><%=url%></p>
<script>
    setTimeout(function(){
        init();
    },5000);


    function init() {
        var a = document.createElement('a');
        a.setAttribute('href',"<%=url%>");
        a.click();
    }


</script>
</body>
</html>