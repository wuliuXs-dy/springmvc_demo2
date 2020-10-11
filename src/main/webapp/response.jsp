<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>response</title>
    <script src="js/jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $('#btn').click(function () {
                alert("hello , ajax");
            });
        });
    </script>

</head>
<body>
    <a href="${pageContext.request.contextPath}/response/testString">testString</a>
    <hr>
    <a href="${pageContext.request.contextPath}/response/forward">测试转发</a> &nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/response/redirect">测试重定向</a>
    <hr>
    <button href="#" id="btn">测试ajax</button>
</body>
</html>
