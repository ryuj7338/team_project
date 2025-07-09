<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>QnA 목록</title>
</head>
<body>
<h1>자주 묻는 질문 (FAQ)</h1>

<ul>
    <c:forEach var="qna" items="${qnas}">
        <li>
            <strong>Q.</strong> ${qna.title}<br/>
            <strong>A.</strong> ${qna.body}
        </li>
    </c:forEach>
</ul>

<hr/>

<p>※ 이 페이지는 테스트용 JSP입니다.</p>
</body>
</html>
