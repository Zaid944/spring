<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.css" rel="stylesheet">
    <title>List Todos</title>
</head>
    <body>
        <div class = "container">
        <div>Welcome to todos page ${name}</div>
<%--    <div>Your todos are ${todos}</div>--%>
        <table class = "table">
            <thead>
                <tr>
                    <th>id</th>
                    <th>Description</th>
                    <th>is Done?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${todos}" var = "todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success">Add Todo</a>
    <script src="webjars\bootstrap\5.1.3\js\bootstrap.js"></script>
    <script src="webjars\jquery\3.6.0\jquery.js"></script>
    </div>
    </body>
</html>