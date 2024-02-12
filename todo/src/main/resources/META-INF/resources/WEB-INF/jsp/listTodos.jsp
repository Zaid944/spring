<%@ include file = "common/header.jspf" %>


<%@ include file = "common/navigation.jspf" %>

        <div class = "container">
        <div>Welcome to todos page ${name}</div>
<%--    <div>Your todos are ${todos}</div>--%>
        <table class = "table">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>is Done?</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items = "${todos}" var = "todo">
                    <tr>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE ${todo.id}</a> </td>
                        <td><a href="update-todo?id=${todo.id}" class="btn btn-success">UPDATE ${todo.id}</a> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success">Add Todo</a>

    </div>
<%@ include file = "common/footer.jspf" %>
