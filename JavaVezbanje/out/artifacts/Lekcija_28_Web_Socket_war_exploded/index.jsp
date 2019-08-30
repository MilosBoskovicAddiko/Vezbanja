<%--
  Created by IntelliJ IDEA.
  User: Milos Boskovic
  Date: 26-Aug-19
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<span id="messageGoesHere"></span>
<script type="text/javascript">
    var ws = new WebSocket("ws://localhost:8080/Lekcija_28/hello");
    ws.onmessage = function (event) {
      var mySpan = document.getElementById("messageGoesHere");
      mySpan.innerHTML=event.data;
    };
</script>
</body>
</html>
