<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 18.06.2018
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Question</title>
</head>
<body>
    <h1>Question #<%=request.getParameter("q_number")%></h1>
    <form method="post">
        <label><%=request.getParameter("f_operand")%> <%=request.getParameter("operator")%> <%=request.getParameter("s_operator")%></label>
        <input  name="user_result" type="number"/>
        <input type="submit"/>
    </form>
</body>
</html>
