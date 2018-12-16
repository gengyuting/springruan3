<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/11/13
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    1.request获取的数据为：${requestScope.reqJsp}
    <br/>
    2.session获取的数据为：${sessionScope.sesJsp}
    <br/>
    3.application获取的数据为：${applicationScope.appJsp}
    <br/>
    4.model获取的List数据，先进行非空判断，然后遍历：
    <br/>
    <c:if test="${list!=null}">
        <c:forEach items="${list}" var="student">
            <br/>
                ${student.studentNo} &nbsp;${student.studentName} &nbsp;${student.loginPwd}
            <br/>
        </c:forEach>
    </c:if>
</body>
</html>
