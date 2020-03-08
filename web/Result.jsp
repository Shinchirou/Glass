<%--
  Created by IntelliJ IDEA.
  User: bostasze
  Date: 3/8/20
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=(Double)request.getAttribute("result")%>
<%=request.getHeaderNames()%>
</body>
</html>
