<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="webjars\bootstrap\5.1.3\css\bootstrap.css" rel="stylesheet">
    <title>Add Todos</title>
</head>
<body>
<div class = "container">
    <h1>Enter Todo Details</h1>
    <form method = "post">
        Description <input type = "text" name = "description"/>
        <input type = "submit" class = "btn btn-success"/>
    </form>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.js"></script>
<script src="webjars\jquery\3.6.0\jquery.js"></script>
</body>
</html>